package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class TesteDaConta {

	public static void main(String[] args) {
		
		
		ContaCorrente c2 = new ContaCorrente();
		c2.agencia = "2";
		c2.numero = 456;
		c2.titular = "Mario Sergio";
		
		c2.deposita(1000);
		
		try {
			c2.saca(200);	
		} catch (Exception e) {
			
		}
		
		
		System.out.println("seu tipo de conta � " + c2.getTipo());
		System.out.println(c2.toString());
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.agencia = "3";
		c3.numero = 900;
		c3.titular = "Alice";
		
		c3.deposita(-90);
		try {
			c3.saca(-10);	
		} catch (Exception e) {
			
		}
		
		
		System.out.println("seu tipo de conta � " + c3.getTipo());
		System.out.println(c3.toString());
		
		SeguroDeVida seg = new SeguroDeVida();
		
		seg.setNumeroApolice(12);
		seg.setTitular("Maria Jose");
		seg.setValor(100);
		
		System.out.println("O Numero da sua Apolice �: " + seg.getNumeroApolice());
		System.out.println("O Valor do seguro �: " + seg.getValor());
	}
}
