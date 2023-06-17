package com.autobots.automanager.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Usuario;

@Component
public class SelecionarUsuario implements Selecionador<Usuario, Long> {
    
    @Override
    public Usuario selecionar(List<Usuario> lista, Long id) {
        for (Usuario usuario : lista) {
            if (usuario.getId().longValue() == id.longValue()) {
                return usuario;
            }
        }
        return null;
    }
}
