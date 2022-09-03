<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Table</title>
</head>
<body>

<h2>User Table</h2>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Redaction</th>
    </tr>

    <c:forEach var="usr" items="${allUs}">

        <c:url var="updateButton" value="/updateUser">
            <c:param name="empId" value="${usr.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deletUser">
            <c:param name="usrId" value="${usr.id}"/>
        </c:url>

        <tr>
            <td>${usr.name}</td>
            <td>${usr.surname}</td>
            <td>${usr.department}</td>
            <td>${usr.salary}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateUser}' "/>

                <input type="button" value="Delet"
                       onclick="window.location.href = '${deleteUser}' "/>
            </td>

        </tr>

    </c:forEach>

</table>

<br>
<input type="button" value="Add"
    onclick="window.location.href = 'addUser'"/>

</body>
</html>
