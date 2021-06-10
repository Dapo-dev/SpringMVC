<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' href='${pageContext.request.contextPath}/css/styles.css'  type='text/css' />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align='center'>
		<h2>第一頁商品資料</h2>
		會員: <font color='red'>${memberBean.name}</font>
		<hr>
		<table border='1'>
			<tr>
				<td width='100' align='center'><a href='index'>第一頁</a></td>
				<td width='100' align='center'><a href='secondPage'>第二頁</a></td>
				<td width='100' align='center'><a href='thirdPage'>第三頁</a></td>
				<td width='100' align='center'><a href='fourthPage'>第四頁</a></td>
				<td width='130' align='center'><a href='showCartContent'>查看購物明細</a></td>
				<td width='180' align='center'>移除購物車 <a href='removeCartOK'>OK</a>&nbsp;&nbsp;<a href='removeCartNG'>NG</a></td>
			</tr>
			<tr>
				<td colspan='2' width='260' align='center'>${ShoppingCart.creteTime}</td>
				<td colspan='2'  width='260' align='center'>${requestScope.ShoppingCart.creteTime}</td>
				<td colspan='2'  width='260' align='center'>${sessionScope.ShoppingCart.creteTime}</td>
			</tr>
		</table>
        
		<hr>
			<form action='addToCart' method='POST'>
				<input type='hidden'  name='bookId' value='${allBooks[1].bookId}'> 
				<input type='hidden'  name='page' value='index'> 
			   <table border='1'>
			   <tr height='36'>
					<td width='100' align='right'>書名：</td>
					<td width='320' align='left'>${allBooks[1].title}</td>
			   	</tr>
			   <tr height='36'>
			   		<td width='100' align='right'>作者：</td>
			   		<td width='260' align='left'>${allBooks[1].author}</td>
			   </tr>	   
			   <tr height='36'>
			   		<td width='100' align='right'>單價：</td>
			   		<td width='260' align='left'>${allBooks[1].price}
			   		</td>
			   </tr>
			   <tr height='36'>
			   		<td width='100' align='right'>數量：</td>
			   		<td width='260' align='left'>
			   			<input type='text' size='1' name='qty' value='1'>
			   		</td>
			   </tr>
			   <tr height='36'>
			   		<td colspan='2' align='center'><input type='submit'></td>
				</tr>			   		
				</table>
			</form>
		<hr>
		<h2>看到本頁時，已經產生購物車物件</h2>
	</div>
</body>
</html>