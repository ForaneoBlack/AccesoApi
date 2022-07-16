/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5b.instituto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.m5b.instituto.model.Usuario;
/**
 *
 * @author foraneoblack
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
