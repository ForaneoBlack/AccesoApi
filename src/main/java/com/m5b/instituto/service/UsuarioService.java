/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5b.instituto.service;

import com.m5b.instituto.model.Usuario;
import java.util.List;

/**
 *
 * @author foraneoblack
 */
public interface UsuarioService {
    public Usuario create(Usuario user);
    public Usuario findById(Integer user);
    public List<Usuario> findAll();
    public void delete(Integer user);
}
