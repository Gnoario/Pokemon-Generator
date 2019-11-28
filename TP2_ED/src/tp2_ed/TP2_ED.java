/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed;

import java.util.Scanner;
import java.util.TreeSet;
import tp2_ed.arvore.Arvore;
import tp2_ed.fila.Fila;
import tp2_ed.fila.No;
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
        Scanner scanner = new Scanner(System.in);
        Pokemon pokemon = null;
        int aux;

        System.out.println("Bem-vindo treinador, em qual pokédex você deseja armazenar os dados dos pokemons?");
        System.out.println("1. Pokédex do tipo vetor\n2. Pokédex do tipo árvore\n3. Pokédex do tipo fila");
        aux = scanner.nextInt();
        switch (aux) {
            case 1:
                Pokedex.vetor(pokemon);
                break;
            case 2:
                Pokedex.arvore(pokemon);
                break;
            case 3:
                Pokedex.fila(pokemon);
                break;
            default:
                System.out.println("Esse tipo de pokédex ainda não está disponível, por favor escolha novamente!");
                break;
        }
    }

    

}
