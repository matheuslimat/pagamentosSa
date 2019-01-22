package pagamentossa.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagamentossa.domain.Cliente;
import pagamentossa.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void createCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public List<Cliente> readAllCliente() {
		return clienteRepository.findAll();
	}

	public Optional<Cliente> readById(Long id) {
		return clienteRepository.findById(id);
	}

	public void updateCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	public String getNumCartao(String cpf, String bin) {
		int max = 100000000;
		int min = 0;
		String parte1 = cpf.substring(0, 4);
		parte1 = parte1.concat(bin);

		Random gerador = new Random();
		int num = gerador.nextInt((max - min) + min);
		parte1 = parte1 + num;
		return parte1;
	}
}
