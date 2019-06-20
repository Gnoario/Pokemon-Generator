/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.fila;

import tp2_ed.Pokemon;

public interface IFila {

    public boolean add(Pokemon p);

    public boolean remove();

    public boolean isEmpty();

    public int size();

    @Override
    public String toString();

}
