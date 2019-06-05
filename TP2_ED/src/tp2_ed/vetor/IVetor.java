/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.vetor;

/**
 *
 * @author tadeu
 */
public interface IVetor {
        
        public boolean add(int item);
	public boolean contains(int item);
	public int get(int indice);
	public int indexOf(int item);
	public boolean isEmpty();
	public boolean isFull();	
	public boolean remove(int item);
	public boolean set(int indice, int novoItem);
	public int size();
        
	public String toString();
        
}
