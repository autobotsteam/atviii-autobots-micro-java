package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import com.autobots.automanager.controllers.UsuarioController;
import com.autobots.automanager.entitades.Usuario;

@Component
public class userHateos implements hateos<Usuario> {

    @Override
    public void addLink(Usuario t) {
        Link linkProprio = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(UsuarioController.class)
						.pegarTodos())
				.withRel("Clientes");
		t.add(linkProprio);
		Link atualizarUser = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(UsuarioController.class)
						.atualizarUsuario(t.getId(), t))
				.withRel("Atualizar");
		t.add(atualizarUser);
		Link deletarUser = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(UsuarioController.class)
						.DeletarUser(t.getId()))
				.withRel("Deletar");
		t.add(deletarUser);
    }

    @Override
    public void addLink(List<Usuario> list) {
        for (Usuario cliente : list) {
			long id = cliente.getId();
			Link linkProprio = WebMvcLinkBuilder
					.linkTo(WebMvcLinkBuilder
							.methodOn(UsuarioController.class)
							.pegarUsuarioEspecifico(id))
					.withSelfRel();
			cliente.add(linkProprio);
		}
    }
    
}
