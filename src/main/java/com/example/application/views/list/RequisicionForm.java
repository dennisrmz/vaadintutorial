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
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.component.textfield.TextField;

import java.awt.*;

public class RequisicionForm extends FormLayout {
    Binder<Requisicion> binder = new BeanValidationBinder<>(Requisicion.class);

    TextField anexo = new TextField("Anexo");
    TextField detalleProductosNuevos =  new TextField("Detalle productos nuevos");
    DatePicker fechaEntrega =  new DatePicker("Fecha Entrega");
    DatePicker fechaSolicitudR =  new DatePicker("Fecha Solicitud");
    NumberField jefeDepto =  new NumberField("Jefe Departamento");
    NumberField recibidoPor =  new NumberField("Recibido Por");
    NumberField solicitadaPor =  new NumberField("Solicitada Por");
    DatePicker validaHasta =  new DatePicker("Valida Hasta");

    Button save = new Button("Save");
    Button cancel = new Button("Cancel");
    private Requisicion requisicion;

    public RequisicionForm() {
        addClassName("requisicion-form");
        binder.bindInstanceFields(this);

        add(
                anexo,
                detalleProductosNuevos,
                fechaEntrega,
                fechaSolicitudR,
                jefeDepto,
                recibidoPor,
                solicitadaPor,
                validaHasta,
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
        }

        public Requisicion getRequisicion() {
            return requisicion;
        }

    }
        public static class SaveEvent extends RequisicionForm.RequisicionFormEvent {
            SaveEvent(RequisicionForm source, Requisicion requisicion) {
                super(source, requisicion);
            }
        }

        public static class DeleteEvent extends RequisicionForm.RequisicionFormEvent {
            DeleteEvent(RequisicionForm source, Requisicion requisicion) {
                super(source, requisicion);
            }

        }

        public static class CloseEvent extends RequisicionForm.RequisicionFormEvent {
            CloseEvent(RequisicionForm source) {
                super(source, null);
            }
        }

        public <T extends ComponentEvent<?>> Registration addListener(Class<T> eventType,
                                                                      ComponentEventListener<T> listener) {
            return getEventBus().addListener(eventType, listener);
        }


}


