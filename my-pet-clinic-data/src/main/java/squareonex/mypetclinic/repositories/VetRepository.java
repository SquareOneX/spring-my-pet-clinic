package squareonex.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import squareonex.mypetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
