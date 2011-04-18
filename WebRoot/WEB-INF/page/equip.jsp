<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据库装备添加</title>
</head>
<body>
<form action="/server_controller/equip_addfinish" method="post" >
<input type="text" name="tools_attack">:tools_attack</input></br>
<input type="text" name="tools_defense">:tools_defense</input></br>
<input type="text" name="tools_pic">:tools_pic</input></br>
<input type="text" name="tools_spe">:tools_spe</input></br>
<input type="text" name="tools_keep">:tools_keep</input></br>
<input type="text" name="tools_level">:tools_level</input></br>
<input type="submit" name="提交"/>
</form>
</body>
</html>