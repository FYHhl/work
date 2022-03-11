<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<table>
    <form action="add" method="post">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName" /></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td>昵称</td>
            <td><input type="text" name="nickName" /></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="按钮" />
            </td>
        </tr>
    </form>
</table>

</body>
</html>