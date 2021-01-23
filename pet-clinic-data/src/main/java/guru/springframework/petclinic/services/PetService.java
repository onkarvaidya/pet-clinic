package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.model.Vet;

import java.util.Set;

public interface PetService {

    Vet saveVet(Pet pet);

    Vet findById(Long id);

    Set<Pet> findAll();
}
