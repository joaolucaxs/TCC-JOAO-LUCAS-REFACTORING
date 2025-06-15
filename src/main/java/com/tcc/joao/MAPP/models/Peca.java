package com.tcc.joao.MAPP.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "obra", schema = "gerenciamento")
public class Peca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "Titulo da peça deve ser obrigatório")
	@NotBlank(message = "Titulo da peça não pode ser em branco")
	private String tituloPeca;
	private String tipologia;
	private String formaAssociativa;
	private String relacaoCultural;
	private String tecnica;
	private String classificacao;
	private String produto;

	
	@Override
	public int hashCode() {
		return Objects.hash(classificacao, formaAssociativa, id, produto, relacaoCultural, tecnica, tipologia,
				tituloPeca);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		return Objects.equals(classificacao, other.classificacao)
				&& Objects.equals(formaAssociativa, other.formaAssociativa) && Objects.equals(id, other.id)
				&& Objects.equals(produto, other.produto) && Objects.equals(relacaoCultural, other.relacaoCultural)
				&& Objects.equals(tecnica, other.tecnica) && Objects.equals(tipologia, other.tipologia)
				&& Objects.equals(tituloPeca, other.tituloPeca);
	}


	public Peca() {
	};

	
	public Peca(Long id, String tituloPeca, String tipologia, String formaAssociativa,
			String relacaoCultural, String tecnica, String classificacao, String produto) {
		super();
		this.id = id;
		this.tituloPeca = tituloPeca;
		this.tipologia = tipologia;
		this.formaAssociativa = formaAssociativa;
		this.relacaoCultural = relacaoCultural;
		this.tecnica = tecnica;
		this.classificacao = classificacao;
		this.produto = produto;
	}

	public Peca(Peca obj) {
		this.id = obj.id;
		this.tituloPeca = obj.tituloPeca;
		this.tipologia = obj.tipologia;
		this.formaAssociativa = obj.formaAssociativa;
		this.relacaoCultural = obj.relacaoCultural;
		this.tecnica = obj.tecnica;
		this.classificacao = obj.classificacao;
		this.produto = obj.produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getTituloPeca() {
		return tituloPeca;
	}

	public void setTituloPeca(String tituloPeca) {
		this.tituloPeca = tituloPeca;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getFormaAssociativa() {
		return formaAssociativa;
	}

	public void setFormaAssociativa(String formaAssociativa) {
		this.formaAssociativa = formaAssociativa;
	}

	public String getRelacaoCultural() {
		return relacaoCultural;
	}

	public void setRelacaoCultural(String relacaoCultural) {
		this.relacaoCultural = relacaoCultural;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	

}
