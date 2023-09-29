package squareonex.mypetclinic.services.springdatajpa;

import squareonex.mypetclinic.model.Pet;
import squareonex.mypetclinic.repositories.PetRepository;
import squareonex.mypetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

public class PetServiceImpl implements PetService {
    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> set = new HashSet<>();
        for (Pet pet : petRepository.findAll()) {
            set.add(pet);
        }
        return set;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
