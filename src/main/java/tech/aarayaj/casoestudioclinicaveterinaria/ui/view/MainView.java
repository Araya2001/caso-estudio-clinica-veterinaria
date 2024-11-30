package tech.aarayaj.casoestudioclinicaveterinaria.ui.view;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.dialog.HomeDialog;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.layout.MainAppLayout;

@Route(value = "", layout = MainAppLayout.class)
public class MainView extends VerticalLayout {


    public MainView() {
        addClassName("main-view");

        add(new HomeDialog());
    }


}
