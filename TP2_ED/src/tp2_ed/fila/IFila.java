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