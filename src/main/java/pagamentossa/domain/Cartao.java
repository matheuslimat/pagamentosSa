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
@Table(name = "CARTOES")
public class Cartao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA")
	private Long id;
	
	@Column(name = "NOME_EMBOSSADO")
	private String nomeEmbossado;
	
	@Column(name = "NUM_CARTAO", unique = true)
	private Long numeroCartao;
	
	@Column(name = "DATA_VALIDADE")
	private Date dtValidade;
	
	@Column(name = "DATA_EMISSAO")
	private Date dtEmissao;

	@Column(name = "CVV", length = 3)
	private String cvv;
	
	@Column(name = "NOME_EMISSOR")
	private String nomeEmissor;
	
	@OneToOne
	@JoinColumn(name = "CONTA_ID")
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

}
