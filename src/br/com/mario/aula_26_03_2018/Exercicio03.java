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
public class Exercicio03 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite a temperatura em �C");
        double temperatura = Double.parseDouble(aux);

        if (temperatura > 33.0) {
            System.out.println("Este muito quente");
        }
    }

}
