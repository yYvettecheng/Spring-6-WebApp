/**
 * Created by Yiwen Cheng on 3/11/25
 */

package ycheng.springframework.spring6webapp.services;

import ycheng.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
