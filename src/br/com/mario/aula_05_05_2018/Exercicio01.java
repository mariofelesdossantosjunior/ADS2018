/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_05_05_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Exercicio01 {

    /**
     * 1. Crie um programa que LEIA N notas de alunos de uma turma e, ao final,
     * mostre qual foi a média obtida. O algoritmo deve solicitar a leitura de
     * um novo número até que o usuário informe -1.
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String aux = "";
        double nota = 0;
        double soma = 0;
        double cont = 0;

        do {
            aux = JOptionPane.showInputDialog("Digite a nota nota");
            nota = Integer.parseInt(aux);

            if (nota != -1) {//Remove -1 da media geral
                soma = soma + nota;
                cont++;
            }

        } while (nota != -1);

        double media = (soma / cont);
        System.out.println("A media é: " + media);
    }

}
