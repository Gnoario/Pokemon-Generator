/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ed;

import java.util.Scanner;
import tp2_ed.arvore.Arvore;
import tp2_ed.fila.Fila;
import tp2_ed.vetor.Vetor;

/**
 *
 * @author tadeu
 */
public class Pokedex {

    private static long inicio;
    private static long fim;

    public static void vetor(Pokemon pokemon) {
        Scanner scanner = new Scanner(System.in);
        Vetor vet = new Vetor(100);
        int pokemons;
        int aux = 0;

        System.out.println("Você escolheu uma pokédex do tipo vetor como estrutura para adicionar pokemons.");
        System.out.println("Faça sua escolha treinador.");
        do {
            System.out.println("\n1. Adicionar dez mil pokemons à minha pokédex.\n2. Adicionar cem mil pokemons à minha pokédex.\n3. Adicionar um "
                    + "milhão de pokemons à minha pokédex.");
            System.out.println("4. Verificar quantos pokémons do tipo fogo existem em sua pokédex.\n5. Apresentar a pokédex em ordem alfabética.");
            System.out.println("6. Remover os pokemon dos tipo água de pokédex.\n7. Verificar os pokémons da pokédex\n0. Para sair da pokédex.");
            pokemons = scanner.nextInt();

            switch (pokemons) {
                case 1:
                    pokemons = 10000;
                    vet = new Vetor(pokemons);
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        vet.add(pokemon);
                    }
                    fim = System.nanoTime();
                    System.out.print("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 2:
                    pokemons = 100000;
                    vet = new Vetor(pokemons);
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        vet.add(pokemon);
                    }
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 3:
                    inicio = System.nanoTime();
                    pokemons = 1000000;
                    vet = new Vetor(pokemons);
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        vet.add(pokemon);
                    }
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;

                case 4:
                    inicio = System.nanoTime();
                    System.out.println(vet.countFire());
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para contar pokemons tipo fogo da pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 5:
                    inicio = System.nanoTime();
                    vet.ordenaPokemons();
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para ordenar à pokédex: ");
                    System.out.print(fim - inicio);
                    //vet.imprimi();
                    break;
                case 6:
                    inicio = System.nanoTime();
                    vet.removePokemonsAgua();
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para remover os tipos de pokemons agua da pokédex: ");
                    System.out.print(fim - inicio);
                    //vet.imprimi();
                    break;
                case 7:
                    inicio = System.nanoTime();
                    vet.imprimi();
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para verificar os pokemons da pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 0:
                    scanner.close();
                    aux = 1;
                    System.out.println("Você saiu da pokédex.");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (aux != 1);

    }

