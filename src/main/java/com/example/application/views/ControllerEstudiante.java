    package com.example.application.views;

    import com.example.application.data.entity.Estudiantes;
    import com.example.application.data.service.impl.ServiceImplEstudiantes;
    import com.vaadin.flow.component.Component;
    import com.vaadin.flow.component.grid.Grid;
    import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
    import com.vaadin.flow.component.orderedlayout.VerticalLayout;
    import com.vaadin.flow.component.textfield.TextField;
    import com.vaadin.flow.router.PageTitle;
    import com.vaadin.flow.router.Route;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;

    import javax.annotation.security.PermitAll;

    @PageTitle("Estudiantes | Vaadin CRM")
    @Route(value = "estudiantes", layout = MainLayout.class)
    @PermitAll
    public class ControllerEstudiante extends VerticalLayout {
        @Autowired
        @Qualifier("estudiantesServiceImpl")
        private ServiceImplEstudiantes serviceEstudiantes;

        TextField filterText =  new TextField();
        Grid<Estudiantes> grid = new Grid<>(Estudiantes.class);

        public ControllerEstudiante(ServiceImplEstudiantes service) {
            this.serviceEstudiantes = service;
            addClassName("list-view");
            setSizeFull();

            configureGrid();
            add(
                    getContent()
            );

            updateList();

        }

        private void configureGrid(){
            grid.addClassName("contact-grid");
            grid.setSizeFull();
            grid.setColumns("nombre");
            //grid.addColumn(estudiantes -> estudiantes.getNombre()).setHeader("Status");
            grid.getColumns().forEach(col -> col.setAutoWidth(true));
        }

        private Component getContent() {
            HorizontalLayout content = new HorizontalLayout(grid);
            content.setFlexGrow(2, grid);
            content.addClassName("content");
            content.setSizeFull();

            return content;
        }

        private void updateList() {
            grid.setItems(serviceEstudiantes.ListAllEstudiantes());
        }
    }
