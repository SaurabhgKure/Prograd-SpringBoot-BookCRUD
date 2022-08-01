package BookDetails.BookDetail.Service;

import BookDetails.BookDetail.Model.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBook();
    Book getBookById(int id);
    Book updateBook(Book book,int id);
    void deleteBook(int id);
}