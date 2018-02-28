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
	<meta charset="utf-8">
	<title>BuyItem画面</title>
	<style type="text/css">
	/* ========TAG LAYOUT======== */
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
			<p>BuyItem</p>
		</div>
		<div>
		<s:form action="ItemSearchAction">

			<tr>
				<td>
					<s:textfield name="searchWord" value=""/>
				</td>
				<td>
					<s:submit value="検索"/>
				</td>
			</tr>

		</s:form>

		<s:if test="message != ''">
			<h3><s:property value="message" escape="false"/></h3>
		</s:if>

		<s:form action="BuyItemAction">
			<table>
				<s:iterator value="buyItemDTOList">

				<tr>
					<td>
						<h3><s:property value="itemName"/></h3>
					</td>
				</tr>



				<tr>
					<td>
						<span>値段</span>
					</td>
					<td>
						<s:property value="itemPrice" /><span>円</span>
					</td>
				</tr>
				<tr>
					<td>
						<span>在庫</span>
					</td>
					<td>
					<s:if test="item_stock>0">
						<s:property value="item_stock"/>
					</s:if>
					<s:else>
						<span>品切れ</span>
					</s:else>
					</td>
				</tr>

				<tr>
					<td>
						<span>購入個数</span>
					</td>
					<td>
					<s:if test="item_stock>0">
						<select name="count">
							<option value="0" selected="selected">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select>
					</s:if>
					<s:else>
						<select name="count">
							<option value="0" selected="selected">0</option>
						</select>
					</s:else>
					</td>
				</tr>
				<tr>
					<td>
						<br>
					</td>
				</tr>
				</s:iterator>
				<tr>

					<td>
						<span>支払い方法</span>
					</td>
					<td>
						<input type="radio" name="pay" value="1" checked="checked">現金払い
						<input type="radio" name="pay" value="2">クレジットカード
					</td>
				</tr>

				<tr>
					<td>
						<s:submit value="購入"/>
					</td>
				</tr>

			</table>
		</s:form>

			<div>
				<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
				<p>マイぺージは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>