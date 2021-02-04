package kerneels.mvc.repository;

import kerneels.mvc.models.Issues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuesRepository extends CrudRepository<Issues, Long> {
}
