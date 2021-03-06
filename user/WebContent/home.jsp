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



		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========TEMPLATE LAYOUT======== */
		#top {
		   width:780px;
		   margin:30px auto;
		  /* border:1px solid #333;*/
		}

		#header {
		   width: 100%;
		   height: 40px;
		   background-color: black;
		}


/*左上タイトル*/

 .logo{	float:left;
 		width:100px;
		padding-left:10px;
		color:white;
		line-height:35px;
}


/*右上メニューの配置*/

header ul{
	float:right;
	line-height:25px;
}

header ul li{
	float:left;
	padding-right:20px;
	ist-style:none;
	font-size:10px;
		}



		#main {	clear:both;
		   width: 100%;
		   height: 100%;
		   text-align: center;
		}



.abc{
		width: 100％;
		margin-top:100px;
		overflow:hidden;
		margin:0 auto;
    	/*position:relative;*/
}


.abc_wrap {
	width:100%;
	margin:0 auto;
}




.main-container{
	width:97%;

	margin:0 auto;

	/*headerとmainの隙間*/
	margin-top:50px;

	margin-bottom:30px;
}



		#footer {
			width: 100%;
			height: 40px;
			background-color: black;
			clear:both;
            text-align:center;
			line-height:30px;
		}

        /*「商品購入」ボタン*/
		#text-center {
			display: inline-block;
			text-align: center;
		}
	</style>
</head>




<body>

    <header>



	<div id="header">
	 	<div id="pr">
		</div>
	</div>





	<div id="main">
		<div id="top">
			<p>Home</p>

</div>



			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>
			<s:if test="#session.id != null">
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
			<s:if test="#session.masterId != null">
				<a href='<s:url action="LogoutAction"/>'>ログアウト</a>
			</s:if>
		</div>


	<div id="footer">
        2018
	 	<div id="pr">
		</div>
	</div>


</body>
</html>