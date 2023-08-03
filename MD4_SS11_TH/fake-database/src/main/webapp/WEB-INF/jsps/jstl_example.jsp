<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 8/2/2023
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Core Tags Example 01</title>
</head>
<body>

<h2>Departments and Employees</h2>

<!-- Duyệt các phòng ban (departments) -->
<c:forEach items="${departments}" var="dept">
    <h3>${dept.deptName}</h3>
    <ul>
        <!-- Duyệt nhân viên thuộc phòng ban hiện tại -->
        <c:forEach items="${dept.employees}" var="emp">
            <li>
                    ${emp.empName} - (${emp.job})
            </li>
        </c:forEach>
    </ul>

</c:forEach>

</body>
</html>

