package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Empresa;

@Component
public class empresaHateos implements hateos<Empresa> {
    @Override
    public void addLink(Empresa t) {
        
    }
    @Override
    public void addLink(List<Empresa> list) {
        for (Empresa e : list) {
            
        }
    }
}
