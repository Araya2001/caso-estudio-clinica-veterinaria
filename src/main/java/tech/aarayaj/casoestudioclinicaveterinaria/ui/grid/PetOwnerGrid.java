package tech.aarayaj.casoestudioclinicaveterinaria.ui.grid;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.PetOwner;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.PetOwnerService;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.form.PetOwnerForm;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.layout.MainAppLayout;

@Route(value = "pet-owner-grid", layout = MainAppLayout.class)
public class PetOwnerGrid extends BaseEntityGrid<PetOwner> {

    public PetOwnerGrid(PetOwnerService petOwnerService) {
        super(
                new Grid<>(PetOwner.class, true),
                new PetOwnerForm(petOwnerService),
                petOwnerService,
                "Pet Owner Table"
        );

        super.fillGrid();
    }
}