package tech.aarayaj.casoestudioclinicaveterinaria.ui.grid;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Veterinary;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.service.VeterinaryService;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.form.VeterinaryForm;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.layout.MainAppLayout;

@Route(value = "veterinary-grid", layout = MainAppLayout.class)
public class VeterinaryGrid extends BaseEntityGrid<Veterinary> {

    public VeterinaryGrid(VeterinaryService veterinaryService) {
        super(
                new Grid<>(Veterinary.class, true),
                new VeterinaryForm(veterinaryService),
                veterinaryService,
                "Veterinary Table"
        );

        super.fillGrid();
    }
}