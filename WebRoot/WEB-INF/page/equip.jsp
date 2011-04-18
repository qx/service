<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据库装备添加</title>
</head>
<body>
<%--<form action="/server_controller/equip_addfinish" method="post" enctype ="multipart/form-data">
<input type="text" name="tools_attack">:tools_attack</input></br>
<input type="text" name="tools_defense">:tools_defense</input></br>
<input type="text" name="tools_pic">:tools_pic</input></br>
<input type="text" name="tools_spe">:tools_spe</input></br>
<input type="text" name="tools_keep">:tools_keep</input></br>
<input type="text" name="tools_level">:tools_level</input></br>
<input type="submit" name="提交"/>
       <s:file name ="tools_path" label ="tools_pic(上传图片)" /> 
    <s:form action="/server_controller/equip_addfinish" method="post" enctype ="multipart/form-data"> 
</form>
--%>
    <s:form action="/server_controller/equip_addfinish" method="post" > 
        <s:textfield name ="tools_attack" label ="tools_attack" />        
        <s:textfield name ="tools_defense" label ="tools_defense" />        
        <s:textfield name ="tools_pic" label ="tools_pic" />        
        <s:textfield name ="tools_spe" label ="tools_spe" />        
        <s:textfield name ="tools_keep" label ="tools_keep" />        
        <s:textfield name ="tools_level" label ="tools_level" />        
        <s:submit /> 
    </s:form > 
</body>
</html>