/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.arvore;

import java.text.Collator;
import tp2_ed.Pokemon;

/**
 *
 * @author tadeu
 */
public class Arvore implements IArvore {

    private No raiz;
    private int numElementos;

    public Arvore() {
        raiz = null;
        numElementos = 0;
    }

    @Override
    public int size() {
        return size(this.raiz);
    }

    private int size(No atual) {
        if (atual == null) {
            return 0;
        }
        return size(atual.getEsq()) + 1
                + size(atual.getDir());
    }

    @Override
    public boolean isEmpty() {
        return (this.raiz == null);
    }

    public boolean addChave(Pokemon poke) {
        int chave = (numElementos + 1);
        if (chave % 2 != 0) {
            chave = (numElementos * -1);
        }
        No novo = new No(chave, poke);
        if (this.raiz == null) {
            this.raiz = novo;
            return true;
        }
        numElementos++;
        add(this.raiz, novo);
        return true;
    }

    @Override
    public synchronized void add(Pokemon inserido) {//metodo para inserir nós na árvore
        if (this.raiz == null) {//se a raiz é nula
            raiz = new No(inserido);//cria objeto do tipo Nó, com o parametro inserido e cria o primeiro nó da árvore
        } else {//se já possuir uma raiz na árvore
            inserir(raiz, inserido);//chama o método inserir passando a raiz e o valor a ser inserido no novo nó
        }
    }

    public void inserir(No node, Pokemon pokemon) {//método para inserir nós na árvore
        int result, aux;
        result = Collator.getInstance().compare(pokemon.getNome(), node.getPokemon().getNome());
        //compara o pokemon adicionado com o atual da arvore
        aux = pokemon.getNome().compareTo(node.getPokemon().getNome());
        if (aux < 0 || aux == 0) {//se o nome do pokemon a inserir é uma consoante anterior que a do nó atual
            if (node.getEsq() != null) {//se já existir um nó do lado esquerdo do nó atual
                inserir(node.getEsq(), pokemon);//chama a funcao recursiva inserir do lado esquerdo do nó atual
            } else {//se não existir nó do lado esquerdo
                //System.out.println("Inserindo " + pokemon.getNome() + " a esquerda do pokemon " + node.getPokemon().getNome());
                node.setEsq(new No(pokemon));//cria novo nó com o valor passado em parametro e insere-o na árvore do lado esquerdo do nó atual
            }
        } else if (aux > 0) {//se o nome do pokemon a inserir é uma consoante posterior a que a do nó atual
            if (node.getDir() != null) {//se já existir um nó do lado direito do nó atual
                inserir(node.getDir(), pokemon);//chama a funcao recursiva inserir do lado direito do nó atual
            } else {//se não existir nó do lado direito
                //System.out.println("Inserindo " + pokemon.getNome() + " a direita do pokemon " + node.getPokemon().getNome());
                node.setDir(new No(pokemon));//cria novo nó com o valor passado em parametro e insere-o na árvore do lado direito do nó atual
            }
        }
    }

    private boolean add(No atual, No novo) {
        if (novo.getChave() == atual.getChave()) {
            return false;
        } else if (novo.getChave() < atual.getChave()) {
            if (atual.getEsq() == null) {
                atual.setEsq(novo);
                return true;
            } else {
                return add(atual.getEsq(), novo);
            }
        } else {
            if (atual.getDir() == null) {
                atual.setDir(novo);
                return true;
            } else {
                return add(atual.getDir(), novo);
            }
        }
    }

    @Override
    public int countFire() {
        return contTipoFogo(raiz);
    }

    private int contTipoFogo(No atual) {
        if (atual == null) {
            return 0;
        }
        if (atual.getPokemon().getTipo().toLowerCase().contains("fogo")) {
            return contTipoFogo(atual.getEsq()) + 1 + contTipoFogo(atual.getDir());
        }
        return contTipoFogo(atual.getEsq()) + 0 + contTipoFogo(atual.getDir());
    }

    @Override
    public boolean remove(int chave) {
        No atual = raiz;
        No pai = raiz;
        return remove(atual, pai, chave);
    }

