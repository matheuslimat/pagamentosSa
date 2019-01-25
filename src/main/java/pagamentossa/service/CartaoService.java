package pagamentossa.service;

import org.springframework.stereotype.Service;

import pagamentossa.domain.Cartao;
import pagamentossa.domain.Cliente;
import pagamentossa.domain.Conta;

@Service
public class CartaoService {
	
	public Cartao createCartao(Cliente cliente, Conta conta) {
		return new Cartao();
	}
	
}
