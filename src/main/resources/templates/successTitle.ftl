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
        <td>
            <form action="/successdelete" method="post">
                <button><a href="/successdelete?id=${news.id}"> X </a> </button>
                <button><a href="/editnews?id=${news.id}"> Edit </a> </button>
                </form>
        </td>
    </tr>

</#list>
</table>
</body>
</head>
</html>