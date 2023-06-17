package com.autobots.automanager.hateos;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import com.autobots.automanager.controllers.MercadoriaController;
import com.autobots.automanager.entitades.Mercadoria;

@Component
public class mercadoriaHateos implements hateos<Mercadoria> {
    @Override
    public void addLink(List<Mercadoria> lista) {
        for(Mercadoria mercadoria : lista) {
			long id = mercadoria.getId();
			Link linkpropio = WebMvcLinkBuilder
					.linkTo(WebMvcLinkBuilder.methodOn(MercadoriaController.class)
							.pegarMercadoriaEspecifica(id))
					.withSelfRel();
			mercadoria.add(linkpropio);
		}
    }

    @Override
    public void addLink(Mercadoria t) {
        Link linkProprio = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(MercadoriaController.class)
						.pegarTodos())
				.withRel("Mercadorias");
		t.add(linkProprio);
		Link atualizarUser = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(MercadoriaController.class)
						.atualizarMercadoria(t.getId(), t))
				.withRel("Atualizar");
		t.add(atualizarUser);
		Link deletarUser = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(MercadoriaController.class)
						.deletarMercadoria(t.getId()))
				.withRel("Deletar");
		t.add(deletarUser);
    }
}
