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
<<<<<<< HEAD

	public void createCliente(Cliente cliente) {
		clienteRepository.save(cliente);
=======
	
	public Cliente createCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
>>>>>>> developer
	}

	public List<Cliente> readAllCliente() {
		return clienteRepository.findAll();
	}
<<<<<<< HEAD

	public Optional<Cliente> readById(Long id) {
		return clienteRepository.findById(id);
=======
	
	public Cliente readById(Long id) {
		return clienteRepository.findById(id).orElseThrow(() -> 
		new IllegalArgumentException("Id inválido. Por favor, tente novamente!")) ;
>>>>>>> developer
	}

	public void updateCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}


}
