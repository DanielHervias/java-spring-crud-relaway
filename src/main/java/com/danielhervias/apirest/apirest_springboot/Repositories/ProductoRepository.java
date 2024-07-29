package com.danielhervias.apirest.apirest_springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhervias.apirest.apirest_springboot.Entities.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
