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
public class No {

    private int chave;
    private Pokemon pokemon;
    private No esq;
    private No dir;


    public No(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.dir = this.esq = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public String imprimir() {
        return pokemon + " ";
    }
//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }

}
