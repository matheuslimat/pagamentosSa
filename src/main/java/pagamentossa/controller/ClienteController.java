package pagamentossa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import pagamentossa.domain.Cliente;
import pagamentossa.dto.CriacaoClienteContaDTO;
import pagamentossa.service.ClienteService;

@Controller
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> readCliente(@PathVariable Long id) {
		return new ResponseEntity<Cliente>(HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody CriacaoClienteContaDTO clienteDTO) {
		return new ResponseEntity<Cliente>(clienteService.createCliente(clienteDTO), HttpStatus.CREATED);

	}

	@PutMapping
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
		clienteService.updateCliente(cliente);
		return new ResponseEntity<Cliente>(HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<Cliente>> readAll() {
		return new ResponseEntity<List<Cliente>>(clienteService.readAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}

}
