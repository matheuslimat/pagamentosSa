package pagamentossa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// mudar esse id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NUM_CARTAO")
	private Long id;
	
	@Column(name = "NOME_EMBOSSADO")
	private String nomeEmbossado;
	
	@Column(name = "TIPO_CARTAO")
	private String tipoCartao;
	
	@Column(name = "DATA_VALIDADE")
	private Date dtValidade;
	
	@Column(name = "DATA_EMISSAO")
	private Date dtEmissao;

	@Column(name = "CVV")
	private String cvv;
	
	@Column(name = "NOME_EMISSOR")
	private String nomeEmissor;
	
	@Column(name = "NOME_GRAFICA")
	private String nomeGrafica;
	
	public Cartao() {};
	

	public Cartao(Long id, String nomeEmbossado, String tipoCartao, Date dtValidade, Date dtEmissao, String cvv,
			String nomeEmissor, String nomeGrafica) {
		super();
		this.id = id;
		this.nomeEmbossado = nomeEmbossado;
		this.tipoCartao = tipoCartao;
		this.dtValidade = dtValidade;
		this.dtEmissao = dtEmissao;
		this.cvv = cvv;
		this.nomeEmissor = nomeEmissor;
		this.nomeGrafica = nomeGrafica;
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


	public String getTipoCartao() {
		return tipoCartao;
	}


	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
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


	public String getNomeGrafica() {
		return nomeGrafica;
	}


	public void setNomeGrafica(String nomeGrafica) {
		this.nomeGrafica = nomeGrafica;
	}

	
	
	
}
