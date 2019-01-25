package pagamentossa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagamentossa.domain.Cliente;
import pagamentossa.dto.CriacaoClienteContaDTO;
import pagamentossa.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ContaService contaService;

	public Cliente createCliente(CriacaoClienteContaDTO clienteDTO) {
		contaService.createConta(contaService.fromDto(clienteDTO));
		return clienteRepository.save(fromDto(clienteDTO));
	}

	public List<Cliente> readAll() {
		return clienteRepository.findAll();
	}

	public Cliente readById(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Id inválido. Por favor, tente novamente!"));
	}

	public void updateCliente(CriacaoClienteContaDTO clienteDTO) {
		clienteRepository.save(fromDto(clienteDTO));
	}

	public void deleteCliente(Long id) {
		readById(id);
		clienteRepository.deleteById(id);
	}

	private Cliente fromDto(CriacaoClienteContaDTO clienteDTO) {
		return new Cliente(
		clienteDTO.getNome(),
		clienteDTO.getCpf(),
		clienteDTO.getDataNascimento(),
		clienteDTO.getSexo());
	}
}
