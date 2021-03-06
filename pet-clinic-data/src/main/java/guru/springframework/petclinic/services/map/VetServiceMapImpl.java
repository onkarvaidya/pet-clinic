package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMapImpl extends AbstractServiceMap<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet entity) {
        return super.save(entity);
    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
