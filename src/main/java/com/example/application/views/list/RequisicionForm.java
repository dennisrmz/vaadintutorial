package com.example.application.views.list;

import com.example.application.data.entity.Requisicion;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.converter.StringToDoubleConverter;
import com.vaadin.flow.data.converter.StringToIntegerConverter;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.component.textfield.TextField;


public class RequisicionForm extends FormLayout {
    Binder<Requisicion> binder = new BeanValidationBinder<>(Requisicion.class);

    TextField anexo = new TextField("Anexo");
    TextField detalleproductosnuevos =  new TextField("Detalle productos nuevos");
    DatePicker fechaentrega =  new DatePicker("Fecha Entrega");
    DatePicker fechasolicitudr =  new DatePicker("Fecha Solicitud");
    TextField jefedepto =  new TextField("Jefe Departamento");
    NumberField recibidopor =  new NumberField("Recibido Por");
    TextField solicitadapor =  new TextField("Solicitada Por");
    DatePicker validahasta =  new DatePicker("Valida Hasta");

    Button save = new Button("Save");
    Button cancel = new Button("Cancel");
    private Requisicion requisicion;

    public RequisicionForm() {
        addClassName("requisicion-form");
        binder.bindInstanceFields(this);
        System.err.println(anexo);
        add(
                anexo,
                detalleproductosnuevos,
                fechaentrega,
                fechasolicitudr,
                jefedepto,
                recibidopor,
                solicitadapor,
                validahasta,
                createButtonLayout()
        );
    }


    public void setRequisicion(Requisicion requisicion){
        this.requisicion = requisicion;
        binder.readBean(requisicion);
    }


    private Component createButtonLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        save.addClickListener(event -> validateAndSave());
        cancel.addClickListener(event -> fireEvent(new CloseEvent(this)));

        save.addClickShortcut(Key.ENTER);
        cancel.addClickShortcut(Key.ESCAPE);

        return new HorizontalLayout(save, cancel);
    }


    private void validateAndSave() {
        try {
            binder.writeBean(requisicion);
        System.err.println("validateAndSave");
        System.err.println(requisicion.getAnexo());
            fireEvent(new SaveEvent(this, requisicion));
        } catch (ValidationException e) {

           e.printStackTrace();
       }
    }


    public static abstract class RequisicionFormEvent extends ComponentEvent<RequisicionForm> {
        private Requisicion requisicion;

        protected RequisicionFormEvent(RequisicionForm source, Requisicion requisicion) {
            super(source, false);
            this.requisicion = requisicion;
            System.err.println("RequisicionFormEvent");
            System.err.println(requisicion.getAnexo());
        }

        public Requisicion getRequisicion() {
            return requisicion;
        }

    }
    public static class SaveEvent extends RequisicionFormEvent {
        SaveEvent(RequisicionForm source, Requisicion requisicion) {
            super(source, requisicion);
        }
    }

    public static class DeleteEvent extends RequisicionFormEvent {
        DeleteEvent(RequisicionForm source, Requisicion requisicion) {
            super(source, requisicion);
        }

    }

    public static class CloseEvent extends RequisicionFormEvent {
        CloseEvent(RequisicionForm source) {
            super(source, null);
        }
    }

    public <T extends ComponentEvent<?>> Registration addListener(Class<T> eventType,
                                                                  ComponentEventListener<T> listener) {
        return getEventBus().addListener(eventType, listener);
    }
}


