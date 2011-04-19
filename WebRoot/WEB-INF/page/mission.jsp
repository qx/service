<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>技能添加界面</title>
</head>
<body>
<form action="/server_controller/mission_addfinish" method="post" >
<input type="text" name="mission_id">:mission_id(任务名)</input></br>
<input type="text" name="mission_level">:mission_level(任务等级)</input></br>
<input type="text" name="mission_exp">:mission_exp(经验值)</input></br>
<!-- <input type="text" name="mission_visible">:mission_visible(0,禁用,1启用.默认启用)</input></br> -->
<input type="submit" name="提交"/>
</form>
</body>
</html>