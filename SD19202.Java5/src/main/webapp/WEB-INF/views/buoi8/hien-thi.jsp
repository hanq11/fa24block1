<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
${message}
    <h2>Thong tin</h2>
    <form:form action="/buoi8/staff" method="post" modelAttribute="staff">
        ID: <form:input path="id"/>
        <form:errors class="error" path="id" /><br>
        Ten: <form:input path="name"/>
        <form:errors path="name" /><br>
        Age: <form:input path="age"/>
        <form:errors path="age" /><br>
        Position: <form:radiobuttons path="position" items="${positions}"/>
        <form:errors path="position" /><br>
        Hobbies: <form:checkboxes path="hobbies" items="${hobbies}"/>
        <form:errors path="hobbies" /><br>
        Country: <form:select path="country.id">
            <option selected hidden disabled>Vui long chon</option>
            <form:options items="${countries}" itemLabel="name" itemValue="id"/>
        </form:select>
        <form:errors path="country" />
        <br>
        <form:button>Submit</form:button>
    </form:form>
</body>
</html>