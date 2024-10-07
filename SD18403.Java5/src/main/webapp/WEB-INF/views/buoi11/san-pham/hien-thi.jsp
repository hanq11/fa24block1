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
    <h2>Them san pham</h2>
    <form action="/buoi11/san-pham/them" method="post">
        Ten: <input type="text" name="ten"> <br>
        Gia: <input type="text" name="gia"> <br>
        Ngay tao: <input type="date" name="ngayTao"> <br>
        Danh muc:
        <select name="danhMuc">
            <c:forEach items="${listDanhMuc}" var="danhMuc">
                <option value="${danhMuc.id}" label="${danhMuc.ten}"></option>
            </c:forEach>
        </select> <br>
        <button>Them</button>
    </form>
    <h2>Danh sach san pham</h2>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Ten</th>
                <th>Gia</th>
                <th>Ngay tao</th>
                <th>Danh muc</th>
                <th colspan="3">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listSanPham}" var="sanPham">
                <tr>
                    <td>${sanPham.id}</td>
                    <td>${sanPham.ten}</td>
                    <td>${sanPham.gia}</td>
                    <td>${sanPham.ngayTao}</td>
                    <td>${sanPham.danhMuc.ten}</td>
                    <td>
                        <a href="/buoi11/san-pham/sua/${sanPham.id}">Update</a>
                        <a href="/buoi11/san-pham/xoa?id=${sanPham.id}">Xoa</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>