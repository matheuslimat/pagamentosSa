package pagamentossa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "CONTAS")
public class Conta {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA")
	private Long id;
	
	@Email
	@Column(name = "EMAIL", length = 100, unique = true, nullable = false)
	private String email;
	
	@Column(name = "SENHA", unique = true, nullable = false)
	private String senha;

	@OneToOne
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente cliente;
	
	@ManyToOne
	private Emissor emissor;
	
	@OneToOne
	private Cartao cartao;
	
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

}
