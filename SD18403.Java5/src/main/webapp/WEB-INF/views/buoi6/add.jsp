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
    <h2>Them nghe si</h2>
    <form action="/buoi6/add" method="post">
        Id: <input type="text" name="id"> <br>
        Ten: <input type="text" name="ten"> <br>
        Luong: <input type="text" name="luong"> <br>
        Gioi tinh: <input type="radio" name="gioiTinh" value="true"> Nam
        <input type="radio" name="gioiTinh" value="false"> Nu <br>
        <button>Submit</button>
    </form>
</body>
</html>