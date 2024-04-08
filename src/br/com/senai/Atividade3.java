package br.com.senai;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeMaquina = null;
        int quantidade = 0;
        double valorMaquina = 0;

        int enteredValue = 0;

        do {
            System.out.println("""
                \nSistema de cadastro de maquinas
                1 - Cadastrar uma nova máquina
                2 - Retirar produto de estoque
                3 - Consultar estoque
                4 - Finalizar sistema
                """);
            enteredValue = input.nextInt();
            input.nextLine();

            switch (enteredValue){
                case 1:
                    System.out.println("CADASTRO DE NOVAS MAQUINAS");
                    System.out.println("Digite o Nome da máquina que você deseja adicionar:");
                    nomeMaquina = input.nextLine();
                    System.out.println("Digite a quantidade em estoque:");
                    quantidade = input.nextInt();
                    System.out.println("Digite o valor em reais da máquina");
                    valorMaquina = input.nextDouble();
                    System.out.println("Máquina cadastrada com sucesso!");
                    break;
                case 2:
                    if (nomeMaquina == null) {
                        System.out.println("Não há maquinas cadastradas, realize o cadastro para consultar o estoque");
                    }
                    else {
                        System.out.println("Digite a quantidade de itens que você deseja dar baixa no estoque");
                        int baixaNoSistema = input.nextInt();
                        while (baixaNoSistema > quantidade || quantidade <= 0) {
                            System.out.println("Valor inválido, digite novamente");
                            baixaNoSistema = input.nextInt();
                        }
                        quantidade = quantidade - baixaNoSistema;
                        System.out.println("Estoque atualizado: " + nomeMaquina + " estoque " + quantidade);
                    }
                    break;
                case 3:
                    if (nomeMaquina == null) {
                        System.out.println("Não há maquinas cadastradas, realize o cadastro para consultar o estoque");
                    } else {
                        System.out.println("CONSULTA DE ESTOQUE");
                        System.out.println(nomeMaquina + ": " + quantidade);
                        System.out.println("Valor da máquina: R$ " + valorMaquina);
                        System.out.println("Valor de estoque acumulado: R$" + (valorMaquina * quantidade));
                    }
                    break;
                case 4:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        } while (enteredValue != 4);

        input.close();
    }
}
