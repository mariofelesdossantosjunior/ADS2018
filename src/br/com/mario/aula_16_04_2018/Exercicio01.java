/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_04_2018;

import javax.swing.JOptionPane;

/**
 *
 * Receba 2 numeros A e B e uma operaçao C. Mostre o resultado da operaçao de A
 * por B Confirme a operacao informada
 *
 * Operacao | Descriçao + | soma - | Subtracao * | Multiplicacao / | Divisao
 */
public class Exercicio01 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String operacao = "";
        String aux = "";

        aux = JOptionPane.showInputDialog("Digite o valor de A: ");
        a = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Digite o valor de B: ");
        b = Integer.parseInt(aux);

        operacao = JOptionPane.showInputDialog("Digite a operaçao: ");

        if (operacao.equals("+")) {
            System.out.println("A soma dos numeros e: " + (a + b));
        } else if (operacao.equals("-")) {
            System.out.println("A subtracao dos numeros e: " + (a - b));
        } else if (operacao.equals("*")) {
            System.out.println("A multiplicacao dos numeros e: " + (a * b));
        } else if (operacao.equals("/")) {
            System.out.println("A divisao dos numeros e: " + (a / b));
        } else {
            System.out.println("Operaçao nao suportada!");
        }

    }

}
