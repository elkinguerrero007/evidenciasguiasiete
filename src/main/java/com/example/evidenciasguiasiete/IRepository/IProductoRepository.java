package com.example.evidenciasguiasiete.IRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.evidenciasguiasiete.entities.Producto;


public interface IProductoRepository extends CrudRepository<Producto, Integer> {

}
