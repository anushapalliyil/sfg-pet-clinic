package anushapalliyil.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import anushapalliyil.springframework.sfgpetclinic.model.Speciality;
import anushapalliyil.springframework.sfgpetclinic.model.Vet;
import anushapalliyil.springframework.sfgpetclinic.services.SpecialtyService;
import anushapalliyil.springframework.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

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
