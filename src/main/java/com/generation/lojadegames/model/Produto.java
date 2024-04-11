package com.generation.lojadegames.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@NotBlank(message = "Nome não pode ser vazio")
	@Size(min = 3, max = 30, message = "Minimo do nome 3 letras e o maximo com 30 letras")
	private String nome;
	
	@NotNull(message = "Preco não pode ser vazio")
	@Column(precision = 8, scale = 2)
	private BigDecimal preco;
	
	@NotNull(message = "Quantidade não pode ser vazio")
	private int quantidade;
	
	@NotBlank(message = "Descrição não pode ser vazio")
	@Size(min = 3, max = 100, message = "Minimo do nome 3 letras e o maximo com 100 letras")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
