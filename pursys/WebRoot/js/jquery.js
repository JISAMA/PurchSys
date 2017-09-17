$(document).ready(function () {
    $("#good_add").click(function () {
        var gname=$("#itemName").val();
        var gdes=$("#itemDesp").val();
        var type
      $.each($("input[type='radio']"),function (i,item) {
          var checked = $(item).prop("checked");
          if(checked){
              type=$(item).attr("name");
          }
      })
//        var good={
//            "itemName":gname,
//            "itemDesp":gdes,
//            "itemType":type
//        }
        $.ajax({
            type:"POST",
            url:"item_Operate_addItem.action",
            data:{
                "name":gname,
                "desp":gdes,
                "type":type
            },
            datatype:"json",
            success:function () {
                alert("add success!");
            },
            error:function (jqXHR) {
            	alert("发生错误："+jqXHR.status);
            }

        });
    });
    
    $("#add_td").click(function () {
        $("#needTable").append(
            "<tr class='text-c'><td><input type=\"checkbox\" value=\"\" name=\"chose\"></td>\n" +
            "\t\t\t\t\t<td id='item-num'></td>\n" +
            "\t\t\t\t\t<td></td>\n" +
            "\t\t\t\t\t<td id='item-qty'></td>\n" +
            "\t\t\t\t</tr>"
        );
    });
    $("#delet_td").click(function () {
       $.each($("input[type='checkbox']"),function (i,item) {
           var checked=$(item).prop("checked");
           if(checked){
               $(item).parent().parent().remove();
           }

       })

    });
    
    
        $("#need_submit").click(function () {
        	var needlist=new Array();
            $.each($("input[type='checkbox']"),function (i,item) {
                if($(item).prop("checked")){
                    var need={};
                    need.itemNum=$(item).parent().parent().find("td:eq(1)").text();
                    need.qty=$(item).parent().parent().find("td:eq(3) input").val();
                    needlist.push(need);
                }
            })
            var i=JSON.stringify(needlist);
           alert(i);
            
            $.ajax({
                type:"POST",
                url:"save_Operate_addNeed.action",
                data:{
                	"needlist":i
                },
                datatype:"json",
                success:function () {
                    alert("success!");

                },
                error:function (jqXHR) {
                    alert("发生错误："+jqXHR.status);
                }
            })
        });
        
        
        
        
//        if ($.cookie("rmb") == "true") {
//            $("#rmb").attr("checked", true);
//            $("#user").val($.cookie("user"));
//            $("#pass").val($.cookie("pass"));
//        }
        
                

        $("#rmb").change(function () {
            if ($(this).attr("checked") == true) {
                var userName = $("#user").val();
                var passWord = $("#pass").val();
                $.cookie("rmb", "true", { expires: 7 }); // 存储一个带7天期限的 cookie
                $.cookie("user", userName, { expires: 7 }); // 存储一个带7天期限的 cookie
                $.cookie("pass", passWord, { expires: 7 }); // 存储一个带7天期限的 cookie
            }
            else {
                $.cookie("rmb", "false", { expires: -1 });
                $.cookie("user", '', { expires: -1 });
                $.cookie("pass", '', { expires: -1 });
            }
        });
        
        
//        $("#login").click(function () {
//            var password = $("#pass").val();
//            var username = $("#user").val();
//            console.log(password+username);
//
//            $.ajax({
//                type: "POST",
//                url: "login_login.action",
//                data: {
//                    "username": username,
//                    "password": password
//                },
//                dataType: "json",
//                success: function () {
//                    alert("login success");
//                },
//                error: function (XMLHttpRequest, textStatus, errorThrown) {
//                   location.href="//index.jsp";
//                }
//            })
//        });
//        
//        
        
        
    

});

