package fr.univtours.polytech.bookshop.dao;

import java.util.List;

import fr.univtours.polytech.bookshop.model.books.Doc;

public interface BookRestDAO {

   public List<Doc> getDocs(String search);

}
