package pagamentossa.service;

import java.util.Date;

import pagamentossa.domain.Cliente;
import pagamentossa.domain.Conta;

public class GeradorCartaoUtils {

	public static void gerarNomeEmbossing(Cliente cliente, Conta conta) {
		String nomeEmbossing = null; 
		if(cliente.getNome() != null) {
			nomeEmbossing = cliente.getNome().toUpperCase();
		}
	}

	private static void gerarNumeroCartao() {

	}

	private static void gerarCvv() {

	}

	private static void calcularDataVencimento() {
	}

}
