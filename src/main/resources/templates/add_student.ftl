<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>添加学生信息</title>
</head>

<body>

<div>
  <form method="post" action="/addStudent">
    学习姓名：<input type="text" name="sname"><br>
    学生性别：<input  type="radio" checked="checked" value="1" name="sex">男
    <input  type="radio"  value="2" name="sex">女<br>
    学生年龄：<input  type="text"  name="age"><br>
    家庭住址：<input  type="text"  name="address"><br>
    班级：<select name="cid">
      <#list clazzs as clazz>
        <option value="${clazz.cid}">${clazz.cname}</option>
      </#list>
    </select><br/>
    <button  type="submit">保存</button>
  </form>
</div>

</body>
</html>

