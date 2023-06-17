package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Servico;

@Component
public class servicoHateos implements hateos<Servico> {
    @Override
    public void addLink(Servico t) {
        
    }

    @Override
    public void addLink(List<Servico> list) {
        for (Servico s : list) {
            
        }
    }
    
}
