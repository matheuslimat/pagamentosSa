package pagamentossa.service;

import org.springframework.beans.factory.annotation.Autowired;

import pagamentossa.domain.Conta;
import pagamentossa.dto.CriacaoClienteContaDTO;
import pagamentossa.repository.ContaRepository;

public class ContaService {

	@Autowired
	private ContaRepository contaRepository;

	public void createConta(Conta conta) {
		contaRepository.save(conta);
	}

	public Conta fromDto(CriacaoClienteContaDTO contaDTO) {
		Conta conta = new Conta();
		conta.setEmail(contaDTO.getEmail());
		conta.setSenha(contaDTO.getSenha());
		return conta;
	}

}
