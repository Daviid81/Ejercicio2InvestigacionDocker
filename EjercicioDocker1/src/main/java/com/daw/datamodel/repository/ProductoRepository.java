package com.daw.datamodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.datamodel.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
