package squareonex.mypetclinic.services.springdatajpa;

import squareonex.mypetclinic.model.Specialty;
import squareonex.mypetclinic.repositories.SpecialtyRepository;
import squareonex.mypetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

public class SpecialtyServiceImpl implements SpecialtyService {
    private final SpecialtyRepository repository;

    public SpecialtyServiceImpl(SpecialtyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> set = new HashSet<>();
        repository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Specialty findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return repository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
