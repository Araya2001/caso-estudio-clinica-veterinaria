package tech.aarayaj.casoestudioclinicaveterinaria.backend.service;


import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.BaseEntityLayerOne;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BaseEntityService<Model extends BaseEntityLayerOne> {
    Model save(Model entity);

    List<Model> saveAll(List<Model> entities);

    Model update(Model entity);

    List<Model> updateAll(List<Model> entities);

    Boolean hardDelete(Model entity);

    Boolean hardDeleteAll(List<Model> entities);

    Optional<Model> getByUUID(UUID uuid);

    List<Model> findAll();
}
