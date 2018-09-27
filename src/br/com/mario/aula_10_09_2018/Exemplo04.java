/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_10_09_2018;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Exemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double a = scanner.nextDouble();

        System.out.println("Digite um numero: ");
        double b = scanner.nextDouble();

        System.out.println("Digite um numero: ");
        double c = scanner.nextDouble();

        Double menorValor = menorValor(a, b, c);
        System.out.println("O menor valor é: " + menorValor);
    }

    private static Double menorValor(Double a, Double b, Double c) {
        Double menorValor = Double.MAX_VALUE;

        if (a <= menorValor) {
            menorValor = a;
        }

        if (b <= menorValor) {
            menorValor = b;
        }

        if (c <= menorValor) {
            menorValor = c;
        }

        return menorValor;
    }

}
