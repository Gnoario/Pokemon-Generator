/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.vetor;

import tp2_ed.Pokemon;

/**
 *
 * @author tadeu
 */
public class Vetor implements IVetor {

    private Pokemon pokemons[];
    private int numElementos;

    public Vetor(int max) {
        pokemons = new Pokemon[max];
        numElementos = 0;
    }

    public Pokemon[] getMeuVetor() {
        return pokemons;
    }

    public void setMeuVetor(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public boolean add(Pokemon pokemon) {
        if (!isFull()) {
            pokemons[numElementos] = pokemon;
            numElementos++;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Pokemon pokemon) {
        for (Pokemon pokemon1 : pokemons) {
            if (pokemon1 == pokemon) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void ordenaPokemons() {
        for (int i = pokemons.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (pokemons[j + 1] == null) {
                    continue;
                }
                if (pokemons[j] == null || pokemons[j + 1].getNome().compareTo(pokemons[j].getNome()) < 0) {
                    Pokemon temp = pokemons[j + 1];
                    pokemons[j + 1] = pokemons[j];
                    pokemons[j] = temp;
                }
            }
        }
        //System.out.println("Pokemon: " + Arrays.toString(pokemons));
    }

    @Override
    public Pokemon get(int indice) {
        if (indice >= 0 && indice < numElementos) {
            return pokemons[indice];
        }
        return null;
    }

    @Override
    public int indexOf(Pokemon pokemon) {
        for (int i = 0; i < numElementos; i++) {
            if (pokemons[i] == pokemon) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                return true;
            }
        }
        return pokemons.length == 0;
    }

    @Override
    public boolean isFull() {
        if (numElementos != pokemons.length) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(String pokemon) {
        Pokemon vetorAux[] = new Pokemon[numElementos];
        int index = 0;
        for (int i = 0; i < numElementos; i++) {
            if (!pokemons[i].getNome().equalsIgnoreCase(pokemon)) {
                vetorAux[index] = pokemons[i];
                index++;
            }
        }
        numElementos = index;
        pokemons = vetorAux;
        return true;
    }
    @Override
    public void removePokemonsAgua() {
        Pokemon vetorAux[] = new Pokemon[numElementos];
        int index = 0;
        for (int i = 0; i < numElementos; i++) {
            if (!pokemons[i].getTipo().toLowerCase().contains("agua")) {
                vetorAux[index] = pokemons[i];
                index++;
            }
        }
        numElementos = index;
        pokemons = vetorAux;
    }

    @Override
    public boolean set(int indice, Pokemon novoPokemon) {
        if (indice >= 0 && indice < numElementos) {
            pokemons[indice] = novoPokemon;
        }
        return false;
    }

    @Override
    public int size() {
        return numElementos;
    }

    @Override
    public int countFire() {
        int aux = 0;
        for (int i = 0; i < numElementos; i++) {
            if (pokemons[i].getTipo().toLowerCase().contains("fogo")) {
                aux++;
            }
        }
        return aux;
    }

    public void imprimi() {
        for (int i = 0; i < numElementos; i++) {
            System.out.println(pokemons[i] + " ");
        }
    }
}
