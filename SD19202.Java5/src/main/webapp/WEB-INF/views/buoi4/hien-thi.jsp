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
    <h2>Tim kiem: </h2>
    <form action="" method="get">
        ID sinh vien: <input type="text"> <br>
        <button>Tim kiem</button>
    </form>
    <a href="">Them sinh vien</a>
    <h2>Danh sach sinh vien</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten</th>
                <th>Tuoi</th>
                <th>Dia chi</th>
                <th>Gioi tinh</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${danhSach}" var="sinhVien">
                <tr>
                    <td>${sinhVien.id}</td>
                    <td>${sinhVien.ten}</td>
                    <td>${sinhVien.tuoi}</td>
                    <td>${sinhVien.diaChi}</td>
                    <td>${sinhVien.gioiTinh ? "Nam" : "Nu"}</td>
                    <td>
                        <a href="">Xoa</a>
                        <a href="">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>