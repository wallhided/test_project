<html>
<head>
<body>
<h1>Все новости  </h1>
<table>
    <tr><b>заголовок</b>        <b>источник</b>             <b>текст</b> </tr>
<#list newsList as news>

    <tr>

        <td>
        ${news.id}
        </td>
        <td>
        ${news.title}
        </td>
        <td>
        ${news.source}
        </td>
        <td>
        ${news.fulltext}
        </td>

    </tr>

</#list>
</table>
</body>
</head>
</html>