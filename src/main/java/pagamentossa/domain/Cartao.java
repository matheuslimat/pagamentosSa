package pagamentossa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartoes")
public class Cartao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cartao")
	private Long id;
	
	@Column(name = "nome_embossing")
	private String nomeEmbossado;
	
	@Column(name = "numero_cartao", unique = true)
	private Long numeroCartao;
	
	@Column(name = "data_validade")
	private Date dtValidade;
	
	@Column(name = "data_emissao")
	private Date dtEmissao;

	@Column(length = 3)
	private String cvv;
	
	@Column(name = "nome_emissor")
	private String nomeEmissor;
	
	@OneToOne
	@JoinColumn(name = "conta_id")
	private Conta conta;
	
	public Cartao() {
		
	};
	

	public Cartao(String nomeEmbossado, Date dtValidade, Date dtEmissao, String cvv,
			String nomeEmissor) {
		this.nomeEmbossado = nomeEmbossado;
		this.dtValidade = dtValidade;
		this.dtEmissao = dtEmissao;
		this.cvv = cvv;
		this.nomeEmissor = nomeEmissor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeEmbossado() {
		return nomeEmbossado;
	}


	public void setNomeEmbossado(String nomeEmbossado) {
		this.nomeEmbossado = nomeEmbossado;
	}


	public Date getDtValidade() {
		return dtValidade;
	}


	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}


	public Date getDtEmissao() {
		return dtEmissao;
	}


	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}


	public String getNomeEmissor() {
		return nomeEmissor;
	}


	public void setNomeEmissor(String nomeEmissor) {
		this.nomeEmissor = nomeEmissor;
	}
	
	public Conta getConta() {
		return this.conta;
	}

}
