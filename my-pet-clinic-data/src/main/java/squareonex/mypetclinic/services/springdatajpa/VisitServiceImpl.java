package squareonex.mypetclinic.services.springdatajpa;

import squareonex.mypetclinic.model.Visit;
import squareonex.mypetclinic.repositories.VisitRepository;
import squareonex.mypetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

public class VisitServiceImpl implements VisitService {
    private final VisitRepository visitRepository;

    public VisitServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> set = new HashSet<>();
        visitRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
