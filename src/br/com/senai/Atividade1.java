package br.com.senai;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer valorMaximo = null;
        Integer valorMinimo = null;

        int valorRegistrado;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "= ");
            valorRegistrado = input.nextInt();

            if (valorMaximo == null || valorRegistrado > valorMaximo) valorMaximo = valorRegistrado;
            if (valorMinimo == null || valorRegistrado < valorMinimo) valorMinimo = valorRegistrado;
        }
        System.out.println("O valor máximo digitado foi: " + valorMaximo);
        System.out.println("O valor mínimo digitado foi: " + valorMinimo);
        input.close();
    }
}
