/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_26_03_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio02 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um numero inteiro");
        int numero = Integer.parseInt(aux);

        if (numero > 10) {
            System.out.println("O dobro e " + numero);
        }
    }

}
