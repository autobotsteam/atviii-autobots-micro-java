package com.autobots.automanager.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entitades.Documento;
import com.autobots.automanager.entitades.Usuario;
import com.autobots.automanager.services.UsuarioServico;
import com.autobots.automanager.utils.SelecionarUsuario;

@RestController
@RequestMapping("/usuario/documento")
public class DocumentoController {

    @Autowired
    private UsuarioServico usuarioServico;
    @Autowired
    private SelecionarUsuario selecionador;
    
    @GetMapping("/{id}")
    public ResponseEntity<Set<Documento>> listar(@PathVariable Long id) {
        List<Usuario> usuarios = usuarioServico.pegarTodos();
        Usuario usuario = selecionador.selecionar(usuarios, id);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(usuario.getDocumentos());
        }
    }
}
