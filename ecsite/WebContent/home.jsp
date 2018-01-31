<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name ="description" content=""/>
<meta name ="keywords" content=""/>
<title>Home画面</title>

<style type="text/css">
/* ==tag layout==*/

body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#A7F1FF;
	background-color:#663300;
}

table{
	text-alone:center;
	margin:0 auto;
}

/* id layout */
#top{
	width:780px;
	margin:30px auto;
	border:1px solid #A7F1FF;
}

#header{
	width:100%;
	height:80px;
	background-color:skyblue;
}

#main{
	width:100%;
	height:80px;
	background-color:skyblue;
	crear:both;
}

#footer{
	width:100%;
	height:80px;
	background-color:skyblue;
	clear:both;
}

#text-center {
	display:inline-block;
	text-align:center;
	}}

</style>



</head>

<body>

	<div id="header">
	<div id ="pr">
	</div>
</div>

	<div id ="main">
	<div id ="top">
	<p>Home</p>
	</div>

	<div id="text-center">
	<s:form action="HomeAction">
	<s:submit value="商品購入"/>
	</s:form>

	<s:if test="#session.id != null">
	<p>ログアウトする場合は
	<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
</s:if>

	</div>

	</div>

	<div id ="footer">
	<div id ="pt">

	</div>
	</div>


</body>
</html>