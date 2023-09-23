package squareonex.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import squareonex.mypetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
