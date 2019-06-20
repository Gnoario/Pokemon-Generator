/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.fila;

import tp2_ed.Pokemon;

public class Fila implements IFila {

    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean add(Pokemon p) {
        No novo = new No(p);
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
        No atual = inicio;
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
    
    public Pokemon removeFirst(){
        Pokemon info = null;
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
        No atual = inicio;
        int i = 0;
        while (atual != null) {
            i++;
            atual.getProx();
        }
        return i;
    }

	
}
