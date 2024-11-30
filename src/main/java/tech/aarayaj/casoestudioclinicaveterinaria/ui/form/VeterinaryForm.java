package tech.aarayaj.casoestudioclinicaveterinaria.ui.form;


import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Veterinary;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.VeterinaryService;

@Route("veterinary-form")
public class VeterinaryForm extends BaseEntityForm<Veterinary> {

    private final TextField name = new TextField("Name");
    private final TextField speciality = new TextField("Speciality");
    private final TextField licenseNumber = new TextField("License Number");


    public VeterinaryForm(VeterinaryService veterinaryService) {
        super(veterinaryService, new Binder<>(Veterinary.class), "Veterinary");

        // Configure the speciality
        speciality.setRequiredIndicatorVisible(true);

        // Configure the licenseNumber
        licenseNumber.setRequiredIndicatorVisible(true);

        // Bind instance fields
        binder.bindInstanceFields(this);

        // Add new Entity to Binder
        setEntity(preparedBaseEntityWithAuditAttributes());

        // Add components to Layout
        add(name, speciality, licenseNumber, styledFormButtonLayoutDiv);
    }

    @Override
    public Veterinary createNewEntity() {
        return new Veterinary();
    }
}