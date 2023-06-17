package com.autobots.automanager.utils;

import java.util.List;

import com.autobots.automanager.entitades.Venda;

public class SelecionarVenda implements Selecionador<Venda, Long> {
    
    @Override
    public Venda selecionar(List<Venda> lista, Long id) {
        for (Venda venda : lista) {
            if (venda.getId().longValue() == id.longValue()) {
                return venda;
            }
        }
        return null;
    }
}
