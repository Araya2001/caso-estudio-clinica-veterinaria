package tech.aarayaj.casoestudioclinicaveterinaria.ui.grid;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Appointment;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.AppointmentService;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetService;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.VeterinaryService;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.form.AppointmentForm;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.layout.MainAppLayout;

@Route(value = "appointment-grid", layout = MainAppLayout.class)
public class AppointmentGrid extends BaseEntityGrid<Appointment> {

    public AppointmentGrid(AppointmentService appointmentService, PetService petService, VeterinaryService veterinaryService) {
        super(
                new Grid<>(Appointment.class, true),
                new AppointmentForm(appointmentService, petService, veterinaryService),
                appointmentService,
                "Appointment Table"
        );

        super.fillGrid();
    }
}