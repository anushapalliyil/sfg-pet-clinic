package anushapalliyil.springframework.sfgpetclinic.services.map;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import anushapalliyil.springframework.sfgpetclinic.model.PetType;
import anushapalliyil.springframework.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    public PetTypeMapService(Map<Long, PetType> map) {
        super(map);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object ){
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
