/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_04_2018;

import javax.swing.JOptionPane;

/**
 * Receba 10 numeros (com a estrutura for) e mostre: a) Qual foi o primeiro
 * numero digitado b) A soma de todos os numeros
 */
public class Exercicio05 {

    public static void main(String[] args) {

        int primeiro = 0;
        int soma = 0;
        String aux = "";

        for (int x = 1; x <= 10; x++) {
            aux = JOptionPane.showInputDialog("Digite o " + x + " numero");
            int numero = Integer.parseInt(aux);

            if (x == 1) {
                primeiro = numero;
            }

            soma += numero;

        }

        System.out.println("O primeiro numero digitado foi : " + String.valueOf(primeiro));
        System.out.println("A soma de todos os numeros e " + soma);
    }

}
