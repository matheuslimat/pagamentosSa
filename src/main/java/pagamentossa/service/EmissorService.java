package pagamentossa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagamentossa.domain.Emissor;
import pagamentossa.repository.EmissorRepository;

@Service
public class EmissorService{
	
	@Autowired
	private EmissorRepository emissorRepository;

	public Emissor createEmissor(Emissor emissor) {
		return emissorRepository.save(emissor);
	}
	
	public List<Emissor> readAll(){
		return emissorRepository.findAll();
	}
	
	public Emissor readById(Long id) {
		return emissorRepository.findById(id).orElseThrow(() -> 
		new IllegalArgumentException("Id inválido. Por favor, tente novamente!")) ;
	}
	
	public void updateEmissor(Emissor emissor) {
		emissorRepository.save(emissor);
	}
	
	public void deleteEmissor(Long id) {
		readById(id);
		emissorRepository.deleteById(id);
	}
	
}
