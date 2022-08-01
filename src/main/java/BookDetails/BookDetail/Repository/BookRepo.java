package BookDetails.BookDetail.Repository;

import BookDetails.BookDetail.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
