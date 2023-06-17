package com.autobots.automanager.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Mercadoria;

@Component
public class SelecionarMercadoria implements Selecionador<Mercadoria, Long>{

    @Override
    public Mercadoria selecionar(List<Mercadoria> lista, Long id) {
        for (Mercadoria mercadoria : lista) {
            if (mercadoria.getId().longValue() == id.longValue()) {
                return mercadoria;
            }
        }
        return null;
    }
    
}
