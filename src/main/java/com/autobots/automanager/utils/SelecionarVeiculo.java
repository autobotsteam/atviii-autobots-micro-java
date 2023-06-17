package com.autobots.automanager.utils;


import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Veiculo;

@Component
public class SelecionarVeiculo implements Selecionador<Veiculo, Long> {
    
        @Override
        public Veiculo selecionar(List<Veiculo> lista, Long id) {
            for (Veiculo veiculo : lista) {
                if (veiculo.getId().longValue() == id.longValue()) {
                    return veiculo;
                }
            }
            return null;
        }
    
}
