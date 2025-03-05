/**
 * Created by Yiwen Cheng on 2/19/25
 */

package ycheng.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ycheng.springframework.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}