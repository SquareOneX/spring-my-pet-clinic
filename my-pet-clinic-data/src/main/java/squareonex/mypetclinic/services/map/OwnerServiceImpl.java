package squareonex.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import squareonex.mypetclinic.model.Owner;
import squareonex.mypetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceImpl extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
