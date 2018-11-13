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
public class Exercicio04 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite uma nota");
        double nota = Double.parseDouble(aux);

        if (nota > 7.0) {
            System.out.println("Voce esta aprovado");
        } else {
            System.out.println("Voce esta reprovado");
        }
    }

}
