package tech.aarayaj.casoestudioclinicaveterinaria.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntityLayerTwo extends BaseEntityLayerOne {
    @Column(name = "name", length = 512)
    private String name;
}