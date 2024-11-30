package tech.aarayaj.casoestudioclinicaveterinaria.backend.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Appointment;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.repository.AppointmentRepository;

@Service
@Log4j2
public class AppointmentServiceImpl extends AbstractBaseEntityServiceImpl<Appointment> implements AppointmentService {

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository jpaRepository) {
        super(jpaRepository);
    }

}
