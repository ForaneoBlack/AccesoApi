/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5b.instituto.service;

import com.m5b.instituto.model.Usuario;
import com.m5b.instituto.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author foraneoblack
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario create(Usuario user) {
        return usuarioRepository.save(user);
    }
    
    @Override
    public Usuario findById(Integer user) {
        return usuarioRepository.findById(user).orElse(new Usuario());
    }
    
    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
    
    @Override
    public void delete(Integer user) {
        usuarioRepository.deleteById(user);
    }
    
}
