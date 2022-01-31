package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSacarrr {
	
	public static void main(String[] args) {

		Conta conta = new ContaCorrente(154, 455);
		conta.deposita(555);
		
		try {
			conta.saca(355);
			
		} catch (SaldoInsuficienteException ex) {
			
			System.out.println("EX: " + ex.getMessage());
		}

		System.out.println("Saldo atual: " + conta.getSaldo());
	}
}
