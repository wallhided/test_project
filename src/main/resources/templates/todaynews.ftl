<html>
<head>

<body>

<form action="/new-news" method="post">
    <label>Введите название заголовка</label>
    <input type="text" name="newsTitle">
    <button type="submit">Отправить</button>
</form>

<table>
<#list newsList as news>
    <tr>
        <td>
        ${news.title}
        </td>
    </tr>
</#list>
</table>
</body>
</head>
</html>