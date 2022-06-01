package com.example.application.views;


import com.example.application.data.entity.Producto;
import com.example.application.views.list.ProductoForm;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;
import java.awt.*;

@PageTitle("Productos | Gestion de Compras")
@Route(value = "productos", layout = MainLayout.class)
@PermitAll

public class ControllerProducto extends VerticalLayout {

    TextField filterText =  new TextField();

    Grid<Producto> grid = new Grid<>(Producto.class);

    ProductoForm form;
}
