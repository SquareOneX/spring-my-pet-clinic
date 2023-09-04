package squareonex.mypetclinic.services.map;

import squareonex.mypetclinic.model.Vet;
import squareonex.mypetclinic.services.VetService;

import java.util.Set;

public class VetServiceImpl extends AbstractMapService<Vet, Long> implements VetService {
    private Long key = 0L;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(key++, object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
