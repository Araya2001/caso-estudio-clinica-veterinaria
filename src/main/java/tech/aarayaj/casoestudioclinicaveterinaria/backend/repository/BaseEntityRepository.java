package tech.aarayaj.casoestudioclinicaveterinaria.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.BaseEntityLayerOne;

import java.util.UUID;

@NoRepositoryBean
public interface BaseEntityRepository<Model extends BaseEntityLayerOne> extends JpaRepository<Model, UUID>, JpaSpecificationExecutor<Model> {
}