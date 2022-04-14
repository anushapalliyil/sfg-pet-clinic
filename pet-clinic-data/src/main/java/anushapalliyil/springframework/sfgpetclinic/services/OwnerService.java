package anushapalliyil.springframework.sfgpetclinic.services;

import anushapalliyil.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
