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
    <h1>演示OGNL表达式</h1>
    <h1>1. 基本属性</h1>
    <h2>ID:<s:property value="id"/></h2>
    <h2>NAME:<s:property value="name"/></h2>
    
    <h1>2. 实体对象</h1>
    <h2>用户名:<s:property value="user.userName"/></h2>
    <h2>密码:<s:property value="user.password"/></h2>
    
    <h1>3. 数组和集合</h1>
    <h2>数组中的城市:<s:property value="cityArray[1]"/></h2>
    <h2>集合中的城市:<s:property value="cityList[1]"/></h2>
    
    <h1>4. Map</h1>
    <h2>Map中的城市人口:<s:property value="cityMap.beijing"/></h2>    
    
    <h1>5. 访问时运算</h1>
    <h2>My Name: <s:property value="'My name is '+name"/></h2>
    <h2>去哪: <s:property value="cityArray[1]+',我来了'"/></h2>
    
    <h1>6. 访问时调用其他方法</h1>
    <h2>My Name: <s:property value="name.toUpperCase()"/></h2>
    
    <h1>7. 创建集合</h1>
    <h2>创建集合: <s:property value="{'a','b','c'}"/></h2>
    <h2>集合类型: <s:property value="{'a','b','c'}.getClass().getName()"/></h2>
    
    <h1>8. 创建Map</h1>
    <h2>创建Map: <s:property value="#{1:'b',2:'c'}"/></h2>
    <h2>Map类型: <s:property value="#{1:'b',2:'c'}.getClass().getName()"/></h2>
    
    <h1>1. 观察ValueStack结构</h1>
    <h2><s:debug/></h2>
    
    <h1>2. 栈顶</h1>
    <h2>Stack Top: <s:property/></h2>
    
    <h1>3. 输出context对象中的数据</h1>
    <h2>context: <s:property value="#action.user.userName"/></h2>
    
    <h1>4. 遍历集合</h1>
    <h2><s:iterator value="emps">
    	员工：<s:property value="name"/>, 
    	工资为<s:property value="salary"/><br/>
    </s:iterator></h2>
    
    <h1>5. 循环数字</h1>
    <h2><s:iterator begin="from" end="to" var="p">
    	<s:property value="#p"/><br/>
    </s:iterator></h2>
    
  </body>
</html>
