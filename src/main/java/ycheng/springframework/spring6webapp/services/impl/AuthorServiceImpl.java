/**
 * Created by Yiwen Cheng on 3/12/25
 */

package ycheng.springframework.spring6webapp.services.impl;

import org.springframework.stereotype.Service;
import ycheng.springframework.spring6webapp.domain.Author;
import ycheng.springframework.spring6webapp.repositories.AuthorRepository;
import ycheng.springframework.spring6webapp.services.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
