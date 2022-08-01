package BookDetails.BookDetail.Service;

import BookDetails.BookDetail.Model.Book;
import BookDetails.BookDetail.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.List;

@Service
public class BookServiceIMPL implements BookService{
    @Autowired
    private BookRepo bookRepo;

    public BookServiceIMPL(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    @Override
    public Book saveBook(Book book)
    {
        return bookRepo.save(book);
    }
    @Override
    public List<Book> getAllBook()
    {
        return bookRepo.findAll();
    }
    @Override
    public Book getBookById(int id)
    {
        return bookRepo.findById(id).orElseThrow();
    }
    @Override
    public Book updateBook(Book book,int id)
    {
        Book existingBook=bookRepo.findById(id).orElseThrow();
        existingBook.setBookName(book.getBookName());
        existingBook.setAuthorName(book.getAuthorName());
        existingBook.setPublication(book.getPublication());
        existingBook.setMrp(book.getMrp());
        existingBook.setRating(book.getRating());
        bookRepo.save(existingBook);
        return existingBook;
    }
    @Override
    public void deleteBook(int id)
    {
        bookRepo.findById(id).orElseThrow();
        bookRepo.deleteById(id);
    }


}