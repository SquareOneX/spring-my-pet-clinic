package squareonex.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import squareonex.mypetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
