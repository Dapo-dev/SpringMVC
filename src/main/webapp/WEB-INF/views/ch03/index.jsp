<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align='center'>
<h2>本頁為第一頁(02-26)</h2>
</div>
<table border='1'>
  	<tr>
  		<td width='100' align='center'><a href='index'>第一頁</a></td>
  		<td width='100' align='center'><a href='secondPage'>第二頁</a></td>
  		<td width='100' align='center'><a href='thirdPage'>第三頁</a></td>
  	</tr>
  </table>
<hr>
<a href='inspectSession'>查看Session物件的內容，然後轉向第三頁</a><br>
在Ch03Controller1類別內的控制器方法取得的Cat物件：${indexPageCat}
<hr>
<%
  out.println("----------------執行index.jsp時，位於HttpSession中的屬性物件----------------<br>");
  java.util.Enumeration<String> sessEnum = session.getAttributeNames();
%>  
  <table border='1'>
  <tr><th>Key</th><th>Value</th></tr>
<%  
  while (sessEnum.hasMoreElements()) {
	String s = sessEnum.nextElement();
	out.println("<tr><td>" + s + "</td><td>" + session.getAttribute(s) + "</td></tr>");
  }
%>
</table>
</body>
</html>