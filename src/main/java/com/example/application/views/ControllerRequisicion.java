package com.example.application.views;

import com.example.application.data.entity.Requisicion;
import com.example.application.data.service.ReqService;
import com.example.application.views.list.RequisicionForm;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@PageTitle("Requisiciones | Vaadin CRM")
@Route(value = "requisiciones", layout = MainLayout.class)
@PermitAll

public class ControllerRequisicion extends VerticalLayout {



    TextField filterText =  new TextField();
    Grid<Requisicion> grid = new Grid<>(Requisicion.class);
    RequisicionForm form;

    private ReqService service;

    public ControllerRequisicion(ReqService requisicion) {
        this.service = requisicion;
        addClassName("list-view");
        setSizeFull();

        configureGrid();
        configureForm();
        add(
                getToolbar(),
                getContent()
        );

        updateList();
        closeEditor();
    }

    private Component getToolbar() {
        filterText.setPlaceholder("Filter by Fecha Solicitud...");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY);
        filterText.addValueChangeListener(e -> updateList());

        Button addRequisicionButton = new Button("Añadir Requisición");
        addRequisicionButton.addClickListener(e -> addRequisicion());

        HorizontalLayout toolbar = new HorizontalLayout(filterText, addRequisicionButton);
        toolbar.addClassName("toolbar");

        return toolbar;
    }

    private void closeEditor() {
        form.setRequisicion(null);
        form.setVisible(false);
        removeClassName("editing");
    }

    private void updateList() {
        grid.setItems(service.findAllRequisiciones(filterText.getValue()));
    }

    private Component getContent() {
        HorizontalLayout content = new HorizontalLayout(grid, form);
        content.setFlexGrow(2, grid);
        content.setFlexGrow(1, form);
        content.addClassName("content");
        content.setSizeFull();

        return content;
    }

    private void addRequisicion() {
        grid.asSingleSelect().clear();
        editRequisicion(new Requisicion());

    }

    private void editRequisicion(Requisicion requisicion) {
        if(requisicion == null){
            closeEditor();
        }else{
            form.setRequisicion(requisicion);
            form.setVisible(true);
            addClassName("editing");
        }
    }

    private void configureGrid(){
        grid.addClassName("requisicion-grid");
        grid.setSizeFull();
        grid.setColumns("anexo", "detalleproductosnuevos", "fechaentrega", "fechasolicitudr", "jefedepto", "recibidopor", "solicitadapor", "validahasta");
        //grid.addColumn(estudiantes -> estudiantes.getNombre()).setHeader("Status");
        grid.getColumns().forEach(col -> col.setAutoWidth(true));
    }







    private void configureForm(){
        form = new RequisicionForm();
        form.setWidth("25em");

        form.addListener(RequisicionForm.SaveEvent.class, this::saveRequisicion);
        form.addListener(RequisicionForm.CloseEvent.class, e -> closeEditor());
    }

    private void saveRequisicion(RequisicionForm.SaveEvent event){
        service.saveRequisicion(event.getRequisicion());
        updateList();
        closeEditor();
    }



}
