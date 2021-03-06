<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">


    <!-- スライドショー
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

 -->


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

		<div class="logo">
	<!-- 左上　★を押したらhomeへ -->
	<a href="http://localhost:8080/ecsite/"><img src="img/hosi.png" alt="homeへ戻る"></a>

</div>
			<ul class="buildFrame">
			<li><a href="http://localhost:8080/ecsite/guide.jsp">ご利用ガイド</a></li>
			<li><a href="http://localhost:8080/ecsite/login.jsp">ログイン</a></li>
			<li><a href="http://localhost:8080/ecsite/buyItemConfirm.jsp">カート</a></li>
			<li><a href="/menu4/">お問い合わせ</a></li>

        <!-- ツイッターとフェイスブックアイコン-->
		<li><a href="http://twitter.com" target="_blank" class="f_right face"><span><img src="img/btn_twit.gif" alt="ツイッター"  /></span></a></li>
		<li><a href="https://www.facebook.com" target="_blank" class="f_right twit"><img src="img/btn_face.gif" alt="フェイスブック" /></a></li>



			</ul>
</header>

	<div id="header">
	 	<div id="pr">
		</div>
	</div>





	<div id="main">
		<div id="top">
			<p>Home</p>

</div>

<img src="img/image1.jpg" alt="画像だよ1">




            <!-- スライドショー
<div class="abc_wrap">
<div class="abc">
    <div><img src="img/image1.jpg" alt="画像だよ1"></div>
    <div><img src="img/image2.jpg" alt="画像だよ2"></div>
    <div><img src="img/image3.jpg" alt="画像だよ3"></div>

		</div>
</div>

-->
        <div class="main-container">

			<div class="amadanaItem clearfix">

				<img src="img/ttl_recommend.png" alt="境界線" />



<form action="cgi-bin/example.cgi" method="post">

  <input type="search" name="search" placeholder="キーワードを入力">
  <input type="submit" name="submit" value="検索">
</form>




        <!-- 商品一覧 -->
				<table class="f_left">
					<tr class="row1">
						<td class="itemImageSmall"><a href="http://localhost:8080/ecsite/buyItem.jsp"><img src="img/hosi2.png" alt="商品1" /></a></td>
						<td class="itemCategory"><a href="http://localhost:8080/ecsite/buyItem.jsp"><span>test1</span></a></td>
						<td class="itemImageSmall"><a href="http://localhost:8080/ecsite/buyItem.jsp"><img src="img/hosi2.png" alt="説明2" /></a></td>
						<td class="itemCategory"><a href="http://localhost:8080/ecsite/buyItem.jsp"><span>商品2</span></a></td>
						<td class="itemImageSmall"><a href="http://localhost:8080/ecsite/buyItem.jsp"><img src="img/hosi2.png" alt="説明3" /></a></td>
						<td class="itemCategory"><a href="http://localhost:8080/ecsite/buyItem.jsp"><span>商品3</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/51"><img src="img/hosi2.png" alt="説明4" /></a></td>
						<td class="itemCategory"><a href="http://localhost:8080/ecsite/buyItem.jsp"><span>商品4</span></a></td>
					</tr>
					<tr class="row1">
						<td class="itemImageSmall"><a href="http://localhost:8080/ecsite/buyItem.jsp"><img src="img/hosi2.png" alt="説明5" /></a></td>
						<td class="itemCategory"><a href="http://localhost:8080/ecsite/buyItem.jsp"><span>商品5</span></a></td>
					</tr>
				</table>
			</div>


		<div id="text-center">


					<!-- 次のページ -->
		      <div class="navi clearfix"><strong>1</strong> <a href="?category_id=0&amp;pageno=2" onclick="eccube.movePage('2'); return false;">2</a> <a href="?category_id=0&amp;pageno=3" onclick="eccube.movePage('3'); return false;">3</a>  <a class="rbtn" href="?category_id=0&amp;pageno=2" onclick="eccube.movePage('2'); return false;">NEXT</a></div>


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
	</div>
    </div>

	<div id="footer">
        2018
	 	<div id="pr">
		</div>
	</div>


</body>
</html>