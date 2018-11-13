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
public class Exercicio03 {

    /**
     * 3) Em um hospital existe três camas com um paciente em cada cama
     * (Paciente 1, Paciente 2 e Paciente 3). A cada 6 horas o equipamento mede
     * a pulsação de cada paciente. Logo, ao longo de um dia, o sistema terá
     * gravado 4 leituras para cada paciente. Faça um programa que seja capaz
     * de: a) Proceder a leitura e armazenamento numa matriz de dimensão 3 x 4
     * dos valores das pulsações dos 3 pacientes ao longo de um dia (pacientes x
     * pulsação). b) Mostrar a média das pulsações de cada paciente. c) Mostrar
     * qual o paciente com a pulsação média mais alta. d) Mostrar o valor da
     * pulsação mais alta aferida e qual o paciente.
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][4];
        int altura = matriz.length;
        int largura = matriz[0].length;
        double media = 0.0;
        double maiorMedia = 0.0;
        int pacienteMaiorMedia = 0;
        int pulsaoMaisAlta = 0;
        int pacientePulsaoMaisAlta = 0;

        /**
         * Entrada dos valores das presoes
         */
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                System.out.print("Informe a pulsação do " + (linha + 1) + "º Paciente: [" + (coluna + 1) + "ª Pulsão]: ");
                matriz[linha][coluna] = scanner.nextInt();
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

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");

        /**
         * Mostrar a média das pulsações de cada paciente
         */
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                media += matriz[linha][coluna];
            }

            System.out.println("A media das pulsações do " + (linha + 1) + "º Paciente é : " + (media / largura));

            /**
             * Mostrar qual o paciente com a pulsação média mais alta
             */
            if ((media / largura) > maiorMedia) {
                maiorMedia = (media / largura);
                pacienteMaiorMedia = linha;
            }

            media = 0;
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println("A maior media foi a do " + (pacienteMaiorMedia + 1) + "º Paciente média : " + maiorMedia);

        /**
         * Mostrar o valor da pulsação mais alta aferida e qual o paciente
         */
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                if (matriz[linha][coluna] > pulsaoMaisAlta) {
                    pulsaoMaisAlta = matriz[linha][coluna];
                    pacientePulsaoMaisAlta = linha;
                }
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println("O Paciente com a pulsão mais alta foi o \n"
                + (pacientePulsaoMaisAlta + 1) + "º Paciente, com pulsão  : " + pulsaoMaisAlta);

    }
}
