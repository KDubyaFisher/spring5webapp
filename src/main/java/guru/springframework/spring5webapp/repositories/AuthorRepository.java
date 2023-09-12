package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by KDubyaFisher on 09/10/2023
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
