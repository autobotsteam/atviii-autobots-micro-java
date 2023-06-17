package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Usuario;

@Component
public class userHateos implements hateos<Usuario> {

    @Override
    public void addLink(Usuario t) {
        
    }

    @Override
    public void addLink(List<Usuario> list) {
        for (Usuario u : list) {
            
        }
    }
    
}
