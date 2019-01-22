package pagamentossa.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagamentossa.domain.Cartao;
import pagamentossa.repository.CartaoRepository;

@Service
public class CartaoService {
	@Autowired
	private CartaoRepository cartaoRepository;
	
	public void createCartao(Cartao cartao) {
		cartaoRepository.save(cartao);
	}

	public List<Cartao> readAllCartao() {
		return cartaoRepository.findAll();
	}

	public Optional<Cartao> readById(Long id) {
		return cartaoRepository.findById(id);
	}

	public void updateCartao(Cartao cartao) {
		cartaoRepository.save(cartao);
	}

	public void deleteCliente(Long id) {
		cartaoRepository.deleteById(id);
	}

	public String getNumCartao(String cpf, String bin) {
		int max = 100000000;
		int min = 0;
		String parte = cpf.substring(0, 4);
		parte = bin.concat(parte);

		Random gerador = new Random();
		int num = gerador.nextInt((max - min) + min);
		parte = parte + num;
		return parte;
	}
}
