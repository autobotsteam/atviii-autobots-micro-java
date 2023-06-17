package com.autobots.automanager.dto;

import java.io.Serializable;
import java.util.Date;

import com.autobots.automanager.entitades.Mercadoria;

import lombok.Data;

@Data
public class mercadoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Date fabricacao;
    private Date cadastro;
    private String nome;
    private String descricao;
    private double valor;
    private Long quantidade;

    public mercadoriaDTO() {
    }


    public mercadoriaDTO(Mercadoria dto){
        this.id = dto.getId();
        this.fabricacao = dto.getFabricao();
        this.cadastro = dto.getCadastro();
        this.nome = dto.getNome();
        this.descricao = dto.getDescricao();
        this.valor = dto.getValor();
        this.quantidade = dto.getQuantidade();
    }
}
