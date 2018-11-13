 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.trabalho_20_08_2018;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Exercicio04 {

    /**
     * 4) Numa fábrica de parafusos é recolhido uma amostra de 6 parafusos
     * diariamente para medição e pesagem. Faça um programa para: a) Receber os
     * valores do peso e do comprimento (cm/mm) de cada parafuso da amostra. b)
     * Calcular e mostrar o peso médio e o comprimento médio dos parafusos da
     * amostra. c) Mostrar o comprimento do menor e maior parafuso. d) Calcular
     * e mostrar a diferença de tamanho entre o parafuso mais curto e o mais
     * comprido. e) Calcular e mostrar o percentual de parafusos com peso
     * superior a média da amostra.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double matriz[][] = new double[6][2];
        int altura = matriz.length;
        int largura = matriz[0].length;

        /**
         * Variaveis Auxiliares
         */
        double pesoMedio = 0.0;
        double comprimentoMedio = 0.0;
        double menorParafuso = 0.0;
        double maiorParafuso = 0.0;
        double qtdParafusoPesoAcimaMedia = 0;

        /**
         * Entrada dos valores das presoes
         */
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {

                if (coluna % 2 == 0) {
                    System.out.print("Informe o tamanho do " + (linha + 1) + "º Parafuso:");
                } else {
                    System.out.print("Informe o peso do " + (linha + 1) + "º Parafuso:");
                }

                matriz[linha][coluna] = scanner.nextDouble();
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        }

        /**
         * Formatando a matriz
         */
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        /**
         * b) Calcular e mostrar o peso médio e o comprimento médio dos
         * parafusos da amostra. c) Mostrar o comprimento do menor e maior
         * parafuso. d) Calcular e mostrar a diferença de tamanho entre o
         * parafuso mais curto e o mais comprido.
         */
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");

        menorParafuso = matriz[0][0];

        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {

                //TODO Achando Tamanho Media
                if (coluna % 2 == 0) {
                    comprimentoMedio += matriz[linha][coluna];

                    //TODO Achando o maior Parafuso
                    if (matriz[linha][coluna] > maiorParafuso) {
                        maiorParafuso = matriz[linha][coluna];
                    }
                    //TODO Achando o menor Parafuso
                    if (matriz[linha][coluna] < menorParafuso) {
                        menorParafuso = matriz[linha][coluna];
                    }

                } else {
                    //Achando Peso Medio
                    pesoMedio += matriz[linha][coluna];

                }

                //TODO Mostrar o comprimento do menor e maior parafuso
                if (matriz[linha][coluna] > maiorParafuso) {
                    maiorParafuso = matriz[linha][coluna];
                }
            }
        }

        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {

                if (coluna % 2 != 0) {
                    if (matriz[linha][coluna] > (pesoMedio / matriz.length)) {
                        qtdParafusoPesoAcimaMedia++;
                    }
                }
            }
        }

        System.out.println("O comprimento medio é: " + (comprimentoMedio / matriz.length));
        System.out.println("O peso medio é: " + (pesoMedio / matriz.length));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println();
        System.out.println("O maior parafuso é: " + maiorParafuso);
        System.out.println("O menor parafuso é: " + menorParafuso);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println("A  diferença de tamanho entre o parafuso mais curto "
                + "e o mais comprido é: " + (maiorParafuso - menorParafuso));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println("O percentual de parafusos com peso superior a média é "
                + ((qtdParafusoPesoAcimaMedia / matriz.length) * 100) + "%");
    }
}
