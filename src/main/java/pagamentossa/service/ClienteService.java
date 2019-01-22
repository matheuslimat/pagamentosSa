package pagamentossa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagamentossa.domain.Cliente;
import pagamentossa.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente createCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> readAllCliente(){
		return clienteRepository.findAll();
	}
	
	public Cliente readById(Long id) {
		return clienteRepository.findById(id).orElseThrow(() -> 
		new IllegalArgumentException("Id inválido. Por favor, tente novamente!")) ;
	}
	
	public void updateCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
