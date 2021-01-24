package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDEntityService<Owner, Long> {

    Set<Owner> findByLastName(String lastName);
}
