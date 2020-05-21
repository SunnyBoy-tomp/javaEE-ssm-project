<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>login</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="resources/bootstrap-3.3.7-dist/css/signin.css" rel="stylesheet">
	<script src="resources/bootstrap-3.3.7-dist/js/jquery-3.4.1.min.js"></script>
  </head>

  <body>

    <div class="container">
		<div class="row ">
	      	<form class="form-signin" action="<%=request.getContextPath() %>/login2" method="post">
	        <h2 class="form-signin-heading" style="text-align:center;">登录</h2>
	        <label for="userName"  class="sr-only">Email address</label>
	       <!--  <input name="userName" id="userName"> -->
	        <input type="text" id="userName" name="userName" class="form-control" placeholder="账号" required autofocus>
	        <label for="inputPassword" class="sr-only">Password</label>
	        <input type="password" id="password" name="password" class="form-control" placeholder="密码" required>
	        <div class="checkbox">
	          <label>
	            <input type="checkbox" value="remember-me"> 记住密码
	          </label>
	        </div>
	        <input type="submit" class="btn btn-lg btn-primary btn-block"  value="登录">
	        <!-- <button class="btn btn-lg btn-primary btn-block" type="submit"name="btn" id="btn">登录</button> -->
      		</form>
		</div>
    </div> 
   </body>
</html>
