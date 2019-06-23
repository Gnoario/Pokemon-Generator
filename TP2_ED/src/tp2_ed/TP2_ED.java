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

		Fila fila = new Fila();

		long inicio = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			Pokemon pokemon = new Pokemon();
			fila.add(pokemon);
		}
		long fim = System.nanoTime();

		System.out.println(fim - inicio);

		System.out.println(fila.contarTipo("fogo"));

		while (!fila.isEmpty()) {
			System.out.println(fila.removeFirst());
		}
	}

}
