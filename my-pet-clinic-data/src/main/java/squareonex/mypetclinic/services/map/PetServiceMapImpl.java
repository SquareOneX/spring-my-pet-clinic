package squareonex.mypetclinic.services.map;

import squareonex.mypetclinic.model.Pet;
import squareonex.mypetclinic.services.PetService;

import java.util.Set;

public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements PetService {

    private Long key = 0L;

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
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
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
