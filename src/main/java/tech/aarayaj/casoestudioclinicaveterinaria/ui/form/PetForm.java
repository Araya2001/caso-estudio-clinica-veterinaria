package tech.aarayaj.casoestudioclinicaveterinaria.ui.form;


import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Pet;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.PetOwner;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetOwnerService;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetService;

@Route("pet-form")
public class PetForm extends BaseEntityForm<Pet> {

    private final TextField name = new TextField("Name");
    private final ComboBox<PetOwner> petOwner = new ComboBox<>("Pet Owner");
    private final TextField species = new TextField("Species");
    private final TextField breed = new TextField("Breed");
    private final TextArea medicalHistory = new TextArea("Medical History");
    private final IntegerField age = new IntegerField("Age");


    public PetForm(PetService petService, PetOwnerService petOwnerService) {
        super(petService, new Binder<>(Pet.class), "Pet");

        // Configure petOwnerCombo
        petOwner.setItems(petOwnerService.findAll());
        petOwner.setItemLabelGenerator(PetOwner::getName); // Assuming PetOwner has a getName method

        // Configure ageField
        age.setMin(0);  // Assuming age cannot be negative

        // Bind instance fields
        binder.bindInstanceFields(this);

        // Add new Entity to Binder
        setEntity(preparedBaseEntityWithAuditAttributes());

        // Add components to Layout
        add(name, petOwner, species, breed, medicalHistory, age, styledFormButtonLayoutDiv);
    }

    @Override
    public Pet createNewEntity() {
        return new Pet();
    }
}