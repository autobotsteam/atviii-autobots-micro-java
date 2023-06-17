package com.autobots.automanager.dto;

import java.util.List;

import com.autobots.automanager.entitades.CredencialUsuarioSenha;
import com.autobots.automanager.entitades.Documento;
import com.autobots.automanager.entitades.Email;
import com.autobots.automanager.entitades.Endereco;
import com.autobots.automanager.entitades.Mercadoria;
import com.autobots.automanager.entitades.Telefone;
import com.autobots.automanager.entitades.Usuario;
import com.autobots.automanager.enumeracoes.PerfilUsuario;

import lombok.Data;

@Data
public class userDTO {
    
    String razaoSocial;
	Usuario usuario;
	Endereco endereco;
	CredencialUsuarioSenha credencial;
	PerfilUsuario perfilUsuario;
	List<Mercadoria> mercadorias;
	List<Documento> documentos;
	List<Telefone> telefones;
	List<Email> emails;

}
