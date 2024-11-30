package tech.aarayaj.casoestudioclinicaveterinaria.ui.form;


import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Appointment;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Pet;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Veterinary;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.AppointmentService;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetService;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.VeterinaryService;

@Route("appointment-form")
public class AppointmentForm extends BaseEntityForm<Appointment> {

    private final ComboBox<Pet> pet = new ComboBox<>("Pet");
    private final ComboBox<Veterinary> veterinary = new ComboBox<>("Assigned Veterinary");
    private final TextField reason = new TextField("Reason");
    private final TextField observation = new TextField("Observation");
    private final DateTimePicker scheduledDate = new DateTimePicker("Schedule Date");


    public AppointmentForm(AppointmentService appointmentService, PetService petService, VeterinaryService veterinaryService) {
        super(appointmentService, new Binder<>(Appointment.class), "Appointment");

        pet.setItems(petService.findAll());
        pet.setItemLabelGenerator(Pet::getName);
        veterinary.setItems(veterinaryService.findAll());
        veterinary.setItemLabelGenerator(Veterinary::getName);


        // Modify this field to match length from DB
        reason.setMaxLength(512);

        // Modify this field to match length from DB
        observation.setMaxLength(2056);

        // Bind instance fields
        binder.bindInstanceFields(this);

        // Add new Entity to Binder
        setEntity(preparedBaseEntityWithAuditAttributes());

        // Add components to Layout
        add(pet, veterinary, reason, observation, scheduledDate, styledFormButtonLayoutDiv);
    }

    @Override
    public Appointment createNewEntity() {
        return new Appointment();
    }
}