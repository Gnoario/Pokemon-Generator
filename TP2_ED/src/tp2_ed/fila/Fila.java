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

	
	public Fila capturaPokemon(Pokemon pokemon) {
        Fila nova = new Fila();
        No aux = inicio;
        while (aux != null) {
            if (aux.getInfo().getTipo().equalsIgnoreCase("agua")) {
                nova.add(pokemon);
            }
            aux = aux.getProx();
        }
        return nova;
    }

	@Override
	public String toString() {
		return "Fila [nElementos=" + nElementos + "]";
	}

}