    private boolean remove(No atual, No pai, int chave) {
        if (atual == null) {
            return false; // nodo não encontrado
        } else if (atual.getChave() == chave) {
            return removeEncontrado(atual, pai); //encontrou o nodo a ser removido
        } else if (atual.getChave() > chave) {
            return remove(atual.getEsq(), atual, chave); //desce a esquerda
        } else {
            return remove(atual.getDir(), atual, chave); //desce a direita
        }
    }

//    public void ordenaPokemons(Arvore original){
//        Arvore nova = new Arvore();
//        No aux = original.getRaiz();
//        while(aux != null){
//            if(aux.getPokemon().getNome().)
//        }
//    }
    private boolean removeEncontrado(No atual, No pai) {
// nodo é folha (sem filhos)
        if (atual.getEsq() == null && atual.getDir() == null) {
            return removeFolha(atual, pai);
        } // nodo tem apenas 1 filho
        else if (atual.getEsq() == null || atual.getDir() == null) {
            return removeUmFilho(atual, pai);
        } //nodo a ser removido tem dois filhos
        else {
            return removeDoisFilhos(atual, pai);
        }
    }

    private boolean removeFolha(No atual, No pai) {
        if (atual == raiz) // removendo a raiz
        {
            raiz = null;
        } else if (pai.getEsq() == atual) // nodo a esquerda
        {
            pai.setEsq(null);
        } else //nodo a direita
        {
            pai.setDir(null);
        }
        return true;
    }

    private boolean removeUmFilho(No atual, No pai) {
        if (atual == raiz) {// removendo a raiz
            if (atual.getEsq() != null) {
                raiz = atual.getEsq();
            } else {
                raiz = atual.getDir();
            }
        } else if (pai.getEsq() == atual) { // nodo a esquerda
            if (atual.getEsq() != null) {
                pai.setEsq(atual.getEsq());
            } else {
                pai.setEsq(atual.getDir());
            }
        } else { //nodo a direita
            if (atual.getEsq() != null) {
                pai.setDir(atual.getEsq());
            } else {
                pai.setDir(atual.getDir());
            }
        }
        return true;
    }

    private boolean removeDoisFilhos(No atual, No pai) {
        No sucessor = atual.getDir();
        No paiSucessor = atual;
        while (sucessor.getEsq() != null) {//localizar sucessor
            paiSucessor = sucessor;
            sucessor = sucessor.getEsq();
        }
        if (sucessor == atual.getDir()) { //nodo a direita do atual
            sucessor.setEsq(atual.getEsq());
            if (atual == raiz) {
                raiz = sucessor;
            } else if (pai.getEsq() == atual) {
                pai.setEsq(sucessor);
            } else {
                pai.setDir(sucessor);
            }
        } else {
            paiSucessor.setEsq(sucessor.getDir());
            sucessor.setDir(atual.getDir());
            sucessor.setEsq(atual.getEsq());
            if (atual == raiz) {
                raiz = sucessor;
            } else if (pai.getEsq() == atual) {
                pai.setEsq(sucessor);
            } else {
                pai.setDir(sucessor);
            }
        } //nodo a esquerda
        return true;
    }

    @Override
    public String toString() {
        return toString(this.raiz);
    }

    public No getRaiz() {
        return raiz;
    }

    @Override
    public boolean removePokemonsAgua() {
        return removeTipoAgua(this.raiz, this.raiz);
    }

    public boolean removeTipoAgua(No atual, No pai) {
        if (atual == null) {
            return false;
        }
        if (atual.getPokemon().getTipo().toLowerCase().contains("agua")) {
            removeRecursivo(atual, pai);
        }
        removeTipoAgua(atual.getEsq(), atual);
        removeTipoAgua(atual.getDir(), atual);

        return true;
    }

    private boolean removeRecursivo(No atual, No pai) {
        if (atual != null) {
            if (atual.getPokemon().getTipo().toLowerCase().contains("agua")) {
                removeEncontrado(atual, pai);
            } else {
                removeRecursivo(atual.getEsq(), atual);
                removeRecursivo(atual.getDir(), atual);
            }
        }
        return false;
    }

    private String toString(No atual) {
        if (atual == null) {
            return "\n ";
        }
        return toString(atual.getEsq())
                + atual.imprimir()
                + toString(atual.getDir());
    }

}
