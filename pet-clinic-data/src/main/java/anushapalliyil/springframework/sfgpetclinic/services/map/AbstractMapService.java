package anushapalliyil.springframework.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import anushapalliyil.springframework.sfgpetclinic.model.BaseEntity;
import anushapalliyil.springframework.sfgpetclinic.model.PetType;

public abstract class AbstractMapService<T extends BaseEntity, ID> {

    protected Map<Long, T> map = new HashMap<>();

    public AbstractMapService(Map<Long, T> map) {
        this.map = map;
    }

    public AbstractMapService() {
    }

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object){

        if(object != null) {
            if(object.getId() == null){
                object.setId(getNextId());
            }
            
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        return Collections.max(map.keySet()) + 1;
    }

    @Override
    public String toString() {
        return "AbstractMapService [map=" + map + "]";
    }

    public Map<Long, T> getMap() {
        return map;
    }

    public void setMap(Map<Long, T> map) {
        this.map = map;
    }

    public PetType save(PetType object) {
        return null;
    }
}