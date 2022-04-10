package anushapalliyil.springframework.sfgpetclinic.services;

import java.util.Set;

import anushapalliyil.springframework.sfgpetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
    
}
