package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		 Conta[] contas = new Conta[10];
		 for (int i = 0; i < contas.length; i++) {
		  ContaCorrente conta = new ContaCorrente();
		  conta.deposita(i * 100.0);
		  
		  contas[i] = conta;
		    
		  }
		 
		 double soma = 0; 
		 for (int i = 0; i < contas.length; i++) {
			 soma += contas[i].getSaldo(); 
		 }
		 
		 System.out.println("Foram feitas " + contas.length + 
	" entradas sendo que a m�dia dos saldos dos clientes � " +  soma / contas.length);

	}
}
