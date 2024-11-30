package tech.aarayaj.casoestudioclinicaveterinaria.ui.layout;


import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.grid.AppointmentGrid;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.grid.PetGrid;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.grid.PetOwnerGrid;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.grid.VeterinaryGrid;
import tech.aarayaj.casoestudioclinicaveterinaria.ui.view.MainView;

@Route("main-app-layout")
public class MainAppLayout extends AppLayout {

    private final DrawerToggle drawerToggle = new DrawerToggle();

    public MainAppLayout() {
        createHeader();
    }

    private void createHeader() {
        // Set the logo for the web page
        H1 logo = new H1("Amigos Peludos");
        logo.getStyle().set("font-size", "var(--lumo-font-size-l)").set("margin", "0");
        logo.addClassName("logo");

        // Add links to drawer
        addToDrawer(createRouterLinkVerticalLayout());

        // Add Components to the Navigation Bar
        addToNavbar(drawerToggle, logo);
    }

    private VerticalLayout createRouterLinkVerticalLayout() {
        // Create Router Links for the drawer
        RouterLink mainView = new RouterLink("Main View", MainView.class);
        RouterLink veterinaryLink = new RouterLink("Veterinary Table", VeterinaryGrid.class);
        RouterLink petLink = new RouterLink("Pet Table", PetGrid.class);
        RouterLink petOwnerLink = new RouterLink("Pet Owner Table", PetOwnerGrid.class);
        RouterLink appointmentLink = new RouterLink("Appointment Table", AppointmentGrid.class);

        // Add Router Links to Vertical Layout
        return new VerticalLayout(
                mainView,
                veterinaryLink,
                petLink,
                petOwnerLink,
                appointmentLink
        );
    }
}
