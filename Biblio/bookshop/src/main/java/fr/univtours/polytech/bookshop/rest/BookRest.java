package fr.univtours.polytech.bookshop.rest;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

import fr.univtours.polytech.bookshop.business.BookBusiness;
import fr.univtours.polytech.bookshop.model.BookBean;

@Path("v1")
public class BookRest {

    @EJB
    private BookBusiness bookBusiness;

    @Path("books")
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<BookBean> getAllBooks(@QueryParam("author") String author, @QueryParam("title") String title) {
        List<BookBean> books = this.bookBusiness.getBooks();
        List<BookBean> results = new ArrayList<>();

        // Si l'auteur est spécifié,
        if (author != null && !author.isEmpty()) {
            for (BookBean book : books) {
                if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                    results.add(book);
                }
            }
        }
        // Si le titre est spécifié
        else if (title != null && !title.isEmpty()) {
            for (BookBean book : books) {
                if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    results.add(book);
                }
            }
        }

        else {
            results = books;
        }

        return results;
    }

    @GET
    @Path("books/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public BookBean getBookById(@PathParam("id") Integer id) {
        return this.bookBusiness.getBook(id);
    }

    @POST
    @Path("books")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response createBook(BookBean bookBean, @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {

        this.bookBusiness.createBook(bookBean);
        return Response.status(Status.CREATED).entity(bookBean).build();
    }

    @PUT
    @Path("books/{id}")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response updateBook(@PathParam("id") Integer id, BookBean bookBean,
            @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {

        bookBean.setId(id);
        this.bookBusiness.updateBook(bookBean);
        return Response.status(Status.OK).entity(bookBean).build();
    }

    @PATCH
    @Path("books/{id}")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response partialUpdateBook(@PathParam("id") Integer id, BookBean bookBean,
            @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {

        BookBean existingBook = this.bookBusiness.getBook(id);
        if (existingBook == null) {
            return Response.status(Status.NOT_FOUND).build();
        }

        if (bookBean.getTitle() != null) {
            existingBook.setTitle(bookBean.getTitle());
        }
        if (bookBean.getAuthor() != null) {
            existingBook.setAuthor(bookBean.getAuthor());
        }

        this.bookBusiness.updateBook(existingBook);
        return Response.status(Status.OK).entity(existingBook).build();
    }

    @DELETE
    @Path("books/{id}")
    public Response deleteBook(@PathParam("id") Integer id,
            @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {

        System.out.println(auth);
        if (!"42".equals(auth)) {
            // Le client n'a pas le droit de faire cette action.
            return Response.status(Status.UNAUTHORIZED).build();
        } else {
            // Le client à la droit de faire cette action.
            // On vérifie que le logement existe dans la base de données.
            BookBean existingBook = this.bookBusiness.getBook(id);
            if (existingBook == null) {
                return Response.status(Status.NOT_FOUND).build();
            }

            this.bookBusiness.removeBook(id);
            return Response.status(Status.NO_CONTENT).build();
        }

    }
}
