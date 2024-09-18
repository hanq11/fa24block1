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
    <h2>Them sinh vien</h2>
    <form action="/buoi4/add" method="post">
        Id: <input type="text" name="id"> <br>
        Ten: <input type="text" name="ten"> <br>
        Tuoi: <input type="text" name="tuoi"> <br>
        DiaChi: <input type="text" name="diaChi"> <br>
        GioiTinh: <input type="radio" name="gioiTinh" value="true"> Nam
                <input type="radio" name="gioiTinh" value="false"> Nu
        <button type="submit">Them</button>
    </form>
</body>
</html>