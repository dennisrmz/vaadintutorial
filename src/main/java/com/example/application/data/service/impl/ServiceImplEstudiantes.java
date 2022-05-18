package com.example.application.data.service.impl;

import com.example.application.data.entity.Estudiantes;
import com.example.application.data.repository.EstudianteRepository;
import com.example.application.data.service.ServiceEstudiantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("estudiantesServiceImpl")
@Transactional
public class ServiceImplEstudiantes implements ServiceEstudiantes {

    @Autowired
    @Qualifier("estudiantesRepository")
    private EstudianteRepository repositoryEstudiantes;

    @Override
    public List<Estudiantes> ListAllEstudiantes() {
        return (List<Estudiantes>) repositoryEstudiantes.findAll();
    }
}
