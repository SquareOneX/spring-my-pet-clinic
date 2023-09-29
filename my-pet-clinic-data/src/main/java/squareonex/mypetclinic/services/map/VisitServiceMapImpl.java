package squareonex.mypetclinic.services.map;

import squareonex.mypetclinic.model.Visit;
import squareonex.mypetclinic.services.VisitService;

import java.util.Set;

public class VisitServiceMapImpl extends AbstractMapService<Visit, Long> implements VisitService {
    private Long key = 0L;

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
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
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
