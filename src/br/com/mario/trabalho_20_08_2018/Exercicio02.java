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
public class Exercicio02 {

    /**
     * Receba uma matriz de inteiros de tamanho 2x3. Mostre o menor e o maior
     * valor da matriz e suas respectivas posições.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer matriz[][] = new Integer[2][3];
        int maior = 0, menor = Integer.MAX_VALUE;

        Integer posicoes[][] = new Integer[2][2];

        //TODO Inserindo valores na matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("Informe número [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        maior = matriz[0][0];

        //TODO Achando o maior
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                    posicoes[0][0] = linha;
                    posicoes[0][1] = coluna;
                }
            }
        }

        //TODO Achando o maior
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                    posicoes[1][0] = linha;
                    posicoes[1][1] = coluna;
                }
            }
        }

        System.out.println("O Maior é: " + maior);
        System.out.println("A posicao do maior é : [" + posicoes[0][0] + "] [" + posicoes[0][1] + "]");

        System.out.println("===============================================");

        System.out.println("O Menor é: " + menor);
        System.out.println("A posicao do menor é : [" + posicoes[1][0] + "] [" + posicoes[1][1] + "]");

    }
}
