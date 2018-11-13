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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer matriz[][] = new Integer[3][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("Informe número [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        /**
         * Formatando a matriz
         */
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("================SOMA LINHA======================");

        /**
         * A soma dos elementos de cada linha
         */
        int soma = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                soma += matriz[linha][coluna];
            }
            System.out.println("Soma linha " + linha + " é: " + soma);
            soma = 0;
        }

        System.out.println("================SOMA COLUNA=====================");

        /**
         * A soma dos elementos de cada coluna
         */
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][coluna];
            }
            System.out.println("Soma coluna " + coluna + " é: " + soma);
            soma = 0;
        }

        System.out.println("==========SOMA DIAGONAL PRIMARIA==================");

        /**
         * A soma dos elementos da diagonal primaria
         */
        for (int linha = 0; linha < matriz.length; linha++) {
            soma += matriz[linha][linha];
        }
        System.out.println("A soma diagonal principal: " + soma);
        soma = 0;

        System.out.println("==========SOMA DIAGONAL SECUNDARIA==================");

        /**
         * A soma dos elementos da diagonal secundaria
         */
        for (int linha = 0; linha < matriz.length; linha++) {
            soma += matriz[linha][2 - linha];
        }
        System.out.println("A soma diagonal secundaria: " + soma);
        soma = 0;

        System.out.println("==========SOMA DIAGONAL SECUNDARIA==================");

        /**
         * A soma de todos elementos
         */
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                soma += matriz[linha][coluna];
            }
        }
        System.out.println("A soma de todos os itens: " + soma);
        soma = 0;

        System.out.println("Elemento da linha [2][2] é: " + matriz[2][2]);

    }

}
