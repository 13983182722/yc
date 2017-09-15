<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/views/common.jsp"%>
<title>客户管理</title>
</head>
<body>

	<table id="dg" title="顾客管理" class="easyui-datagrid"
		style="width: 100%; height: 540px" url="/customer/getCustomer"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<!-- <th field="customerId" width="50">客户编号</th> -->
				<th field="customerName" width="50">客户名称</th>
				<th field="customerTel" width="50">客户电话</th>
				<th field="customerIdCard" width="50">客户身份证</th>
				<th field="level" formatter="levelFormatter" width="50">客户身份</th>
				<th field="creatTime" width="50">创建时间</th>
				<th field="notes" width="50">备注</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newUser()">新增用户</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editUser()">用户信息修改</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
		<form id="searchForm" action="/customer/getCustomer" method="post">
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
			<input type="hidden" name="customerId">
			<div
				style="margin-bottom: 20px; font-size: 14px; border-bottom: 1px solid #ccc">
				员工信息</div>
			<table>
				<tr>
					<td>客户姓名</td>
					<td><input name="customerName" class="easyui-validatebox"
						required="true"></td>
				</tr>
				<tr>
					<td>客户电话</td>
					<td><input name="customerTel"></td>
				</tr>
				<tr>
					<td>客户身份证</td>
					<td><input name="customerIdCard"></td>
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
			iconCls="icon-ok" onclick="saveUser()" style="width: 90px">保存</a> <a
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
		function newUser() {
			$('#dlg').dialog('open').dialog('center')
					.dialog('setTitle', '新增客户');
			$('#fm').form('clear');
			url = '/customer/save';
		}
		function editUser() {
			var row = $('#dg').datagrid('getSelected');
			if (row == null) {
				$.messager.show({
					title : '错误信息',
					msg : '请先选择一个用户进行操作！'
				});
				return;
			}

			if (row) {
				$('#dlg').dialog('open').dialog('center').dialog('setTitle',
						'修改客户');
				$('#fm').form('load', row);
				url = '/customer/save';
			}
		}
		function saveUser() {
			$('#fm').form('submit', {
				url : "/customer/save",
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
		function destroyUser() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('确认删除', '你确定删除客户姓名为 <font color="red">'
						+ row.customerName + "</font> 的用户吗？", function(r) {
					if (r) {
						$.post('/customer/del', {
							id : row.customerId
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