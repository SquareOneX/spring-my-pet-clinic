package squareonex.mypetclinic.services.springdatajpa;

import org.springframework.stereotype.Service;
import squareonex.mypetclinic.model.Owner;
import squareonex.mypetclinic.repositories.OwnerRepository;
import squareonex.mypetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> set = new HashSet<>();
        for (Owner owner : ownerRepository.findAll()) {
            set.add(owner);
        }
        return set;
    }

    @Override
    public Owner findById(Long id) {
        Optional<Owner> optional = ownerRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
