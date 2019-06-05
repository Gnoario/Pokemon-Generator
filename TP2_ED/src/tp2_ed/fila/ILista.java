/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.fila;

/**
 *
 * @author tadeu
 */
public interface ILista {

    public boolean add(int info);

    public boolean remove();

    public boolean isEmpty();

    public int size();

    @Override
    public String toString();

}
