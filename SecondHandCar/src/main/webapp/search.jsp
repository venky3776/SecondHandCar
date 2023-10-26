<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@page import="com.project.SecondHandCar.Model.*" %>
<%@page import="java.util.*" %>
<body>
<center>
SEARCH PAGE
<form method="get" action="searchByModel">
<select name="model">
<option value="Toyota">Toyota</option>
<option value="Honda">Honda</option>
<option value="Ford">Ford</option>
<option value="Chevrolet">Chevrolet</option>
<option value="Nissan">Nissan</option>
</select>
<button type="submit" onclick="model()">SEARCH</button>
</form>
<!--  <form method="get" action="searchByVariant">
<select name="variant">
<option value="Camry">Camry</option>
<option value="Civic">Civic</option>
<option value="Fusion">Fusion</option>
<option value="Malibu">Malibu</option>
<option value="Altima">Altima</option>
</select>
<button type="submit" onclick="model()">SEARCH</button>
</form>
<form method="get" action="searchByPrice">
<label>Price Range:</label>
<input type="text" name="pricerange">
<button type="submit" onclick="model()">SEARCH</button>
</form>
<form method="get" action="searchByKmtravelled">
<label>Km Travelled:</label>
<input type="text" name="kmtravelled">
<button type="submit" onclick="model()">SEARCH</button>
</form>
<form method="get" action="searchByYearOfManufacturing">
<label>Year Of Manufacturing:</label>
<input type="text" name="yearofmanufacturing">
<button type="submit" onclick="model()">SEARCH</button>
</form>-->
<table>
<tr>
<th>Model</th>
<th>Variant</th>
<th>Price</th>
<th>Km travelled</th>
<th>Year of Manufacturig</th>
</tr>
<% List<Car> car1=(List<Car>)request.getAttribute("l");
for(Car car2:car1){
	%><tr>
	<%
	String model=car2.getModel();
	%>
	<td><%=model%></td>
	<% String variant=car2.getVariant(); %>
	<td><%=variant%></td>
	<% String price=car2.getPricerange(); %>
	<td><%=price%></td>
	<% float km=car2.getKmtravelled();%>
	<td><%=km%></td>
	<% int year=car2.getYearofmanufacturing(); %>
	<td><%=year%></td>
	</tr>
<% 
}
%>
</table>
</center>
</body>
</html>
<style>
table,tr,td,th {
border:2px solid black;

}
</style>
<script>
function model(){
	document.getElementById("list").style.display = "block";
	
}
</script>