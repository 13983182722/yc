<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/views/common.jsp"%>
<title>楼层管理</title>
</head>
<body>

	<table id="dg" title="楼层管理" class="easyui-datagrid"
		style="width: 100%; height: 540px" url="/floor/getFloor"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="floorName" width="50">楼层名称</th>
				<th field="notes" width="50">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newFloor()">新增楼层</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editFloor()">修改楼层</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyFloor()">删除楼层</a>
	</div>

	<div id="dlg" class="easyui-dialog" style="width: 400px" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post" novalidate
			style="margin: 0; padding: 20px 50px">
			<input type="hidden" name="floorId">
			<div
				style="margin-bottom: 20px; font-size: 14px; border-bottom: 1px solid #ccc">
				楼层信息</div>
			<table>
				<tr>
					<td>楼层名称</td>
					<td><input name="floorName" class="easyui-validatebox"
						required="true"></td>
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
			iconCls="icon-ok" onclick="saveFloor()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')"
			style="width: 90px">关闭</a>
	</div>


	<script type="text/javascript">
		var url;
		function newFloor() {
			$('#dlg').dialog('open').dialog('center')
					.dialog('setTitle', '新增楼层');
			$('#fm').form('clear');
			url = '/floor/save';
		}
		function editFloor() {
			var row = $('#dg').datagrid('getSelected');
			if (row == null) {
				$.messager.show({
					title : '错误信息',
					msg : '请先选择一行进行操作！'
				});
				return;
			}

			if (row) {
				$('#dlg').dialog('open').dialog('center').dialog('setTitle',
						'修改楼层');
				$('#fm').form('load', row);
				url = '/floor/save';
			}
		}
		function saveFloor() {
			$('#fm').form('submit', {
				url : "/floor/save",
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
							msg : '操作成功!'
						});
						$('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		function destroyFloor() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('确认删除', '你确定删除楼层名称为   <font color="red">'
						+ row.floorName + "</font> 的楼层吗？", function(r) {
					if (r) {
						$.post('/floor/del', {
							id : row.floorId
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