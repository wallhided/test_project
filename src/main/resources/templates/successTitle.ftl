<html xmlns="http://www.w3.org/1999/html">
<head><a href="https://time100.ru/" target="_blank"><img src="https://time100.ru/api.php?type=img" width="88" height="31" alt="Московское время" /></a></head>
<body>
<h1>Все новости  </h1>


<table><tr> <b>Категории:</b> <form action="/changeCatId " method="get">
    <button><a href="/changeCatId?id=1"> Спорт </a></button>
    <button><a href="/changeCatId?id=2"> Политика </a></button>
    <button><a href="/changeCatId?id=3"> Экономика </a></button>
    <button><a href="/changeCatId?id=4"> Hi-Tech </a></button>
    <button><a href="/all-news"> Все новости </a></button> </tr></form></table>

<table>
    <tr> <b>Заголовок</b>&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b>источник</b> </tr>
<#list newsList as news>

    <tr>


        <td>
        ${news.title}
        </td>&emsp;&emsp;&emsp;&emsp;&emsp;
        <td>
        ${news.source}
        </td>&emsp;&emsp;&emsp;&emsp;&emsp;

        <td>
            <form action="/successdelete" method="post">
                <button><a href="/successdelete?id=${news.id}"> X </a> </button>
                <button><a href="/editnews?id=${news.id}"> Edit </a> </button>
                <button><a href="/open?id=${news.id}"> Open </a> </button>
                </form>
        </td>
    </tr>

</#list>

</table>
</body>
<form action="todaynews.ftl" method="get">
<button> <a href="/todaynews" ></a> Добавить новость </button>
</form>

</html>