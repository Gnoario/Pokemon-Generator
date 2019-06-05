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
public class Lista implements ILista {

    private Nodo inicio;
    private Nodo fim;

    public Lista() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean add(int info) {
        Nodo novo = new Nodo(info);
        if (inicio == null) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }
        fim = novo;
        return true;
    }

    @Override
    public boolean remove() {
        Nodo atual = inicio;
        if (inicio != null) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                while (atual.getProx() != fim) {
                    atual = atual.getProx();
                }
            }
            atual.setProx(null);
            fim = atual;
            return true;
        }
        return false;
    }
    
    public int removeFirst(){
        int info = -1;
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
        Nodo atual = inicio;
        int i = 0;
        while (atual != null) {
            i++;
            atual.getProx();
        }
        return i;
    }

}
