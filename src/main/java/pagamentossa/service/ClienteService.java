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
		Cliente cliente = fromDto(clienteDTO);
		contaService.createConta(contaService.fromDto(clienteDTO));
		return clienteRepository.save(cliente);
	}

	private Cliente fromDto(CriacaoClienteContaDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setNome(clienteDTO.getNome());
		cliente.setCpf(clienteDTO.getCpf());
		cliente.setDtNascimento(clienteDTO.getDtNascimento());
		cliente.setSexo(clienteDTO.getSexo());
		return cliente;
	}

	public List<Cliente> readAll() {
		return clienteRepository.findAll();
	}

	public Cliente readById(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Id inválido. Por favor, tente novamente!"));
	}

	public void updateCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void deleteCliente(Long id) {
		readById(id);
		clienteRepository.deleteById(id);
	}
}
