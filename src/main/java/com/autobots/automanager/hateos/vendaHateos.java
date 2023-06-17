package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Venda;

@Component
public class vendaHateos implements hateos<Venda> {

    @Override
    public void addLink(Venda t) {
        
    }

    @Override
    public void addLink(List<Venda> list) {
        for (Venda v : list) {
            
        }
    }
    
}
