//获取一方对象的属性值
function nameFormatter(value, row, index) {
	return value ? value.name || value.realName : "";
}

// 处理状态
function stateFormatter(value, row, index) {
	return value == 1 ? "正常" : "<font color='red'>禁用</font>";
}

//客户等级
function levelFormatter(value, row, index) {
	return value == 1 ? "普通客户" : "贵宾";
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

