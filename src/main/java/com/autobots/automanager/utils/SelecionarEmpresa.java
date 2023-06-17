package com.autobots.automanager.utils;


import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Empresa;

@Component
public class SelecionarEmpresa implements Selecionador<Empresa, Long> {

    @Override
    public Empresa selecionar(List<Empresa> lista, Long id) {
        for (Empresa empresa : lista) {
            if (empresa.getId().longValue() == id.longValue()) {
                return empresa;
            }
        }
        return null;
    }
    
}
