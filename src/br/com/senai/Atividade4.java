package br.com.senai;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean avaliarOutro = true;
        int totalFuncionariosAvaliados = 0;

        while (avaliarOutro) {
            System.out.println("Informe o nome do colaborador:");
            String nome = input.nextLine();

            int maiorNota = Integer.MIN_VALUE;
            int menorNota = Integer.MAX_VALUE;
            double somaNotas = 0;
            int quantidadeNotas = 0;

            while (true) {
                System.out.println("Informe as notas do colaborador, para finalizar a digitação digite -1 para finalizar:");
                int nota = input.nextInt();
                input.nextLine();

                if (nota == -1) {
                    break;
                }

                if (nota > maiorNota) {
                    maiorNota = nota;
                }

                if (nota < menorNota) {
                    menorNota = nota;
                }

                somaNotas += nota;
                quantidadeNotas++;
            }

            double media = somaNotas / quantidadeNotas;

            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Quantidade de notas: " + quantidadeNotas);
            System.out.println("Média: " + media);

            String situacao;
            if (media >= 7.0) {
                situacao = "Aprovado";
            } else if (media >= 4.0) {
                situacao = "Possível Advertência";
            } else {
                situacao = "Corre risco de demissão";
            }

            System.out.println("Situação: " + situacao + " - Colaborador: " + nome);
            totalFuncionariosAvaliados++;

            System.out.println("Deseja avaliar outro funcionário? (s/n)");
            String resposta = input.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                avaliarOutro = false;
            }
        }
        System.out.println("Total de funcionários avaliados: " + totalFuncionariosAvaliados);
        input.close();
    }
}
