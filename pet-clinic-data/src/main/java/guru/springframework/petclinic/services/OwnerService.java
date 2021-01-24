package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findByLastName(String lastName);

    Owner save(Owner owner);

    Owner findById(Long id);

    Set<Owner> findAll();
}
