package sv.edu.udb.desafio01_dwf.service;

import sv.edu.udb.desafio01_dwf.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book addBook(Book book);
    List<Book> searchBooksByTitle(String title);
    void deleteBook(Long id);
    Book updateBook(Long id, Book book); // NUEVO MÉTODO
}