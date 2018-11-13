package br.com.mario.aula_10_04_2018;

import javax.swing.*;

public class Exemplo06 {

    /**
     * Receba do usuario 5 numeros e mostre o triplo de cada
     */
    public static void main(String[] args) {

        String aux = "";

        for (int cont = 1; cont <= 5; cont++) {
            aux = JOptionPane.showInputDialog("Digite o " + cont + " numero:");
            System.out.println("O triplo deste numero é " + Integer.parseInt(aux) * 3);
        }
    }
}
