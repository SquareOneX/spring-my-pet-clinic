package squareonex.mypetclinic.services.map;

import squareonex.mypetclinic.model.PetType;
import squareonex.mypetclinic.services.PetTypeService;

import java.util.Set;

public class PetTypeServiceImpl extends AbstractMapService<PetType, Long> implements PetTypeService {
    private Long key = 0L;

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
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
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
