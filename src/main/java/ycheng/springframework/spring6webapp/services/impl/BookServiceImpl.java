/**
 * Created by Yiwen Cheng on 3/12/25
 */

package ycheng.springframework.spring6webapp.services.impl;

import org.springframework.stereotype.Service;
import ycheng.springframework.spring6webapp.domain.Book;
import ycheng.springframework.spring6webapp.repositories.BookRepository;
import ycheng.springframework.spring6webapp.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
