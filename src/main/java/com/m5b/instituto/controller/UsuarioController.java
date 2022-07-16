/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5b.instituto.controller;

import com.m5b.instituto.model.Usuario;
import com.m5b.instituto.service.UsuarioService;
import java.util.List;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author foraneoblack
 */
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listar() {
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Usuario> create(@RequestBody Usuario user) {
        return new ResponseEntity<>(usuarioService.create(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Usuario> delete(@PathVariable Integer id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Usuario> actualizar(@PathVariable Integer id, @RequestBody Usuario user) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                usuario.setUsuario(user.getUsuario());
                usuario.setPassword(user.getPassword());
                usuario.setIdRol(user.getIdRol());
                return new ResponseEntity<>(usuarioService.create(user), HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }

}
