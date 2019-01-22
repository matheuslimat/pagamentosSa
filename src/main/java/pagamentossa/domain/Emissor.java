package pagamentossa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMISSORES")
public class Emissor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMISSOR")
	private Long id;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
	public Emissor() {
		
	}

	public Emissor(String nomeFantasia) {
		super();
		this.nomeFantasia = nomeFantasia;
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

	
}
