package com.daw.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daw.datamodel.entities.Producto;
import com.daw.datamodel.entities.Usuario;
import com.daw.service.Servicio;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Servicio servicio;

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
        return servicio.obtenerUsuarios();
    }

    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return servicio.obtenerProductos();
    }
}
