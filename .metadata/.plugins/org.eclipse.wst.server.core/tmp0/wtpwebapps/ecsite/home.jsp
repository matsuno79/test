<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>


<!-- スライドショー  -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(document).ready(function(){
      $('.abc').bxSlider({
    	  auto:true,
    	  mode:'fade',
    	  speed:1000,
    	  slideWidth:400
      });
    });

  </script>

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


四角い枠
		#top {
		   width:780px;
		   margin:20px auto;
		   border:1px solid #333;

		   			margin:0 auto;
			display:block;
		}



		#header {
		   width: 100%;
		   height: 35px;
		   background-color: #99FFCC;
}

 .logo{
	padding-left:10px;
	color:#D2691E;
	font-size:20px
	line-height:35px;

}


header ul{
	float:right;
	line-height:25px;
}

header ul li{
		   float:left;
		   padding-right:20px;
		   list-style:none;

		   font-size:10px;
		}


		#main {
		clear:both;

		   width: 100%;
		   height: 500px;
		   text-align: center;
		}

.abc{
			width: 500px;
			margin-top:100px;

			overflow:hidden;
			margin:0 auto;

}


$('.abc').bxSlider();




.abc ul li{
	display:block;
	margin:0 auto;

				width: 500px;
			margin-top:100px;
			position:relative;
}

.main-container{
	width:97%;
	margin:0 auto;

	/*トップ画の隙間*/
	margin-top:400px;
}




#left{
	float:left;
	background-color:skyblue;
	width:20%;
	height:600px;
	margin-bottom:40px;
}


#right{
	float:left;
	background-color:lightblue;
	width:78%;
	height:600px;
	margin-bottom:40px;
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
		<div class="logo">タイトル</div>


			<ul class="buildFrame">
			<li><a href="/about/">メニュー1</a></li>
			<li><a href="/menu2/">メニュー2</a></li>
			<li><a href="/menu3/">メニュー3</a></li>
			<li><a href="/menu4/">メニュー4</a></li>

			</ul>

	</header>








	<div id="header">
	 	<div id="pr">
		</div>
	</div>


			<div id="top">

			<p>Home</p>

<!-- スライドショー		-->
<ul class="abc">
    <li><img src="./img/image1.jpg" alt="画像だよ1"></li>
    <li><img src="./img/image1.jpg" alt="画像だよ2"></li>
    <li><img src="./img/image1.jpg" alt="画像だよ3"></li>

		</ul>



<div class="main-container">

<div id="left">



			<p>Login</p>

		<div>
			<h3>商品を購入する際にはログインをお願いします。</h3>
			<s:form action="LoginAction">
				<s:textfield name="loginUserId"/>
				<s:password name="loginPassword"/>
				<s:submit value="ログイン"/>
			</s:form>
			<br/>
			<div id="text-link">
				<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction" />'>こちら</a></p>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
			</div>
		</div>


</div>
</div>
</div>


<div id="right"></div>










		<div id="text-center">

		<!--
			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>
			  -->




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