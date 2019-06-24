/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.arvore;

import tp2_ed.Pokemon;

/**
 *
 * @author tadeu
 */
public interface IArvore {

    public boolean isEmpty();

    public int size();

    @Override
    public String toString();

    public boolean add(Pokemon p);

    public boolean remove(int chave);
}
