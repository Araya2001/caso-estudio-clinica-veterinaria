package tech.aarayaj.casoestudioclinicaveterinaria.ui.grid;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Pet;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetOwnerService;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetService;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.form.PetForm;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.layout.MainAppLayout;

@Route(value = "pet-grid", layout = MainAppLayout.class)
public class PetGrid extends BaseEntityGrid<Pet> {

    public PetGrid(PetService petService, PetOwnerService petOwnerService) {
        super(
                new Grid<>(Pet.class, true),
                new PetForm(petService, petOwnerService),
                petService,
                "Pet Table"
        );

        super.fillGrid();
    }
}