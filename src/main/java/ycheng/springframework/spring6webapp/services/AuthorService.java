/**
 * Created by Yiwen Cheng on 3/12/25
 */

package ycheng.springframework.spring6webapp.services;

import ycheng.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
