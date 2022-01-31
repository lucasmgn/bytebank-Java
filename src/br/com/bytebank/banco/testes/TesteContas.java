package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(1414, 5658);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(4545, 4440);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC " + cc.getSaldo() +  ", CP " + cp.getSaldo());
	}
}
