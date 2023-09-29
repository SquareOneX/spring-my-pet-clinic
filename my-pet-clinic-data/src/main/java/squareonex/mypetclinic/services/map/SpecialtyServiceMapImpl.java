package squareonex.mypetclinic.services.map;

import squareonex.mypetclinic.model.Specialty;
import squareonex.mypetclinic.services.SpecialtyService;

import java.util.Set;

public class SpecialtyServiceMapImpl extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    private Long key = 0L;

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
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
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
