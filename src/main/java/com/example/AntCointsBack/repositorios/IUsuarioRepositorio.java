package com.example.AntCointsBack.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AntCointsBack.Modelos.Usuario;

// 
@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario,Integer> {

    // GUARDAR
    // BUSCAR POR ID
    // BUSCAR TODOS LOS REGISTROS
    // MODIFICCAR POR ID 
    // ELIMINAR POR ID 
    
}
