package squareonex.mypetclinic.services.map;

import squareonex.mypetclinic.model.VetSpecialty;
import squareonex.mypetclinic.services.VetSpecialtyService;

import java.util.Set;

public class VetSpecialtyServiceImpl extends AbstractMapService<VetSpecialty, Long> implements VetSpecialtyService {
    private Long key = 0L;

    @Override
    public Set<VetSpecialty> findAll() {
        return super.findAll();
    }

    @Override
    public VetSpecialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public VetSpecialty save(VetSpecialty object) {
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
    public void delete(VetSpecialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
