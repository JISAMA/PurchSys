<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <input type="text" id="click">
   <p id="return"></p>
   
   <script type="text/javascript">
   $(document).ready(function(){
$.ajax({
		type:"GET",
		url:"item_Operate_findAllItems.action",
		dataType:"json",
		success:function(data){
				for(var i=0;i<data.length;i++){
				var item=data[i];
				$("#itemTable").append("<tr class='text-c'><td><input name='' type='checkbox' value=''></td><td>"+item.itemNum+"</td>"+
				      "<td>"+item.itemName+"</td>"+
				      "<td>"+item.itemDesp+"</td>"+
				      "<td>"+item.itemType+"</td>"+
				      "<td><a style='text-decoration:none' class='Edit ml-5' title='编辑'><i class='Hui-iconfont'>&#xe6df;</i></a>"+
					 "<a style='text-decoration:none' class='ml-5 deleteClick' title='删除'><i class='Hui-iconfont'>&#xe6e2;</i></a></td></tr>");
				}
		},
		error:function(jqXHR){
			alert("发生错误："+jqXHR.status);
		}
	});
	});
   </script>
  </body>
</html>
