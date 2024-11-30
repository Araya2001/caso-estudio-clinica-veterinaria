package tech.aarayaj.casoestudioclinicaveterinaria.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "pet")
public class Pet extends BaseEntityLayerTwo {
    @ManyToOne(cascade = CascadeType.REFRESH, optional = false)
    @JoinColumn(name = "pet_owner_id", nullable = false)
    private PetOwner petOwner;

    @Column(name = "species", nullable = false)
    private String species;

    @Column(name = "breed", nullable = false)
    private String breed;

    @Lob
    @Column(name = "medical_history")
    private String medicalHistory;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Pet pet = (Pet) o;
        return getId() != null && Objects.equals(getId(), pet.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + getName() + ")";
    }
}