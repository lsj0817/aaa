<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<body>

<table border="1" cellspacing="0">
  <tr >
    <td><input type="checkbox" id="checkAll" onclick="checkAll()"/>选择</td>
    <td>学号</td>
    <td>姓名</td>
    <td>性别</td>
    <td>年龄</td>
    <td>住址</td>
    <td>班级</td>
    <td>操作
      <button ><a href="/selectClazz">添加用户</a></button>
    </td>
  </tr>
  <#list students as student >
    <tr>
      <td><input type="checkbox" name="checkedOne" value="${student.sid}" /></td>
      <td>${student.sid}</td>
      <td>${student.sname}</td>
      <td>${student.sex}</td>
      <td>${student.age}</td>
      <td>${student.address}</td>
      <td>${student.clazz.cname}</td>
      <td>
        <a href="/getStudentById?sid=${student.sid}">修改</a>
        <a href="/deleteStudent?sid=${student.sid}">删除</a>
      </td>
    </tr>
  </#list>
</table>
<#include "CommonPage.ftl"/>

</body>
<script>
  //全选
  //function checkAll() {
  $('#checkAll').click(function(){
    //它被选中 下面的单选都被选中
    if(this.checked==true){
      $('[name="checkedOne"]').attr("checked",true);
    }else{
      $('[name="checkedOne"]').attr("checked",false);
    }


  })



</script>
</html>
