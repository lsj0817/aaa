<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
    <script type="text/javascript" src="/static/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript">
        function toPage(pageIndex) {
            $.ajax({
                type: "post",
                url: "/selectStudent",
                data: {"pageIndex": pageIndex, "flag": 1},
                dataType: "text",
                async: "true",
                success: function (data) {
                    $('#myDiv').html(data);
                }
            });
        }

        function turnPage() {
            $.ajax({
                type:"post",
                url:"/selectStudent",
                data:{"pageIndex":$('#go').val() >= $('#pageCount').val()?$('#pageCount').val():$('#go').val() && $('#go').val()<=1?1:$('#go').val(),"flag":1},
                dataType:"text",
                async:"true",
                success:function (data) {
                    $('#myDiv').html(data);
                }
            });
        }
        function deleteall(){
            let check = $('[name="checkedOne"]:checked');
            let ids = "";
            for (let i = 0; i < check.length; i++) {
                ids += check[i].value + ",";
            }
            ids = ids.substr(0,ids.length-1)
            $.ajax({
                type:"post",
                url:"/deleteBatch",
                data:{"ids":ids},
                dataType:"text",
                async:"true",
                success:function (data) {
                    alert(data);
                    window.location.reload();
                }
            });
        }
        function search(pageIndex) {
            let sname = $('#sname').val();
            let sex = $('#sex').val();
            let cid = $('#cid').val();
            $.ajax({
                type: "post",
                url: "/selectStudent",
                data: {"pageIndex": pageIndex,"sname":sname,"sex":sex,"cid":cid ,"flag": 1},
                dataType: "text",
                async: "true",
                success: function (data) {
                    $('#myDiv').html(data);

                }
            });
        }
    </script>
</head>
<body style="margin-left: 100px">
<h1 style="margin-left: 150px">????????????</h1>
<table  style="margin-left: -50px">
    <tr>
        <td>?????????<input type="text" id="sname" ></td>
        <td>??????<select id="sex" >
                <option value="">??????</option>
                <option value="1">???</option>
                <option  value="2">???</option>
            </select></td>
        <td>
            ???????????????<select id="cid">
                <#list clazzes as clazz>
                    <option value="${clazz.cid}">${clazz.cname}</option>
                </#list>
            </select><br/>
        </td>


        <td><input type="button" value="??????" onclick="search()"/></td>
        <td><input type="button" value="????????????" onclick="deleteall()"/></td>
    </tr>
</table>
<div id="myDiv">
<#include "page_list.ftl"/>
</div>
</body>

</html>
