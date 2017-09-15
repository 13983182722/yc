<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/views/common.jsp"%>
<title>房间管理</title>
</head>
<body>

	<table id="dg" title="房间管理" class="easyui-datagrid"
		style="width: 100%; height: 540px" url="/room/getRoom"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<!-- <th field="room_id" width="50">房间编号</th> -->
				<th field="roomName" width="50">房间编号</th>
				<th field="floorId" width="50">房间编号</th>
				<th field="roomTypeId" width="50">房间类型名称</th>
				<th field="notes" width="50">备注</th>
				
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newRoom()">新增房间</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editRoom()">房间信息修改</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyRoom()">删除</a>
		<form id="searchForm" action="/room/getRoom" method="post">
			姓名关键字:<input id="keyName" name="keyName" placeholder="支持模糊查询"
				size="15" />
			<!-- &nbsp;&nbsp;&nbsp;录入时间：从<input name="beginDate"
				class="easyui-datebox" size="12" /> 到<input name="endDate"
				class="easyui-datebox" size="12" /> -->
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-search" onclick="find()">查询</a>
			<button type="reset" href="javascript:void(0)"
				class="easyui-linkbutton" iconCls="icon-reload" type="reset">清空</button>
		</form>
	</div>

	<div id="dlg" class="easyui-dialog" style="width: 400px" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post" novalidate
			style="margin: 0; padding: 20px 50px">
			<input type="hidden" name="roomId">
			<div
				style="margin-bottom: 20px; font-size: 14px; border-bottom: 1px solid #ccc">
				员工信息</div>
			<table>
				<tr>
					<td>客户姓名</td>
					<td><input name="roomName" class="easyui-validatebox"
						required="true"></td>
				</tr>
				<tr>
					<td>客户电话</td>
					<td><input name="roomTel"></td>
				</tr>
				<tr>
					<td>客户身份证</td>
					<td><input name="roomIdCard"></td>
					</td>
				</tr>
				<tr>
					<td>客户身份</td>
					<td><input type="radio" name="level" value="1">普通客户 <input
						type="radio" name="level" value="2">贵宾</td>
				</tr>
				<tr>
					<td>备注</td>
					<td><input name="notes"></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveRoom()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')"
			style="width: 90px">关闭</a>
	</div>


	<script type="text/javascript">
		/* $('#cc').combobox({
			url : '/role/getRole',
			valueField : 'roleId',
			textField : 'description'
		}); */

		var url;
		function newRoom() {
			$('#dlg').dialog('open').dialog('center')
					.dialog('setTitle', '新增客户');
			$('#fm').form('clear');
			url = '/room/save';
		}
		function editRoom() {
			var row = $('#dg').datagrid('getSelected');
			if (row == null) {
				$.messager.show({
					title : '错误信息',
					msg : '请先选择一个房间进行操作！'
				});
				return;
			}

			if (row) {
				$('#dlg').dialog('open').dialog('center').dialog('setTitle',
						'修改客户');
				$('#fm').form('load', row);
				url = '/room/save';
			}
		}
		function saveRoom() {
			$('#fm').form('submit', {
				url : "/room/save",
				onSubmit : function() {
					return $(this).form('validate');
				},
				success : function(result) {
					var result = eval('(' + result + ')');
					if (result.errorMsg) {
						$.messager.show({
							title : 'Error',
							msg : result.errorMsg
						});
					} else {
						$('#dlg').dialog('close'); // close the dialog
						$.messager.show({
							title : '成功',
							msg : '更新客户信息成功!'
						});
						$('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		function destroyRoom() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('确认删除', '你确定删除房间名称为 <font color="red">'
						+ row.roomName + "</font> 的房间吗？", function(r) {
					if (r) {
						$.post('/room/del', {
							id : row.roomId
						}, function(result) {
							if (result.success) {
								$('#dg').datagrid('reload'); // reload the user data
							} else {
								$.messager.show({ // show error message
									title : 'Error',
									msg : result.errorMsg
								});
							}
						}, 'json');
					}
				});
			}
		}

		function find() {
			$('#dg').datagrid('load', $('#searchForm').serializeJSON());
		}
	</script>
</body>
</html>