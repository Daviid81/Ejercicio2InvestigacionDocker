package com.daw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.datamodel.entities.Producto;
import com.daw.datamodel.entities.Usuario;
import com.daw.datamodel.repository.ProductoRepository;
import com.daw.datamodel.repository.UsuarioRepository;

@Service
public class Servicio {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private ProductoRepository productoRepository;

	public List<Usuario> obtenerUsuarios() {
		return usuarioRepository.findAll();
	}

	public List<Producto> obtenerProductos() {
		return productoRepository.findAll();
	}

}
