package com.example.evidenciasguiasiete.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.evidenciasguiasiete.entities.Producto;
import com.example.evidenciasguiasiete.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin("*")
public class ProductoController {

    @Autowired
    ProductoService service;

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    List<Producto> getAll(){
      return service.getAll();
  }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto save(@RequestBody Producto producto){   

        return service.save(producto);
    }


}
