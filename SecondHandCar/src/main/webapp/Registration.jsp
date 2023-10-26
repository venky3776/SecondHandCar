<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="/saveBuyer">
<p>FIRSTNAME: <input type="text" name="firstname"></p>
<p>LASTNAME: <input type="text" name="lastname"></p>
<p>EMAIL: <input type="text" name="email"></p>
<p>MOBILE: <input type="text" name="mobile"></p>
<p>ADDRESS: <input type="text" name="address"></p>
<p>CITY: <input type="text" name="city"></p>
<p>PINCODE: <input type="text" name="pincode"></p>
<p>State: <input type="text" name="state"></p>
<p>Password: <input type="password" name="password"></p>
<button type="submit">SAVE</button>
</form>

</center>
</body>
</html>
<style>
p{
font-size: 10px;
align-items: left;
}
input{
width:150px;}
center{
width:1000px;
height:auto;
}
</style>