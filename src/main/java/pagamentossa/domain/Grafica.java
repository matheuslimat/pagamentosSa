package pagamentossa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grafica implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// mudar esse id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRAFICA")
	private Long id;
	
	@Column(name = "NOME_GRAFICA")
	private String nomeGrafica;
	
	public Grafica() {}

	public Grafica(Long id, String nomeGrafica) {
		super();
		this.id = id;
		this.nomeGrafica = nomeGrafica;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeGrafica() {
		return nomeGrafica;
	}

	public void setNomeGrafica(String nomeGrafica) {
		this.nomeGrafica = nomeGrafica;
	}
	
	
	
	
}
