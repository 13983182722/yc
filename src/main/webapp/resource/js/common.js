//获取一方对象的属性值
function nameFormatter(value, row, index) {
	return value ? value.name || value.realName : "";
}

// 处理状态
function stateFormatter(value, row, index) {
	return value == 1 ? "正常" : "<font color='red'>禁用</font>";
}

//信息阅读状态
function msgStateFormatter(value, row, index) {
	return value == 1 ? "已读" : "<font color='red'>未读</font>";
}

// 因为datagrid的load方法需要json查询参数:serializeJSON只能被表单调用
$.fn.serializeJSON = function() {
	var params = {};
	var formArray = $(this).serializeArray();
	for (var i = 0; i < formArray.length; i++) {
		// console.debug(formArray[i].name);
		// console.debug(formArray[i].value);
		params[formArray[i].name] = formArray[i].value;
	}
	return params;
}

//处理角色
function roleFormatter(value, row, index) {
	if(value==0){
		return "新注册人员";
	}
	if(value==1){
		return "超级管理员";
	}
	if(value==2){
		return "财务人员";
	}
	if(value==3){
		return "财务总监";
	}
	if(value==4){
		return "核心企业操作员";
	}
	if(value==5){
		return "管理员";	
	}
	
}
