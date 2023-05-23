<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup page</title>
</head>
<body>
<h1>signup Page</h1>
  <form  action="SignupServlet">
    <label>Name:</label>
    <input type="text" name="name" ><br><br>
    <label>Email:</label>
    <input type="email" name="email" ><br><br>
    <label>Password:</label>
    <input type="password" name="password"><br><br>
    <label>Confirm Password:</label>
    <input type="password" name="confirm_password" ><br><br>
    <input type="submit" value="Signup">
  </form>
</body>
</html>