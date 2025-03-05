/**
 * Created by Yiwen Cheng on 3/4/25
 */

package ycheng.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ycheng.springframework.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}