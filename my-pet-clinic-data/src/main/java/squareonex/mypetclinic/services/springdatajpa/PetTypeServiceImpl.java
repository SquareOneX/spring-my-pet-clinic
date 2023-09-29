package squareonex.mypetclinic.services.springdatajpa;

import squareonex.mypetclinic.model.PetType;
import squareonex.mypetclinic.repositories.PetTypeRepository;
import squareonex.mypetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

public class PetTypeServiceImpl implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> set = new HashSet<>();
        petTypeRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
