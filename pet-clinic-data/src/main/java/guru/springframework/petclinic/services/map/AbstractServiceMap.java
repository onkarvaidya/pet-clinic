package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.BaseEntity;
import guru.springframework.petclinic.services.CRUDEntityService;

import java.util.*;

public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> entities = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(entities.values());
    }

    public T findById(ID id) {
        return entities.get(id);
    }

    public T save(T entity) {

        if (entity == null) {
            return null;
        }

        if (entity.getId() == null) {
            entities.put(getNextId(), entity);
        }

        return entity;
    }

    public void delete(T entity) {
        entities.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    public void deleteById(ID id) {
        entities.remove(id);
    }

    private Long getNextId () {

        if (entities.isEmpty()) {
            return 1L;
        }
        return Collections.max(entities.keySet()) + 1;
    }
}
