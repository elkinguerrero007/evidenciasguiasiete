package com.example.evidenciasguiasiete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.evidenciasguiasiete.entities.Producto;
import com.example.evidenciasguiasiete.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoWebController {

    @Autowired
    private ProductoService service;

    // Página de inicio (index.jsp)
    @GetMapping("/index")
    public String inicio() {
        return "index";
    }

    // Mostrar formulario (registro.jsp)
    @GetMapping("/registro")
    public String mostrarFormulario() {
        return "registro";
    }

    // Guardar producto desde el formulario
    @PostMapping("/save")
    public String guardarProducto(@RequestParam String nombre,
                                  @RequestParam double precio) {
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        service.save(producto);
        return "redirect:/productos/lista";
    }

    // Listar productos (lista.jsp)
    @GetMapping("/lista")
    public String listarProductos(Model model) {
        model.addAttribute("productos", service.getAll());
        return "lista";
    }
}
