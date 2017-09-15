<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/views/common.jsp"%>
<title>订单管理</title>
</head>
<body>

	<table id="dg" title="订单管理" class="easyui-datagrid"
		style="width: 100%; height: 540px" url="/order/getOrder"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="customerName" width="50">客户名称</th>
				<th field="customerTel" width="50">客户电话</th>
				<th field="customerIdCard" width="50">客户身份证</th>
				<th field="roomTypeId" width="50">房间类型</th>
				<th field="roomLevelId" width="50">房间档次</th>
				<th field="arriveTime" width="50">到店时间</th>
				<th field="priority" width="50">优先级</th>
				<th field="state" width="50">状态</th>
				<th field="orderTime" width="50">订单日期</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newOrder()">新增订单</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editOrder()">订单信息修改</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyOrder()">删除</a>
	</div>

	<div id="dlg" class="easyui-dialog" style="width: 400px" closed="true"
		 buttons="#dlg-buttons">
		<form id="fm" method="post" novalidate
			style="margin: 0; padding: 20px 50px">
			<input type="hidden" name="customerId">
			<div
				style="margin-bottom: 20px; font-size: 14px; border-bottom: 1px solid #ccc">
				订单信息</div>
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
		var url;
		function newOrder() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$('#dlg').dialog('open').dialog('center').dialog('setTitle',
						'信息详情');
				$('#fm').form('load', row);
				url = '/message/hasRead?id=' + row.msgId;
			}
		}
		function saveOrder() {
			$('#fm').form('submit', {
				url : url,
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
						$('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
	</script>
</body>
</html>