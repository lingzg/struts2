<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<datalist></datalist>

<title>hello</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>模拟修改客户</h1>
    <s:form action="/struts2/customer/update" method="post">
    	<s:textfield name="customer.name" label="姓名"/>
    	<s:password name="customer.password" label="密码" showPassword="true"/>
    	<s:textarea name="customer.desc" cols="30" rows="5" label="简介"/>
    	<s:checkbox name="customer.marry" label="是否已婚" labelposition="left"/>
    	<s:radio name="customer.sex" list="#{'M':'男','F':'女' }" label="性别"/>
    	<s:radio name="customer.sex" list="sexes" listKey="code" listValue="name" label="性别"/>
    	<s:checkboxlist name="customer.travelCities" list="#{'beijing':'北京','shanghai':'上海','guangzhou':'广州',
    		'shenzhen':'深圳','qingdao':'青岛','chongqing':'重庆' }" label="旅游过的城市"/>
    	<s:checkboxlist name="customer.travelCities" list="cities" listKey="code" listValue="name" label="旅游过的城市"/>
    	<s:select name="customer.home" list="#{'beijing':'北京','shanghai':'上海','guangzhou':'广州',
    		'shenzhen':'深圳','qingdao':'青岛','chongqing':'重庆' }" label="家乡" headerKey="-1" headerValue="请选择"/>
    		<s:select name="customer.home" list="cities" listKey="code" listValue="name" label="家乡" headerKey="" headerValue="请选择"/>
    </s:form>
  </body>
</html>
