<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Thuc hanh 2</title>
</head>
<body>
<h1><%= "Vietnamese Dictionary" %></h1>
<br/>
<form action="dictionary.jsp" method="post">
  <input type="text" name="search" placeholder="Enter your word: "/>
  <button type="submit">Submit</button>
</form>
</body>
</html>