/**
 * Created by Yiwen Cheng on 2/14/25
 */

package ycheng.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ycheng.springframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}