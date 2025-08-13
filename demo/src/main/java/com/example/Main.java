package com.example;

public class Main {
    public static void main(String[] args) {
    
        Aulas aula = new Aulas(5);
        aula.adicionar("Bigodelol 1");
        aula.adicionar("Fabio 2");
        aula.adicionar("Bruno 3");
        aula.listarNomes();
        aula.listarTamanho();

        System.out.println("Depois da remoção: ");
        aula.remover("Bigodelol 1");
        aula.listarNomes();
        aula.listarTamanho();

        aula.listarNome("Bigodelol 1");
    }};
