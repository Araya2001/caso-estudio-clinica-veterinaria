package tech.aarayaj.casoestudioclinicaveterinaria.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "appointment")
public class Appointment extends BaseEntityLayerOne {

    @ManyToOne(cascade = CascadeType.REFRESH, optional = false)
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    @ManyToOne(cascade = CascadeType.REFRESH, optional = false)
    @JoinColumn(name = "veterinary_id", nullable = false)
    private Veterinary veterinary;

    @Column(name = "reason", nullable = false, length = 512)
    private String reason;

    @Column(name = "observation", length = 2056)
    private String observation;

    @Column(name = "scheduled_date", nullable = false)
    private LocalDateTime scheduledDate;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Appointment that = (Appointment) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + getId() + ", " +
                "scheduledDate = " + getScheduledDate() + ", " +
                "pet = " + getPet() + ", " +
                "veterinary = " + getVeterinary() + ", " +
                "reason = " + getReason() + ", " +
                "observation = " + getObservation() + ")";
    }
}