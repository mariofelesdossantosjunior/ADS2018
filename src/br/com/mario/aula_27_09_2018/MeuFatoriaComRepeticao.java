/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_27_09_2018;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class MeuFatoriaComRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero a fatorar:");
        Integer numero = scanner.nextInt();

        Integer total = fatorial2(numero);

        System.out.println("O fatorial é: " + total);
    }

    private static Integer fatorial(Integer numero) {
        Integer total = 1;

        for (int i = 1; i <= numero; i++) {
            total *= numero;
        }

        return total;
    }

    private static Integer fatorial2(Integer numero) {
        if (numero == 1) {
            return 1;
        }

        return numero * fatorial(numero - 1);
    }

}
