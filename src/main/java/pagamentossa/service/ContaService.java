package pagamentossa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagamentossa.domain.Conta;
import pagamentossa.dto.CriacaoClienteContaDTO;
import pagamentossa.repository.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository contaRepository;

	public void createConta(Conta conta) {
		contaRepository.save(conta);
	}
	
	public List<Conta> readAll(){
		return contaRepository.findAll();
	}
	
	public Conta readById(Long id) {
		return contaRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("Id inválido. Por favor, tente novamente!"));
	}
	
	public void updateConta(Conta conta) {
		
		contaRepository.save(conta);
	}
	
	public void deleteConta(Long id) {
		readById(id);
		contaRepository.deleteById(id);
	}

	public Conta fromDto(CriacaoClienteContaDTO contaDTO) {
		return new Conta(contaDTO.getEmail(), contaDTO.getSenha(), new Date());
	}

}
