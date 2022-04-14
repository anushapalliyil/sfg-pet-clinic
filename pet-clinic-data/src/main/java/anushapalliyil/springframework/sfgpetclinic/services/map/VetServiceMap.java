package anushapalliyil.springframework.sfgpetclinic.services.map;

import java.util.Set;

import anushapalliyil.springframework.sfgpetclinic.model.Vet;
import anushapalliyil.springframework.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id); 
    }
    
    
}
