package com.example.application.data.repository;

import com.example.application.data.entity.Estudiantes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("estudiantesRepository")
public interface EstudianteRepository extends CrudRepository<Estudiantes, String> {

}
