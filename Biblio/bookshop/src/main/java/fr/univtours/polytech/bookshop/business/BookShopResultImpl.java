package fr.univtours.polytech.bookshop.business;

import java.util.List;

import fr.univtours.polytech.bookshop.dao.BookRestDAO;
import fr.univtours.polytech.bookshop.model.books.Doc;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class BookShopResultImpl implements BookRestBusiness {
    @Inject
    private BookRestDAO bookRestDAO;

    public List<Doc> searchDocs(String search) {

        return bookRestDAO.getDocs(search);

    }

}
