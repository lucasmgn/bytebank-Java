package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(555, 445);
		ContaPoupanca cp = new ContaPoupanca(556, 450);
		
		System.out.println(cc);
		System.out.println(cp);

	}

}
