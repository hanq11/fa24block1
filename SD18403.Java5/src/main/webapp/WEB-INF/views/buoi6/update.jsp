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
<h2>Sua nghe si</h2>
<form action="/buoi6/update" method="post">
    Id: <input type="text" name="id" value="${ngheSi.id}"> <br>
    Ten: <input type="text" name="ten" value="${ngheSi.ten}"> <br>
    Luong: <input type="text" name="luong" value="${ngheSi.luong}" ><br>
    Gioi tinh: <input type="radio" name="gioiTinh" value="true" ${ngheSi.gioiTinh ? "checked" : ""}> Nam
    <input type="radio" name="gioiTinh" value="false" ${!ngheSi.gioiTinh ? "checked" : ""}> Nu <br>
    <button>Submit</button>
</form>
</body>
</html>