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
public class No {

    private int info;
    private No prox;
    private No anterior;

    public No(int num) {
        this.info = num;
        this.prox = null;
    }

    public int getInfo() {
        return this.info;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    
    
    public No getProx() {
        return this.prox;
    }

    public void setProx(No n) {
        this.prox = n;
    }
}
