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
<h2>Sua thong tin</h2>
<form action="/buoi4/update" method="post">
    Id: <input type="text" name="id" value="${sinhVien.id}" readonly>  <br>
    Ten: <input type="text" name="ten" value="${sinhVien.ten}">  <br>
    Tuoi: <input type="text" name="tuoi" value="${sinhVien.tuoi}">  <br>
    Dia chi: <input type="text" name="diaChi" value="${sinhVien.diaChi}">  <br>
    Gioi tinh: <input type="radio" name="gioiTinh" value="true" ${sinhVien.gioiTinh ? "checked" : ""}> Nam
    <input type="radio" name="gioiTinh" value="false" ${sinhVien.gioiTinh ? "" : "checked"}> Nu <br>
    <button type="submit">Update</button>
</form>
</body>
</html>