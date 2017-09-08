<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
    
    <title>My JSP 'index.jsp' starting page</title>
    <meta charset="utf-8">
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
  <div class="mt-20">
		<table id="stuTable" class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="40"><input name="" type="checkbox" value=""></th>
					<th width="80">学号</th>
					<th width="100">班级</th>
					<th width="100">姓名</th>
					<th width="80">性别</th>
					<th width="100">学费</th>
					<th width="150">联系方式</th>
					<th width="150">邮箱</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
				<tr class="text-c" class="con">
					<td><input name="" type="checkbox" value=""></td>
					<td class="stuId">14108102</td>
					<td class="classId">14108411</td>
					<td class="stuName">神经<!--<a href="javascript:;" onClick="picture_edit('图库编辑','picture-show.html','10001')"><img width="100" class="picture-thumb" src="pic/200x150.jpg"></a>--></td>
					<!--<td class="text-l"><a class="maincolor" href="javascript:;" onClick="picture_edit('图库编辑','picture-show.html','10001')">现代简约 白色 餐厅</a></td>
					<td class="text-c">标签</td>
					<td>2014-6-11 11:11:42</td>
					<td class="td-status"><span class="label label-success radius">已发布</span></td>-->
					<td class="stuSex">女</td>
					<td class="fee">6700</td>
					<td class="tel">17764591371</td>
					<td class="email">1325594220@qq.com</td>
					<td class="td-manage">
					 <a class="edit" style="text-decoration:none" class="ml-5 Edit"  title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
					 <a style="text-decoration:none" class="ml-5" onClick="student_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
  <script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> 
   <script type="text/javascript">
   $(document).ready(function(){
$.ajax({
		type:"GET",
		url:"hrPerson_Operate_findAllPerson.action",
		dataType:"json",
		success:function(data){
				for(var i=0;i<data.length;i++){
				var person=data[i];
				$("#stuTable").append("<tr class='text-c'><td><input name='' type='checkbox' value=''></td><td>"+person.empNum+"</td>"+
				      "<td>"+person.name+"</td>"+
				      "<td>"+person.managerEmpNum+"</td>"+
				      "<td>"+person.job+"</td>"+
				      "<td>"+person.department+"</td>"+
				      "<td>"+0+"</td>"+
				      "<td>"+0+"</td>"+
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
