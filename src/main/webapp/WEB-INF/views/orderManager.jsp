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

	<table id="dg" title="未读消息" class="easyui-datagrid"
		style="width: 100%; height: 540px" url="/message/getNoRedMsg"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="msgTitle" width="30%">消息标题</th>
				<!-- <th field="msgContent" width="50">消息内容</th> -->
				<th field="createTime" width="50">创建日期</th>
				<th field="state" formatter="msgStateFormatter" width="50">查看状态</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newUser()">查看详情</a>
	</div>

	<div id="dlg" class="easyui-dialog" style="width: 550px; height: 450px"
		closed="true" buttons="#dlg-buttons">
		<form id="fm" method="post" novalidate
			style="margin: 0; padding: 20px 50px">
			<div
				style="margin-bottom: 20px; font-size: 14px; border-bottom: 1px solid #ccc">通知详情</div>
			<div style="margin-bottom: 10px">
				<input name="msgTitle" class="easyui-textbox" label="消息标题:"
					readonly="readonly" style="width: 400px">
			</div>
			<div style="margin-bottom: 10px">
				<input name="createTime" class="easyui-textbox" label="创建日期:"
					readonly="readonly" style="width: 400px">
			</div>
			<div style="margin-bottom: 10px">
				<input name="msgContent" class="easyui-textbox" data-options="multiline:true" label="消息内容:"
					style="width: 400px; height: 200px">
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveUser()" style="width: 90px">标记已读</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')"
			style="width: 90px">关闭</a>
	</div>
	<script type="text/javascript">
		var url;
		function newUser() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$('#dlg').dialog('open').dialog('center').dialog('setTitle',
						'信息详情');
				$('#fm').form('load', row);
				url = '/message/hasRead?id=' + row.msgId;
			}
		}
		function saveUser() {
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