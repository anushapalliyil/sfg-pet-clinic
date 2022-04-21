package anushapalliyil.springframework.sfgpetclinic.services.map;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import anushapalliyil.springframework.sfgpetclinic.model.Owner;
import anushapalliyil.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    public OwnerServiceMap(Map<Long, Owner> map) {
        super(map);
    }
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
    @Override
    public List<Owner> findAllByLastNameLike(String string) {
        return null;
    }
}
