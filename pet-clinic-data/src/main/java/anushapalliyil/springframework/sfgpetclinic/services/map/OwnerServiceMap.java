package anushapalliyil.springframework.sfgpetclinic.services.map;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import anushapalliyil.springframework.sfgpetclinic.model.Owner;
import anushapalliyil.springframework.sfgpetclinic.model.Pet;
import anushapalliyil.springframework.sfgpetclinic.services.OwnerService;
import anushapalliyil.springframework.sfgpetclinic.services.PetService;
import anushapalliyil.springframework.sfgpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

//    public OwnerServiceMap(Map<Long, Owner> map) {
  //  public AbstractMapService(Owner a , Long b ) {
  //          super();
  //  }

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        super();
        this.petTypeService = petTypeService;
        this.petService = petService;
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

        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });

            }

            return super.save(null, object);
        } else {
            return null;
        }

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
