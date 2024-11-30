package tech.aarayaj.casoestudioclinicaveterinaria.backend.service;

import lombok.extern.log4j.Log4j2;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.BaseEntityLayerOne;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.repository.BaseEntityRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Log4j2
public abstract class AbstractBaseEntityServiceImpl<Model extends BaseEntityLayerOne> implements BaseEntityService<Model> {

    private final BaseEntityRepository<Model> jpaRepository;

    protected AbstractBaseEntityServiceImpl(BaseEntityRepository<Model> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Model save(Model entity) {
        try {
            return jpaRepository.save(entity);
        } catch (Exception e) {
            log.error(e);
        }
        return null;
    }

    @Override
    public List<Model> saveAll(List<Model> entities) {
        try {
            return jpaRepository.saveAll(entities);
        } catch (Exception e) {
            log.error(e);
        }
        return null;
    }

    @Override
    public Model update(Model entity) {
        if (entity.getId() != null) {
            try {
                return jpaRepository.save(entity);
            } catch (Exception e) {
                log.error(e);
            }
        }
        return null;

    }

    @Override
    public List<Model> updateAll(List<Model> entities) {
        List<Model> updatableEntities = entities.stream().filter(model -> model.getId() != null).toList();
        try {
            return jpaRepository.saveAll(updatableEntities);
        } catch (Exception e) {
            log.error(e);
        }
        return null;
    }

    @Override
    public Boolean hardDelete(Model entity) {
        try {
            jpaRepository.delete(entity);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e);
        }
        return Boolean.FALSE;
    }

    @Override
    public Boolean hardDeleteAll(List<Model> entities) {
        try {
            jpaRepository.deleteAll(entities);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e);
        }
        return Boolean.FALSE;
    }

    @Override
    public Optional<Model> getByUUID(UUID uuid) {
        return jpaRepository.findById(uuid);
    }

    @Override
    public List<Model> findAll() {
        return jpaRepository.findAll();
    }

}