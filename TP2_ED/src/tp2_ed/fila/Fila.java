/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.fila;

import tp2_ed.Pokemon;

public class Fila implements IFila {

	private No inicio;
	private No fim;
	private int nElementos = 0;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	@Override
	public boolean add(Pokemon p) {
		No novo = new No(p);
		if (inicio == null) {
			inicio = novo;
		} else {
			fim.setProx(novo);
		}
		fim = novo;
		nElementos++;
		return true;
	}

	@Override
	public boolean remove() {
		if (inicio != null) {
			if (inicio == fim) {
				inicio = null;
				fim = null;
			} else {
				inicio = inicio.getProx();
			}
			nElementos--;
			return true;
		}
		return false;
	}

	public Pokemon removeFirst() {
		Pokemon info = null;
		if (inicio != null) {
			info = inicio.getInfo();
			inicio = inicio.getProx();
		}
		return info;
	}

	@Override
	public boolean isEmpty() {
		return (inicio == null);
	}

	@Override
	public int size() {
		return this.nElementos;
	}

	public int contarTipo(String tipo) {

		No atual = inicio;
		int nPokemonFogo = 0;
		while (atual != null) {
			if (atual.getInfo().getTipo().equalsIgnoreCase(tipo)) {
				nPokemonFogo++;
			}

			atual = atual.getProx();
		}
		return nPokemonFogo;
	}

	public Fila removePokemonByType(String type) {
		Fila nova = new Fila();
		No atual = inicio;

		Pokemon pokemon = inicio.getInfo();

//		pokemon = removeFirst();
//		nova.add(pokemon);

		while (atual != null) {

			if (atual.getInfo().getTipo().equalsIgnoreCase(type)) {
				removeFirst();
			} else {
				pokemon = removeFirst();
				nova.add(pokemon);
			}

			atual = atual.getProx();
		}
		return nova;
	}

	public int ordenaFilaPokemon(No node, Pokemon pokemon) {
		int result, aux;

		aux = pokemon.getNome().compareTo(node.getInfo().getNome());
		
		
	}

	@Override
	public String toString() {
		StringBuilder values = new StringBuilder();
		No atual = inicio;
		while (atual != null) {
			values.append(atual.getInfo());
			values.append("\n");
			atual = atual.getProx();
		}
		values.append("Fila [nElementos=" + nElementos + "]");

		return values.toString();
	}

}
