package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
       Fila fila = new Fila(5);

       fila.adicionar("Fabio 1");
       fila.adicionar("Fabio 2");
       fila.listarNomes();
       fila.listarTamanho();

       fila.remover();
       System.out.println("Depois de remover: ");
       fila.listarTamanho();
       fila.listarNomes();


    }};
