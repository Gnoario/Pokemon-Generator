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
public interface IVetor {
        
        public boolean add(Pokemon pokemon);
	public boolean contains(Pokemon pokemon);
	public Pokemon get(int indice);
	public int indexOf(Pokemon pokemon);
	public boolean isEmpty();
	public boolean isFull();	
	public boolean remove(String pokemon);
	public boolean set(int indice, Pokemon novoPokemon);
	public int size();
        
        @Override
	public String toString();
        
}
