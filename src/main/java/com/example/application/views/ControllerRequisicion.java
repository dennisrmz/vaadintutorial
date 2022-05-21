package com.example.application.views;

import com.example.application.data.entity.Requisicion;
import com.example.application.data.service.ServiceRequisiciones;
import com.example.application.data.service.impl.ServiceImplEstudiantes;
import com.example.application.data.service.impl.ServiceImplRequisiciones;
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

@PageTitle("Requisiciones | Vaadin CRM")
@Route(value = "requisiciones", layout = MainLayout.class)
@PermitAll

public class ControllerRequisicion extends VerticalLayout {
    @Autowired
    @Qualifier("requisicionesServiceImpl")
    private ServiceRequisiciones serviceRequisiciones;

    TextField filterText =  new TextField();
    Grid<Requisicion> grid = new Grid<>(Requisicion.class);

    public ControllerRequisicion(ServiceImplRequisiciones requisicion) {
        this.serviceRequisiciones = requisicion;
        addClassName("list-view");
        setSizeFull();

        configureGrid();
        add(
                getContent()
        );

        updateList();

    }

    private void configureGrid(){
        grid.addClassName("requisicion-grid");
        grid.setSizeFull();
        grid.setColumns("anexo", "detalleProductosNuevos", "fechaEntrega", "fechaSolicitudR", "jefeDepto", "recibidoPor", "solicitudaPor", "validaHasta");
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
        grid.setItems(serviceRequisiciones.ListAllRequisiciones());
    }
}
