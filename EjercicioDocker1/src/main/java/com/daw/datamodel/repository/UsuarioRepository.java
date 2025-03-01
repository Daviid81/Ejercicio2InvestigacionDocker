package com.daw.datamodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.datamodel.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
