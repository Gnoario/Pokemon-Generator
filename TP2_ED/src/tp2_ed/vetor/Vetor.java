/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed.vetor;

/**
 *
 * @author tadeu
 */
public class Vetor implements IVetor {

    private int meuVetor[];
    private int numElementos;
    

    public Vetor(int max) {
        meuVetor = new int[max];
        numElementos = 0;
    }

    public int[] getMeuVetor() {
        return meuVetor;
    }

    public void setMeuVetor(int[] meuVetor) {
        this.meuVetor = meuVetor;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public void bubbleSort() {
        int aux;
        for (int j = 0; j < meuVetor.length - 1; j++) {
            for (int i = 0; i < meuVetor.length - 1 - j; i++) {
                if (meuVetor[i] > meuVetor[i + 1]) {
                    aux = meuVetor[i];
                    meuVetor[i] = meuVetor[i + 1];
                    meuVetor[i + 1] = aux;
                }
            }
            for (int i = 0; i < meuVetor.length; i++) {
                System.out.println("Meu vetor é: " + meuVetor[i]);
            }

        }
    }

    public void insert() {
        for (int i = 1; i < meuVetor.length; i++) {
            while (meuVetor[i] < meuVetor[i - 1]) {

            }

        }
    }

    public void selection() {
        int aux, aux2;
        for (int i = 0; i < meuVetor.length; i++) {
            aux = i;
            for (int j = i + 1; j < meuVetor.length; j++) {
                if (meuVetor[j] < meuVetor[aux]) {
                    aux = j;
                }
            }
            aux2 = meuVetor[i];
            meuVetor[i] = meuVetor[aux];
            meuVetor[aux] = aux2;
        }
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println(meuVetor[i] + " ");
        }
    }

    @Override
    public boolean add(int item) {
        if (!isFull()) {
            meuVetor[numElementos] = item;
            numElementos++;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(int item) {
        for (int i = 0; i < meuVetor.length; i++) {
            if (meuVetor[i] == item) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int get(int indice) {
        if (indice >= 0 && indice < numElementos) {
            return meuVetor[indice];
        }
        return -1;
    }

    @Override
    public int indexOf(int item) {
        int m, e = 0;
        int d = this.meuVetor.length - 1;
        while (e <= d) {
            m = (e + d) / 2;
            if (this.meuVetor[m] == item) {
                return m;
            } else if (this.meuVetor[m] < item) {
                e = m + 1;
            } else {
                d = m - 1;
            }
        }
//        for (int i = 0; i < numElementos; i++) {
//            if (meuVetor[i] == item) {
//                return i;
//            }
//        }
        return -1;
    }

    public int buscaBinariaRecursiva(int v[],int menor, int maior,int valor) {
        int media = (maior + menor) / 2;
        int valorMeio = meuVetor[media];

        if (menor > maior) {
            return -1;
        } else if (valorMeio == valor) {
            return media;
        } else if (valorMeio < valor) {
            return buscaBinariaRecursiva(meuVetor, media + 1, maior, valor);
        } else {
            return buscaBinariaRecursiva(meuVetor, menor, media - 1, valor);
        }
    }
    
    public int busca(int valor) {
        return buscaBinariaRecursiva(meuVetor, 0, meuVetor.length - 1, valor);
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < meuVetor.length; i++) {
            if (meuVetor[i] == 0) {
                return true;
            }
        }
        return meuVetor.length == 0;
    }

    @Override
    public boolean isFull() {
        if (numElementos != meuVetor.length) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(int item) {
        int indice = indexOf(item);
        if (indice != -1) {
            for (int i = indice; i < (numElementos - 1); i++) {
                meuVetor[i] = meuVetor[i + 1];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    @Override
    public boolean set(int indice, int novoItem) {
        if (indice >= 0 && indice < numElementos) {
            meuVetor[indice] = novoItem;
        }
        return false;
    }

    @Override
    public int size() {
        return meuVetor.length;
    }

    public void to() {
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println(meuVetor[i] + " ");
        }
    }
    
}
