package com.example.application.data.service;
import com.example.application.data.entity.Requisicion;
import com.example.application.data.repository.RequisicionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReqService {

    private final RequisicionRepository requisicionRepository;

    public ReqService(RequisicionRepository requisicionRepository){
        this.requisicionRepository = requisicionRepository;
    }

    public List<Requisicion> findAllRequisiciones(String filterText){
        if(filterText == null || filterText.isEmpty()){
            return requisicionRepository.findAll();
        }else{
            return requisicionRepository.findAll();
        }
    }

    public void saveRequisicion(Requisicion requisicion) {
        if (requisicion == null) {
            System.err.println("Contact is null.");
        }

        requisicionRepository.save(requisicion);
    }
}
