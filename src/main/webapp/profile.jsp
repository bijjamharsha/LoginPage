<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Profile Page</h1>
  <form action="ProfileServlet">
    <label>Age:</label>
    <input type="number" name="age"><br><br>
    <label>Gender:</label>
    <input type="radio" name="gender" >Male
    <input type="radio" name="gender" value="female" >Female<br><br>
    <label>Date of Birth:</label>
    <input type="date" name="dob" ><br><br>
    <label>Mobile:</label>
    <input type="tel" name="mobile" ><br><br>
    <input type="submit" value="Update">
  </form>
</body>
</html>