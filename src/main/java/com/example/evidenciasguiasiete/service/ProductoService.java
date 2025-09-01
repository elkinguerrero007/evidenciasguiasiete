package com.example.evidenciasguiasiete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evidenciasguiasiete.IRepository.IProductoRepository;
import com.example.evidenciasguiasiete.IService.IProductService;
import com.example.evidenciasguiasiete.entities.Producto;

import java.util.List;

@Service
public class ProductoService implements IProductService {

    @Autowired
    IProductoRepository repository;

    @Override
    public List<Producto> getAll() {
        return (List<Producto>) repository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    
}
