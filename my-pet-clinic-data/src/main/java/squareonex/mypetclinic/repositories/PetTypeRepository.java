package squareonex.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import squareonex.mypetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
