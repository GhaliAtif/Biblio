package fr.univtours.polytech.bookshop.controller;

import java.io.IOException;
import java.util.List;

import fr.univtours.polytech.bookshop.business.BookBusiness;
import fr.univtours.polytech.bookshop.business.BookRestBusiness;
import fr.univtours.polytech.bookshop.model.BookBean;
import fr.univtours.polytech.bookshop.model.books.Doc;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("books")
public class BooksServlet extends HttpServlet {

    @Inject
    private BookBusiness bookBusiness;

    @Inject 
    BookRestBusiness bookRestBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<BookBean> books = this.bookBusiness.getBooks();

        for (BookBean bookBean : books) {
            List<Doc> WsResult = bookRestBusiness.searchDocs(bookBean.getTitle());

            if (WsResult != null && !WsResult.isEmpty() && WsResult.get(0) != null) {
                List<String> firstSentences = WsResult.get(0).getFirst_sentence();
                if (firstSentences != null && !firstSentences.isEmpty()) {
                    bookBean.setFirstSentence(firstSentences.get(0));
                    System.out.println(bookBean.getFirstSentence());
                }
                Integer ratingsCount = WsResult.get(0).getRatings_count();
                if (ratingsCount != null) {
                    bookBean.setRatingsCount(ratingsCount);
                }
                Double ratingsAverage = WsResult.get(0).getRatings_average();
                if (ratingsAverage != null) {
                    bookBean.setRatingsAverage(ratingsAverage);
                }
            }

            String authorKey = WsResult.get(0).getAuthor_key();
            if (authorKey != null) {
                String authorImageUrl = "https://covers.openlibrary.org/a/olid/" + authorKey + ".jpg";
                bookBean.setAuthorImageUrl(authorImageUrl);
            }

            
        }

        request.setAttribute("BOOKS", books);

        request.getRequestDispatcher("books.jsp").forward(request, response);
    }
}
