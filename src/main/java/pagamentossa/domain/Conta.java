package pagamentossa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "contas")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conta")
	private Long id;
	
	@Email
	@Column(length = 100, unique = true, nullable = true)
	private String email;
	
	@Column(unique = true, nullable = true)
	private String senha;
	
	@Column(name = "status", length = 3)
	private StatusConta statusConta;
	
	@Column(name = "data_criacao")
	private Date dataCriacaoConta;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "emissor_id")
	private Emissor emissor;
	
	public Conta () {
		
	}
	
	public Conta(String email, String senha, Date dataCriacao) {
		super();
		this.email = email;
		this.senha = senha;
		this.dataCriacaoConta = dataCriacao;
	}
	
	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public StatusConta getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(StatusConta statusConta) {
		this.statusConta = statusConta;
	}

	public Date getDataCriacaoConta() {
		return dataCriacaoConta;
	}

	public void setDataCriacaoConta(Date dataCriacaoConta) {
		this.dataCriacaoConta = dataCriacaoConta;
	}

}
