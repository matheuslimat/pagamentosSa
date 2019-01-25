package pagamentossa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@Table(name = "emissores")
public class Emissor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_emissor")
	private Long id;

	@Column(name = "nome_fantasia")
	private String nomeFantasia;

	@CNPJ
	private String cnpj;

	private String token;

	@OneToMany
	@JoinColumn(name = "emissor_id")
	private List<Conta> contas;

	public Emissor() {

	}

	public Emissor(String nomeFantasia, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
