<%--
  Created by IntelliJ IDEA.
  User: Ikast
  Date: 19.10.2020
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="main">
    <aside class="leftAside">
        <h2>Темы статей</h2>
        <ul>
            <li><a href="#">Тема 1</a></li>
            <li><a href="#">Тема 2</a></li>
            <li><a href="#">Тема 3</a></li>
            <li><a href="#">Тема 3</a></li>

        </ul>
    </aside>
    ${param.name}
    <section>
        <article>
            <h1>${article.title}</h1>
            <div class="text-article">
                ${article.text}
            </div>
            <div class="fotter-article">
                <span class="date-article">Дата статьи: ${article.date}</span>
            </div>
        </article>
    </section>
</div>