    public static void arvore(Pokemon pokemon) {
        Scanner scanner = new Scanner(System.in);
        Arvore tree = new Arvore();
        int pokemons;
        int aux = 0;

        System.out.println("\nVocê escolheu uma pokédex do tipo árvore como estrutura para adicionar pokemons.");
        System.out.println("Faça sua escolha treinador.");
        do {
            System.out.println("\n1. Adicionar dez mil pokemons à minha pokédex.\n2. Adicionar cem mil pokemons à minha pokédex.\n3. Adicionar um "
                    + "milhão de pokemons à minha pokédex.");
            System.out.println("4. Verificar quantos pokémons do tipo fogo existem em sua pokédex.\n5. Apresentar a pokédex em ordem alfabética.");
            System.out.println("6. Remover os pokemon dos tipo água de pokédex.\n7. Verificar os pokémons da pokédex\n0. Para sair da pokédex.");
            pokemons = scanner.nextInt();

            switch (pokemons) {
                case 1:
                    pokemons = 10000;
                    aux = pokemons;
                    tree = new Arvore();
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        tree.add(pokemon);
                    }
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 2:
                    pokemons = 100000;
                    aux = pokemons;
                    tree = new Arvore();
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        tree.add(pokemon);
                    }
                    System.out.println("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 3:
                    int opc = 0;
                    System.out.println("Sua pokédex pode não suportar essa quantidade de pokémons, o recomendável é 420.000 deseja alterar?");
                    System.out.println("1. Sim\n 2. Não");
                    scanner.nextInt();
                    if (opc == 1) {
                        pokemons = 420000;
                    } else {
                        pokemons = 1000000;
                    }
                    aux = pokemons;
                    tree = new Arvore();
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        tree.add(pokemon);
                    }
                    fim = System.nanoTime();
                    break;

                case 4:
                    if (aux > 420000) {
                        System.out.println("Para contar pokemons do tipo fogo, você tem que ter uma pokedex menor ;-;");
                    } else {
                        inicio = System.nanoTime();
                        System.out.println(tree.countFire());
                        fim = System.nanoTime();
                        System.out.println("Tempo decorrido para contar pokemons de fogo da pokédex: ");
                        System.out.print(fim - inicio);
                    }
                    break;
                case 5:
                    System.out.println("A pokédex já está ordenada <3!!");
                    //vet.imprimi();
                    break;
                case 6:
                    if (aux > 420000) {
                        System.out.println("Para remover os pokemons tipo agua você deve ter uma pokedex com menos de 420000 pokemons");
                    } else {
                        inicio = System.nanoTime();
                        tree.removePokemonsAgua();
                        fim = System.nanoTime();
                        System.out.println("Tempo decorrido para remover os pokemons tipo água da pokédex: ");
                        System.out.print(fim - inicio);
                    }
                    //vet.imprimi();
                    break;
                case 7:
                    if (aux > 140000) {
                        System.out.println("Para verificar os pokemons é preciso ter uma pokedex com menos de 140000 pokemons ;-;");
                    } else {
                        inicio = System.nanoTime();
                        System.out.println(tree.toString());
                        fim = System.nanoTime();
                        System.out.println("Tempo decorrido para mostrar os pokemons adicionados à pokédex: ");
                        System.out.print(fim - inicio);
                    }
                    break;
                case 0:
                    scanner.close();
                    aux = 1;
                    System.out.println("Você saiu da pokédex.");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (aux != 1);

    }

    public static void fila(Pokemon pokemon) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();
        int pokemons;
        int aux = 0;

        System.out.println("\nVocê escolheu uma pokédex do tipo fila como estrutura para adicionar pokemons.");
        System.out.println("Faça sua escolha treinador.");
        do {
            System.out.println("\n1. Adicionar dez mil pokemons à minha pokédex.\n2. Adicionar cem mil pokemons à minha pokédex.\n3. Adicionar um "
                    + "milhão de pokemons à minha pokédex.");
            System.out.println("4. Verificar quantos pokémons do tipo fogo existem em sua pokédex.\n5. Apresentar a pokédex em ordem alfabética.");
            System.out.println("6. Remover os pokemon dos tipo água de pokédex.\n7. Verificar os pokémons da pokédex\n0. Para sair da pokédex.");
            pokemons = scanner.nextInt();

            switch (pokemons) {
                case 1:
                    pokemons = 10000;
                    aux = pokemons;
                    fila = new Fila();
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        fila.add(pokemon);
                    }
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 2:
                    pokemons = 100000;
                    aux = pokemons;
                    fila = new Fila();
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        fila.add(pokemon);
                    }
                    System.out.println("Tempo decorrido para adicionar à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 3:
                    pokemons = 1000000;
                    aux = pokemons;
                    fila = new Fila();
                    inicio = System.nanoTime();
                    for (int i = 0; i < pokemons; i++) {
                        pokemon = new Pokemon();
                        fila.add(pokemon);
                    }
                    fim = System.nanoTime();
                    break;

                case 4:
                    inicio = System.nanoTime();
                    System.out.println(fila.contarTipo("Fogo"));
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para contar pokemons de fogo da pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 5:
                    System.out.println(fila.ordena().toString());
                    //vet.imprimi();
                    break;
                case 6:
                    inicio = System.nanoTime();
                    while (!fila.isEmpty()) {
                        System.out.println(fila.removePokemonByType("Agua"));
                    }
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para remover os pokemons tipo água da pokédex: ");
                    System.out.print(fim - inicio);
                    //vet.imprimi();
                    break;
                case 7:
                    inicio = System.nanoTime();
                    System.out.println(fila.toString());
                    fim = System.nanoTime();
                    System.out.println("Tempo decorrido para mostrar os pokemons adicionados à pokédex: ");
                    System.out.print(fim - inicio);
                    break;
                case 0:
                    scanner.close();
                    aux = 1;
                    System.out.println("Você saiu da pokédex.");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (aux != 1);

    }
}
