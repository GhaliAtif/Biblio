<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <html>

    <head>
        <title>Résultats</title>
        <meta charset="UTF-8" />

        <style>
            table,
            th,
            td {
                border: 1px solid;
            }
        </style>
    </head>

    <body>
        <h1>Liste des livres</h1>
        <fieldset>
            <legend>Livres</legend>
            <table>
                <tr>
                    <th>Titre</th>
                    <th>Auteur</th>
                    <th>ratingsCount</th>
                    <th>ratingsAverage</th>
                    <th>firstSentence</th>
                    <th>prix</th>

                </tr>
                <c:forEach items="${requestScope.BOOKS}" var="book">
                    <tr>
                        <td>${book.title}</td>
                        <td>${book.author}</td>
                        <td>${book.ratingsCount}</td>
                        <td>${book.ratingsAverage}</td>
                        <td>${book.firstSentence}</td>
                        <td>${book.price} euro</td>
                        <!-- Intégration de l'image de l'auteur -->
                        <td><img class="author-image" src="${book.authorImageUrl}" alt="Image de l'auteur"></td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
    </body>

    </html>