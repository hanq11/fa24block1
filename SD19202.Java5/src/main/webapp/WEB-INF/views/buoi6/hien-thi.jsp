<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h2>Tim kiem</h2>
    <form action="/buoi6/search" method="get">
        Id: <input type="text" name="id"> <br>
        <button>Submit</button>
    </form>
    <a href="/buoi6/add">Them</a>
    <h2>Bang thong tin</h2>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Ten</th>
                <th>Luong</th>
                <th>Gioi tinh</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${danhSach}" var="ngheSi">
                <tr>
                    <td>${ngheSi.id}</td>
                    <td>${ngheSi.ten}</td>
                    <td>${ngheSi.luong}</td>
                    <td>${ngheSi.gioiTinh ? "Nam" : "Nu"}</td>
                    <td>
                        <a href="/buoi6/update/${ngheSi.id}">Update</a>
                        <a href="/buoi6/delete?id=${ngheSi.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>