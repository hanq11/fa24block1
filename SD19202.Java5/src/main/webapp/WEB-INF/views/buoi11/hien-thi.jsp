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
    <h2>Them danh muc</h2>
    <form action="/buoi11/them" method="post">
        Ten: <input type="text" name="ten"> <br>
        <button>Submit</button>
    </form>
    <h2>Danh sach</h2>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Ten</th>
                <th colspan="3">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${danhSach}" var="danhMuc">
                <tr>
                    <td>${danhMuc.id}</td>
                    <td>${danhMuc.ten}</td>
                    <td>
                        <a href="/buoi11/chi-tiet/${danhMuc.id}">Chi tiet</a>
                        <a href="/buoi11/sua/${danhMuc.id}">Sua</a>
                        <a href="/buoi11/xoa?id=${danhMuc.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>