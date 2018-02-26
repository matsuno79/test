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
		   height: 80px;
		   background-color: black;
		}


/*左上タイトル*/

 .logo{	float:left;
 		width:100px;
		padding-left:10px;
		color:#D2691E;
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
		   height: 500px;
		   text-align: center;
		}

        
        
.abc{
		width: 780px;
		margin-top:100px;
		overflow:hidden;
		margin:0 auto;
    	/*position:relative;*/
}        
        
        
        
        
        
        
		#footer {
			width: 100%;
			height: 80px;
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
			<li><a href="/menu1/">メニュー1</a></li>
			<li><a href="/menu2/">メニュー2</a></li>
			<li><a href="/menu3/">メニュー3</a></li>
			<li><a href="/menu4/">メニュー4</a></li>
                
            <!-- ツイッターとフェイスブックアイコン -->
		<a href="http://twitter.com" target="_blank" class="f_right face"><span><img src="img/btn_twit.gif" alt="ツイッター"  /></span></a>
		<a href="https://www.facebook.com" target="_blank" class="f_right twit"><img src="img/btn_face.gif" alt="フェイスブック" /></a>


			</ul>
</header>
    
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
    
    
    
    
    
	<div id="main">
		<div id="top">
			<p>Home</p>
            
            
            <!-- スライドショー	-->
<div id="slide">
<div class="abc">
    <div><img src="img/image1.jpg" alt="画像だよ1"></div>
    <div><img src="img/image2.jpg" alt="画像だよ2"></div>
    <div><img src="img/image3.jpg" alt="画像だよ3"></div>

		</div>
</div>
</div>
        
        <div class="main-container">
            
            
        <!-- 商品一覧 -->
			<div class="amadanaItem clearfix">

				<img src="img/hosi.png" alt="境界線" />

				<table class="f_left">
					<tr class="row1">
						<td class="itemImageSmall"><a href="link1"><img src="img/hosi.png" alt="説明1" /></a></td>
						<td class="itemCategory"><a href="link1"><span>test1</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/49"><img src="img/hosi.png" alt="説明2" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/49"><span>test2</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/50"><img src="img/hosi.png" alt="説明3" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/50"><span>test3</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/51"><img src="img/hosi.png" alt="説明4" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/51"><span>test4</span></a></td>
					</tr>
					<tr class="row1">
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/63"><img src="img/hosi.png" alt="説明5" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/63"><span>test5</span></a></td>
					</tr>
				</table>
			</div>


		<div id="text-center">
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    \\\\\\\\\\\\\\\\\\\\\\
    
    
    


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

			   /*

			   カラーコード

			     #99FFCC 水色
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

		   /*左の空白の幅
		   margin:20px auto;*/

		   /*四角い枠*/
		   /*border:1px solid #333;*/


		}



		#header {
		   width: 100%;
		   height: 35px;
		   background-color: #99FFCC;
		   font-size:35px
		}





/*左上タイトル*/

 .logo{	float:left;
 		width:100px;
		padding-left:10px;
		color:#D2691E;
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
   		height: 500px;
   		text-align: center;
	}




/*スライドショー

中央寄せ＞調べる
$('.abc').bxSlider();
*/


.abc{
		width: 100%;
		margin-top:100px;
		overflow:hidden;
		margin:0 auto;
}



.main-container{
	width:97%;
	margin:0 auto;

	/*headerとmainの隙間*/
	margin-top:200px;
}



/*2カラム左*/
#left{
	float:left;
	background-color:skyblue;
	width:30%;
	height:600px;
	margin-bottom:40px;
}

/*2カラム右*/
#right{
	float:right;
	background-color:lightblue;
	width:65%;
	height:600px;
	margin-bottom:40px;
}




		#footer {
			crear:both;
			width: 100%;
			height: 30px;
			background-color: #99FFCC;
			clear:both;

			text-align:center;
			line-height:30px;
		}



/*「商品購入」ボタンをどこに配置するか*/

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
			<li><a href="/menu1/">メニュー1</a></li>
			<li><a href="/menu2/">メニュー2</a></li>
			<li><a href="/menu3/">メニュー3</a></li>
			<li><a href="/menu4/">メニュー4</a></li>

			</ul>

</header>




	<div id="header">
	 	<div id="pr">
		</div>
	</div>

	<div id="main">
	<div id="top">
	<p>Home</p>


<!-- スライドショー	-->
<div id="slide">
<div class="abc">
    <div><img src="img/image1.jpg" alt="画像だよ1"></div>
    <div><img src="img/image2.jpg" alt="画像だよ2"></div>
    <div><img src="img/image3.jpg" alt="画像だよ3"></div>

		</div>

</div>

</div>





<div class="main-container">

<!-- 左カラム -->
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

<!-- ツイッターとフェイスブックアイコン -->
		<a href="http://twitter.com" target="_blank" class="f_right face"><span><img src="img/btn_twit.gif" alt="ツイッター"  /></span></a>
		<a href="https://www.facebook.com" target="_blank" class="f_right twit"><img src="img/btn_face.gif" alt="フェイスブック" /></a>


</div>
</div>
</div>


<!-- 右カラム -->
<div id="right">

<!-- 商品一覧 -->
			<div class="amadanaItem clearfix">

				<img src="img/hosi.png" alt="境界線" />

				<table class="f_left">
					<tr class="row1">
						<td class="itemImageSmall"><a href="link1"><img src="img/hosi.png" alt="説明1" /></a></td>
						<td class="itemCategory"><a href="link1"><span>test1</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/49"><img src="img/hosi.png" alt="説明2" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/49"><span>test2</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/50"><img src="img/hosi.png" alt="説明3" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/50"><span>test3</span></a></td>
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/51"><img src="img/hosi.png" alt="説明4" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/51"><span>test4</span></a></td>
					</tr>
					<tr class="row1">
						<td class="itemImageSmall"><a href="/shop/sal/item/list/category_id/63"><img src="img/hosi.png" alt="説明5" /></a></td>
						<td class="itemCategory"><a href="/shop/sal/item/list/category_id/63"><span>test5</span></a></td>
					</tr>
				</table>
			</div>


</div>






		<div id="text-center">

			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>

<!-- 表示されていない謎＞調べる -->
			<s:if test="#session.id != null">
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
		</div>





	<div id="footer">

	2018

	 	<div id="pr">
		</div>
	</div>
</body>
</html>
