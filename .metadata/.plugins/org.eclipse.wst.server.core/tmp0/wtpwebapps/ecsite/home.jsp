<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>Home画面</title>
	<style type="text/css">

			   /*  #99FFCC 水色
			 	   #D2691E 茶色

			   */



		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#D2691E;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========TEMPLATE LAYOUT======== */
		#top {
		   width:780px;
		   margin:20px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 35px;
		   background-color: #99FFCC;
}

header ul{
	float:right;
	line-height:25px;
}

header ul li{
		   float:left;
		   padding-right:20px;
		   list-style:none;

		   font-size:15px;
		}

		#main {
		   width: 100%;
		   height: 500px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 20px;
			background-color: #99FFCC;
			clear:both;
		}

		#text-center {
			display: inline-block;
			text-align: center;
		}
	</style>
</head>
<body>



<header>
		<div class="head buildFrame">

		</div>
		<nav id="global">
			<ul class="buildFrame">
			<li><a href="/about/">メニュー1</a></li>
			<li><a href="/about-ticket/">メニュー2</a></li>
			<li><a href="/about-artist/">メニュー3</a></li>
			<li><a href="/about-map/">メニュー4</a></li>

			</ul>
		</nav>
	</header>






	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>

		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>
			<s:if test="#session.id != null">
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
		</div>
	</div>
	<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>