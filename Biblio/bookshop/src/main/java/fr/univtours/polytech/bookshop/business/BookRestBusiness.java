package fr.univtours.polytech.bookshop.business;

import java.util.List;

import fr.univtours.polytech.bookshop.model.books.Doc;

public interface BookRestBusiness {
    public List<Doc> searchDocs(String search);
}
