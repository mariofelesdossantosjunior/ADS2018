package br.com.mario.aula_02_07_2018;

import java.util.Scanner;

/**
 * +
 * Receba 1 vetor com 10 posicoes do tipo Double
 * Armazene em outro Vetor os Valores True ou False
 * Se cada valor informado for Maior ou Igual a 18
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeros[] = new double[10];
        boolean valores[] = new boolean[10];

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("Digite o " + (indice + 1) + " numero: ");
            int numeroDigitado = scanner.nextInt();

            numeros[indice] = numeroDigitado;

            if (numeroDigitado >= 18) {
                valores[indice] = true;
            } else {
                valores[indice] = false;
            }
        }

        System.out.println("Saida de Dados: \n");

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
            System.out.println(valores[indice]);
            System.out.println("=============================");
        }
    }
}
