<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>修改学生信息</title>

</head>
<body>

<div>
    <form action="/updateStudent" method="post">
        <h1>修改学生信息</h1>
        <input name="sid" type="hidden" value="${student.sid}"><br>
        学生姓名：<input  type="text" value="${student.sname}" name="sname"><br>
        性别<input type="radio" name="sex" checked="checked" value="1"/>男
        <input type="radio" name="sex" value="2"/>女<br/>

        年龄:<input type="text" value="${student.age}" name="age"><br>
        家庭住址：<input type="text" value="${student.address}" name="address"><br>
        所在班级：<select name="cid">
            <#list clazzes as clazz>
                <option value="${clazz.cid}">${clazz.cname}</option>
            </#list>
        </select><br/>
        <button  type="submit">提交</button>
    </form>
</div>

</body>
</html>
