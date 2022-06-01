package com.example.application.data.service;

import com.example.application.data.entity.Producto;
import com.example.application.data.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProService {

    private final ProductoRepository productoRepository;


    public ProService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> findAllProductos(String filterText){
        if(filterText == null || filterText.isEmpty()){
            return productoRepository.findAll();
        }else{
            return productoRepository.findAll();
        }
    }

    private void saveProducto(Producto producto){
        if(producto == null){
            System.err.println("Producto is null.");
        }

        productoRepository.save(producto);
    }
}
