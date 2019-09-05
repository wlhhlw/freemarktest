<!DOCTYPE html>
<html lang="en">
<#assign baseurl=springMacroRequestContext.contextPath/>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="6">
    <caption>我的标题是:${baseurl}</caption>
    <tr>
        <td>name</td>
        <td>age</td>
        <td>sex</td>
    </tr>
    <#if userList??>
   <#list userList as user>
    <tr>
        <td >${user.name}</td>
        <td>${user.age}</td>
        <td>${user.sex}</td>
    </tr>
   </#list>
</table>
</#if>
<br>
<form action="/test" method="get">
    First name:<br>
    <input type="text" name="name" value="Mickey">
    <br>
    Last name:<br>
    <input type="text" name="age" value="18">
    <br>
    <input type="text" name="sex" value="男">
    <#if userJson??>
    <input type="hidden" name="users" value=${userJson}>
    </#if>
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>