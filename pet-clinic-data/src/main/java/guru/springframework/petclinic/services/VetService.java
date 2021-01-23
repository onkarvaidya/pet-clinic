package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet saveVet(Vet vet);

    Vet findById(Long id);

    Set<Vet> findAll();


}
