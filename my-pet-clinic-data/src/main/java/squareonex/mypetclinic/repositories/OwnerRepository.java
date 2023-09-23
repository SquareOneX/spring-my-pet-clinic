package squareonex.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import squareonex.mypetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
