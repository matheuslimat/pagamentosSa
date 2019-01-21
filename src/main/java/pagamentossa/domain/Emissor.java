package pagamentossa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emissor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// mudar esse id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CNPJ")
	private Long id;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
	public Emissor() {}

	public Emissor(Long id, String nomeFantasia) {
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	
}
