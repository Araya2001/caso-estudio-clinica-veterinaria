package tech.aarayaj.casoestudioclinicaveterinaria.backend.repository;

import org.springframework.stereotype.Repository;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Appointment;

@Repository
public interface AppointmentRepository extends BaseEntityRepository<Appointment> {
}
