<html>
<head>
<body>
<h1>Все новости  </h1>
<table>
    <form action="/editnews" method="get">
        <p>
            <label>Измените название заголовка</label>
            <input type="text" value="${news.title}"  name="newsTitle">
        </p>
        <p>
            <label>Измените источник новости</label>
            <input type="text" value="${news.source}" name="newsSource">
        </p>
        <p>
            <label>Измените полный текст новости</label>
            <input type="text" value="${news.fulltext}" name="newsFulltext">
        </p>
    </form>



</table>
<form action="/successEditedNews" method="post">
    <button>     <button type="submit">Отправить</button>
    </button>
</form>
</body>
</head>
</html>