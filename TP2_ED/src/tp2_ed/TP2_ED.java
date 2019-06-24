/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed;

import java.util.TreeSet;
import tp2_ed.arvore.Arvore;
import tp2_ed.vetor.Vetor;

/**
 *
 * @author tadeu
 */
public class TP2_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Vetor vet = new Vetor(100000);;
        Pokemon pokemon;
        Arvore arvi = new Arvore();
//        long inicio = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            pokemon = new Pokemon();
            //arvi.insereNo(pokemon);
            arvi.insereNo(pokemon);

            //vet.add(pokemon);
        }
        //arvi.removePokemonsTipoAgua();
        System.out.println(arvi.toString());
        //System.out.println(arvi.qtdPokemonsFogo());
        System.out.println(arvi.size());

//        long fim = System.nanoTime();
//        System.out.println(vet.countFire());
//        System.out.println(fim - inicio);
        //vet.imprimi();
        //vet.imprimi();
    }
    
    

}
