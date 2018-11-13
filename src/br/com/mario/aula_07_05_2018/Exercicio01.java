/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_07_05_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author ifpr
 */
public class Exercicio01 {

    /**
     * Receber um numero e mostrar a sua tabuada de 1 a 10
     */
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite 1 Numero");
        int numero = Integer.parseInt(aux);

        for (int x = 1; x <= 10; x++) {
            System.out.println(x + " x " + " = " + (numero * x));
        }
    }

}
