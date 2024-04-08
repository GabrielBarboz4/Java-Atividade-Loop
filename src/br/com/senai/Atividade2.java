package br.com.senai;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        final double converterEuro = 4.27;
        final double valorVeiculo = 61307;
        int quantidadadeDeParcelas = 0;
        double conversãoReal = valorVeiculo * converterEuro;


        double valorAvista = (conversãoReal - (conversãoReal*0.08));
        double valor4vezes = (conversãoReal - (conversãoReal*0.05));
        double valor8vezes = (conversãoReal - (conversãoReal*0.02));
        double valorMaisParcelas = (conversãoReal + (conversãoReal * quantidadadeDeParcelas));

        System.out.println("""
                Olá Antônio Luiz, bem vindo ao sistema integrado da NEWS CARS ZIP
                
                Vimos que voce se interessou pelo nosso Mazda RX 9 saindo por  € 61307
                Mas como você é nosso cliente especial, estaremos fazendo uma condição especial para voce!
                
                Digite qual a opção melhor atende sua condição de pagamento:
                1 - A vista, com 8 % de desconto;
                2 - Parcelado em 4 vezes com 5 % de desconto;
                3 - Parcelado em 8 vezes com 2 % de desconto;
                4 - Parcelado em 12 vezes;
                5 - Parcelado em mais vezes, sendo 12 sem juros e as demais recebem 2 % de juros;
                6 - Desistir da compra!                
                """);

        int valorDigitado = input.nextInt();
        while (valorDigitado != 6) {
            switch (valorDigitado){
                case 1:
                    System.out.println("Ótimo você deseja pagar a vista");
                    System.out.println("O valor do carro convertido para Real fica igual a: R$ " + decimal.format(conversãoReal));
                    System.out.println("Como sua compra é a vista, recebe 8 % de desconto, sendo igual à: R$ " + decimal.format(valorAvista));
                    System.out.println("""
                            Deseja processeguir com a compra?
                            1 - Finalizar compra;
                            2 - Ver outras opções;
                            """);
                    int escolha = input.nextInt();
                    if (escolha == 1) {
                        System.out.println("VOCÊ ADQUIRIU UM PUTA DUM CARRÃO PARABENSSSSS");
                        System.exit(0);
                    } else if (escolha == 2) {
                        break;
                    } else {
                        System.out.println("Valor inválido");
                        break;
                    }
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("Valor inválido, por favor digite um valor entre 1 e 6");
            }
            System.out.println("""
                Digite qual a opção melhor atende sua condição de pagamento:
                1 - A vista, com 8 % de desconto;
                2 - Parcelado em 4 vezes com 5 % de desconto;
                3 - Parcelado em 8 vezes com 2 % de desconto;
                4 - Parcelado em 12 vezes;
                5 - Parcelado em mais vezes, sendo 12 sem juros e as demais recebem 2 % de juros;
                6 - Desistir da compra! 
                    """);
        }
    }
}
