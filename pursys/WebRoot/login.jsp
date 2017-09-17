<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
  <link href="css/style.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>login</title>
<meta name="keywords" content="H-ui.admin v2.5,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v2.3，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header background-color font">Login Now</div>
<div class="loginWraper background-color">

  <div id="loginform" class="loginBox background-color">
  <form class="form form-horizontal" action="login_login.action" method="post" name="login">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont white">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="user" name="username" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont white">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="pass" name="password" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>

      
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <button id="login" name="" class="btn btn-success radius size-L" value="" type="submit">&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;</button>
          <button id="cancel"  name="" class="btn btn-default radius size-L" value="">&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;</button>
        </div>
      </div>
      </form>
  </div>
</div>
<div class="footer">Copyright 1415 by 233</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" ></script>
 <script type="text/javascript" src="js/jquery.js"></script> 
<script>

</script>
</body>
</html>
