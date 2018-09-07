<html>
<head>
</head>
<body>
<h1>Все новости </h1>

<form action="/new-news" method="POST">

    <p>
        <label>Измените название заголовка</label>
        <input type="text" value="${news.title}" name="newsTitle">
    </p>
    <p>
        <label>Измените источник новости</label>
        <input type="text" value="${news.source}" name="newsSource">
    </p>
    <p>
        <label>Измените полный текст новости</label>
        <input type="text" value="${news.fulltext}" name="newsFulltext">
    </p>
    <input type="hidden" value="${news.id}" name="newsId">

    <button type="submit">Отправить</button>

</form>
</body>
</html>