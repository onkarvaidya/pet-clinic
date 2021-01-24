package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.services.CRUDEntityService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractServiceMap<T, ID> {

    protected Map<ID, T> entities = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(entities.values());
    }

    public T findById(ID id) {
        return entities.get(id);
    }

    public T save(ID id, T entity) {
        entities.put(id, entity);
        return entity;
    }

    public void delete(T entity) {
        entities.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    public void deleteById(ID id) {
        entities.remove(id);
    }
}
