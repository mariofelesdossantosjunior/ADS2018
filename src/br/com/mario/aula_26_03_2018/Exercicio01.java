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
public class Exercicio01 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite sua idade");
        int idade = Integer.parseInt(aux);

        if (idade >= 0) {
            System.out.println("Sua idade é " + idade);
        }
    }

}
