package pagamentossa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pagamentossa.domain.Cliente;
import pagamentossa.service.ClienteService;

@Controller
@RequestMapping(path = "/clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@GetMapping(path = "/{id}")
	public @ResponseBody ResponseEntity<Cliente> readCliente(@RequestParam Long id) {
		return new ResponseEntity<Cliente>(HttpStatus.OK);

	}

	@PostMapping("/new")
	public @ResponseBody ResponseEntity<Cliente> createCliente(@RequestParam Cliente cliente) {
		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@PutMapping("/atualizacao")
	public @ResponseBody ResponseEntity<Cliente> updateCliente(@RequestParam Cliente cliente) {
		clienteService.updateCliente(cliente);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/all")
	public @ResponseBody ResponseEntity<List<Cliente>> readAll() {
		return new ResponseEntity<List<Cliente>>(clienteService.readAllCliente(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody ResponseEntity<Cliente> deleteCliente(@RequestParam Long id) {
		clienteService.deleteCliente(id);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}

}
