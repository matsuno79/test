<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="text/javascript"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/pages.css">
<title>宛先情報登録確認</title>
</head>
<body>
	<header>
		<!--kokotownロゴ-->
		 <a href='<s:url action="HomeMoveAction" />'>
		    <img src="./img/kokotown.png" class="logo">
		  </a>

		<input type="checkbox" id="navTgl">

		  <label for="navTgl" class="open">≡</label>
		  <label for="navTgl" class="close"></label>
		  <nav class="menu">
		    <p>menu</p>
		    <ul>
				<li><a href='<s:url action="HomeMoveAction" />'>Home</a></li>
				<li><a href="<s:url action="ProductSearchAction"><s:param name="searchWord" value=" ' ' "/><s:param name="categoryId" value="10"/></s:url>">Shop</a></li>
				<li><a href='<s:url action="CartMoveAction" />'>Cart</a></li>
				<li><a href="home2.jsp#m-cate">Category</a></li>

		      <s:if test="session.email != null">
			      <li><a href='<s:url action="MyPageAction" />'>MyPage</a></li>
			      <li><a href='<s:url action="LogoutAction" />'>Logout</a></li>
		      </s:if>

		      <s:else>
		      	  	 <li><a href='<s:url action="LoginMoveAction" />'>Login</a></li>
		      </s:else>
		    </ul>
		  </nav>
    </header>

	<div id="main">
		<br>
			<div id="title">
				<span>DESTINATION</span>
			</div>
		<s:form action="DestinationCompleteAction" theme="simple">
		<div>入力内容をご確認ください。</div>
			<table>
				<tr>
					<td>かな</td>
					<td><s:property value="familyNameKana" />
						<s:hidden name="familyNameKana" value="%{familyNameKana}" />
						<s:property value="firstNameKana" />
						<s:hidden name="firstNameKana" value="%{firstNameKana}" />
					</td>
				</tr>
				<tr>
					<td>名前</td>
					<td><s:property value="familyName" />
						<s:hidden name="familyName" value="%{familyName}" />
						<s:property value="firstName" />
						<s:hidden name="firstName" value="%{firstName}" />
					</td>
				</tr>
				<tr>
					<td>電話番号</td>
					<td>
						<s:property value="telNumber" />
						<s:hidden name="telNumber" value="%{telNumber}" />
					</td>
				</tr>
				<tr>
					<td>住所</td>
					<td>
						<s:property value="userAddress" />
						<s:hidden name="userAddress" value="%{userAddress}" />
					</td>
				</tr>
			</table>
				<br>
			<div id="button">
				<button type="submit">&nbsp;確定&nbsp;</button>
			</div>
		</s:form>
			<br><br>
    	宛先入力に戻る場合は<a href='<s:url action = "DestinationCreateMoveAction" />'>こちら</a>
	</div>
		<br>
		<footer>
	    	<p>good tomorrow co.,ltd All rights reserved</p>
		</footer>

		 <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
			 <script>
			 </script>
</body>
</html>