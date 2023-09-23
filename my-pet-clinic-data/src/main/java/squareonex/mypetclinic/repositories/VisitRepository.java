package squareonex.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import squareonex.mypetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
