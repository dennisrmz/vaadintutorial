package com.example.application.data.service.impl;

import com.example.application.data.entity.Estudiantes;
import com.example.application.data.entity.Requisicion;
import com.example.application.data.repository.EstudianteRepository;
import com.example.application.data.repository.RequisicionRepository;
import com.example.application.data.service.ServiceRequisiciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("requisicionesServiceImpl")
@Transactional
public class ServiceImplRequisiciones implements ServiceRequisiciones {
    @Autowired
    @Qualifier("requisicionRepository")
    private RequisicionRepository repositoryRequisicion;

    @Override
    public List<Requisicion> ListAllRequisiciones() {
        return (List<Requisicion>) repositoryRequisicion.findAll();
    }
}
