<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details Form</title>
</head>
<body>
    <h2>User Details Form</h2>
   <form action="add" method="post"> 
        <label for="userName">User name:</label>
        <input type="text" id="userName" name="userName" required><br><br>
        
        <label for="userId">User Id:</label>
        <input type="text" id="userId" name="userId" required><br><br>
        
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required><br><br>
        
        <label for="password">password</label>
        <input type="text" id="password" name="password" required><br><br>
        
        <label for="confirmPassword">confirm password</label>
        <input type="text" id="confirmPassword" name="confirmPassword" required><br><br>
        
        <label for="mobileNumber">mobile number</label>
        <input type="text" id="mobileNumber" name="mobileNumber" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
