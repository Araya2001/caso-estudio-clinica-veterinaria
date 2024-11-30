package tech.aarayaj.casoestudioclinicaveterinaria.ui.form;


import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.PetOwner;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetOwnerService;

@Route("pet-owner-form")
public class PetOwnerForm extends BaseEntityForm<PetOwner> {

    private final TextField name = new TextField("Name");
    private final TextField address = new TextField("Address");
    private final TextField phoneNumber = new TextField("Phone Number");

    public PetOwnerForm(PetOwnerService petOwnerService) {
        super(petOwnerService, new Binder<>(PetOwner.class), "Pet Owner");

        // Configure the addressField
        address.setMaxLength(1024);
        address.setRequiredIndicatorVisible(true);

        // Configure the phoneNumberField
        phoneNumber.setMaxLength(40);
        phoneNumber.setRequiredIndicatorVisible(true);

        // Bind instance fields
        binder.bindInstanceFields(this);

        // Add new Entity to Binder
        setEntity(preparedBaseEntityWithAuditAttributes());

        // Add components to Layout
        add(name, address, phoneNumber, styledFormButtonLayoutDiv);
    }

    @Override
    public PetOwner createNewEntity() {
        return new PetOwner();
    }
}