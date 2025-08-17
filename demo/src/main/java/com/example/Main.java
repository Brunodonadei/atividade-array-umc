package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Array array = new Array(10);
        Pilha pilha = new Pilha(10);
        Fila fila = new Fila(10);

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Trabalhar com Array");
            System.out.println("2 - Trabalhar com Pilha");
            System.out.println("3 - Trabalhar com Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            if (opcao == 0) {
                System.out.println("Saindo... Até mais!");
                break;
            }

            switch (opcao) {
                case 1:
                    menuArray(sc, array);
                    break;
                case 2:
                    menuPilha(sc, pilha);
                    break;
                case 3:
                    menuFila(sc, fila);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    private static void menuArray(Scanner sc, Array array) {
        while (true) {
            System.out.println("\n=== MENU ARRAY ===");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Listar tamanho");
            System.out.println("4 - Remover por nome");
            System.out.println("5 - Pesquisar nome");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite um nome: ");
                    array.adicionar(sc.nextLine());
                    break;
                case 2:
                    array.listarNomes();
                    break;
                case 3:
                    array.listarTamanho();
                    break;
                case 4:
                    System.out.print("Digite o nome para remover: ");
                    array.remover(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Digite o nome para pesquisar: ");
                    array.listarNome(sc.nextLine());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuPilha(Scanner sc, Pilha pilha) {
        while (true) {
            System.out.println("\n=== MENU PILHA ===");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Listar tamanho");
            System.out.println("4 - Remover (pop)");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite um nome: ");
                    pilha.adicionar(sc.nextLine());
                    break;
                case 2:
                    pilha.listarNomes();
                    break;
                case 3:
                    pilha.listarTamanho();
                    break;
                case 4:
                    pilha.remover();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuFila(Scanner sc, Fila fila) {
        while (true) {
            System.out.println("\n=== MENU FILA ===");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Listar tamanho");
            System.out.println("4 - Remover (dequeue)");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite um nome: ");
                    fila.adicionar(sc.nextLine());
                    break;
                case 2:
                    fila.listarNomes();
                    break;
                case 3:
                    fila.listarTamanho();
                    break;
                case 4:
                    fila.remover();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
