package squareonex.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import squareonex.mypetclinic.model.Vet;
import squareonex.mypetclinic.services.VetService;

import java.util.Set;

@Service
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
        if (object.getId() != null){
            return super.save(object.getId(), object);
        }else{
            while(map.containsKey(key))
                key++;
            object.setId(key);
            return super.save(key, object);
        }
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
