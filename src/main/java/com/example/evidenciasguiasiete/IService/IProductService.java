package com.example.evidenciasguiasiete.IService;

import java.util.List;

import com.example.evidenciasguiasiete.entities.Producto;

public interface IProductService {

    public List<Producto> getAll();


    public Producto save(Producto producto);



}
