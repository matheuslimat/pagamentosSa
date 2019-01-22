package pagamentossa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CPF", unique = true, nullable = false, length = 11)
	private String cpf;

	@Column(name = "DATA_NASCIMENTO")
	private Date dtNascimento;

	@Column(name = "SEXO", length = 10)
	private String sexo;
	
	public Cliente() {
	};

	public Cliente(String nome, String email, String cpf, Date dtNascimento, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
