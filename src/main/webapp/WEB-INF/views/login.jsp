<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>23cxy后台管理系统登录</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" type="text/css" href="/resource/css/bootstrap.css">

<link rel="stylesheet" type="text/css" href="/resource/css/theme.css">
<link rel="stylesheet" href="/resource/font-awesome/css/font-awesome.css">

<script src="/resourcejs/jquery-1.11.0.min.js" type="text/javascript"></script>

<!-- Demo page code -->

<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

.brand .first {
	color: #ccc;
	font-style: italic;
}

.brand .second {
	color: #fff;
	font-weight: bold;
}
</style>

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>

<body class="">
	<!--<![endif]-->

	<div class="row-fluid">
		<div class="dialog">
			<h1 style="color: #666; margin: 100px 0 40px 0; text-align: center">后台管理系统</h1>
			<div class="block">
				<p class="block-heading">登录</p>
				<div class="block-body">
					<form>
						<label>用户名</label> <input type="text" class="span12"> <label>密码</label>
						<input type="password" class="span12"> <input
							class="btn btn-primary pull-right" value="登录"
							style="display: inline-block; width: 40%; margin-left: 2%">
						<input class="btn btn-primary pull-right" value="重置"
							style="display: inline-block; width: 40%">
						<div class="clearfix"></div>
					</form>
				</div>
			</div>
			<p class="pull-right" style="">
				<a href="#" target="blank">忘记密码？</a>
			</p>
		</div>
	</div>


	<script src="lib/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
		});
	</script>

</body>
</html>