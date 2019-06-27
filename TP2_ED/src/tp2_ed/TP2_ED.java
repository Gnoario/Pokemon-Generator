/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed;

import java.util.Scanner;

import tp2_ed.fila.Fila;

public class TP2_ED {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Fila filaOriginal = new Fila();

		

		for (int i = 0; i < 1000000; i++) {
			Pokemon pokemon = new Pokemon();
			filaOriginal.add(pokemon);	
		}

	
		
	//	System.out.println(filaOriginal.contarTipo("fogo"));
		
		
	
		
		long inicio = System.nanoTime();
		while (!filaOriginal.isEmpty()) {
			System.out.println(filaOriginal);
			System.out.println();
			System.out.println(filaOriginal.removePokemonByType("Agua"));
			System.out.println(filaOriginal);
		}
		long fim = System.nanoTime();
		System.out.println(fim - inicio);
	}

}
