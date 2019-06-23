/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.fila;

import tp2_ed.Pokemon;

public class No {

	private Pokemon info;
	private No prox;
	private No anterior;

	public No(Pokemon pok) {
		this.info = pok;
		this.prox = null;
	}

	public Pokemon getInfo() {
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

	public void imprimir() { 
        System.out.println(info);
        if (prox != null) prox.imprimir();
    }
}
