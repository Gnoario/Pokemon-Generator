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
public class Nodo {

    private int info;
    private Nodo prox;
    private Nodo anterior;

    public Nodo(int num) {
        this.info = num;
        this.prox = null;
    }

    public int getInfo() {
        return this.info;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    
    
    public Nodo getProx() {
        return this.prox;
    }

    public void setProx(Nodo n) {
        this.prox = n;
    }
}
