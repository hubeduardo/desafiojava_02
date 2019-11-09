package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {
		Random gerador = new Random();
		List<Conta> contas = new LinkedList<Conta>();

		for (int i = 0; i < 5; i++) {
			
			Conta c1 = new ContaCorrente();
			c1.titular = getrandomNome();
			c1.deposita(gerador.nextInt(1200));
			
			contas.add(c1);
			
		}
		Collections.sort(contas);

		for(Conta item : contas)
		{
			System.out.println("saldo das contas: " + item.getSaldo());
		}

	}

	private static String getrandomNome() {
		Random gerador = new Random();
		ArrayList<String> nomes = new ArrayList<>(); 
		nomes.add("Alice");
		nomes.add("Pedro");
		nomes.add("Joao");
		nomes.add("Mario");
		nomes.add("Jose");
		int index = gerador.nextInt(4);
		return nomes.get(index);
		
	}
}
