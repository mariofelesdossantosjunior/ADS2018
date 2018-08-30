/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_04_2018;

import javax.swing.JOptionPane;

/**
 *
 * Receba 10 numeros (com a estrutura for) e mostre: a) Quantos sao maiores que
 * 50 b) Quantos sao 0
 */
public class Exercicio02 {

    public static void main(String[] args) {

        String aux;
        int numeroMaiorQue50 = 0;
        int numeroZero = 0;

        for (int x = 1; x <= 10; x++) {

            aux = JOptionPane.showInputDialog("Digite o " + x + " numero");
            int numero = Integer.parseInt(aux);
            if (numero > 50 || numero == 50) {
                numeroMaiorQue50++;
            } else if (numero == 0) {
                numeroZero++;
            }
        }

        System.out.println("Numeros maiores que 50 = " + numeroMaiorQue50);
        System.out.println("Numeros zero = " + numeroZero);
    }
}
