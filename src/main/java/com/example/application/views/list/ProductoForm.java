package com.example.application.views.list;

import com.example.application.data.entity.Producto;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;

public class ProductoForm extends FormLayout {
    Binder<Producto> binder = new BeanValidationBinder<>(Producto.class);

    NumberField idunidades      = new NumberField("Unidad");
    NumberField idcatproducto   = new NumberField("Categoria");
    NumberField precioproducto  = new NumberField("Precio");
    TextField   caracteristicas = new TextField("Caracteristicas");
    TextField   color           = new TextField("Color");
    TextField   utilidad        = new TextField("Utilidad");
    TextField   descripcion     = new TextField("Descripción");
    NumberField medida          = new NumberField("Medida");
    TextField   garantia        = new TextField("Garantia");
    NumberField imagen          = new NumberField("Imagen");
    NumberField cantidad        = new NumberField("Cantidad");
    NumberField minimo          = new NumberField("Minimo");


    private Producto producto;

    public ProductoForm(){

    }
}
