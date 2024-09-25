<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
${message}
    <h2>Staff</h2>
    <form:form action="/buoi8/staff" method="post" modelAttribute="staff">
        Id: <form:input path="id"/> <br>
        Name: <form:input path="name"/> <br>
        Age: <form:input path="age"/> <br>
        Position: <form:radiobuttons path="position" items="${positions}"/> <br>
        Hobbies: <form:checkboxes path="hobbies" items="${hobbies}"/> <br>
        Country: <form:select path="country.id">
            <form:options items="${countries}" itemLabel="name" itemValue="id"/>
        </form:select> <br>
        <button>Save</button>
    </form:form>
</body>
</html>