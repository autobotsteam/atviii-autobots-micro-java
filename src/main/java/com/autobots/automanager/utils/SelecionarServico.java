package com.autobots.automanager.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Servico;

@Component
public class SelecionarServico implements Selecionador<Servico, Long> {

    @Override
    public Servico selecionar(List<Servico> servico, Long id) {
        for (Servico servicos : servico) {
            if (servicos.getId().longValue() == id.longValue()) {
                return servicos;
            }
        }
        return null;
    }
    
}
