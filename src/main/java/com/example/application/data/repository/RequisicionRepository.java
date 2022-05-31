package com.example.application.data.repository;

import com.example.application.data.entity.Requisicion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RequisicionRepository extends JpaRepository<Requisicion, UUID> {

}
