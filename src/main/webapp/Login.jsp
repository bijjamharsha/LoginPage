<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
  <form  action="LoginServlet">
    <label>Email:</label>
    <input type="email" name="email" ><br><br>
    <label>Password:</label>
    <input type="password" name="password" ><br><br>
    <input type="submit" value="Login">
  </form>
</body>
</html>