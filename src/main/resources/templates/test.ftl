<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#if "admin"?contains("a")>
    admin
<#else >
    not min
</#if>
<#assign name="admin">
${name?uncap_first}
${name?upper_case}
${name?cap_first}
${name?lower_case}
<#assign timestamp=1534414202000>
${timestamp?number_to_date?string("yyyy-MM-dd")}
</body>
</html>