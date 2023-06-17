package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Veiculo;

@Component
public class veiculoHateos implements hateos<Veiculo> {

    @Override
    public void addLink(Veiculo t) {
        
    }

    @Override
    public void addLink(List<Veiculo> list) {
        for (Veiculo v : list) {
            
        }
    }
    
}
