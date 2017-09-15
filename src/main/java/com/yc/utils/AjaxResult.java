package com.yc.utils;

//ajax返回值：{\"success\":false,\"msg\":\"出现异常：" + e.getMessage() + "\"}"
public class AjaxResult {
	
	private boolean success = true;// 默认成功
	private String message = "操作成功";

	public AjaxResult() {

	}

	public AjaxResult(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
