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
public class Exercicio02 {

    /**
     * 2. Crie um programa que receba salário de funcionários de uma empresa. O
     * programa deve parar de receber informações quando for informado -1. Ao
     * final, mostre: 
     * a) O total gasto com salário com todos os funcionários;
     * b) A média salarial dos funcionários da empresa; 
     * c) O maior salário.
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String aux = "";
        double salario = 0;
        double soma = 0;
        double cont = 0;
        double maiorSalario = 0;

        do {
            aux = JOptionPane.showInputDialog("Digite o salario do funcionário:");
            salario = Integer.parseInt(aux);

            if (salario != -1) {//Para de receber informações
                soma = soma + salario;
                cont++;

                if (maiorSalario < salario) {//Encontra o maior salario
                    maiorSalario = salario;
                }
            }

        } while (salario != -1);

        double mediaSalarial = (soma / cont);
        System.out.println("O total gasto com salário com todos os funcionários: " + soma);
        System.out.println("A média salarial dos funcionários da empresa: " + mediaSalarial);
        System.out.println("O maior salario é: " + maiorSalario);
    }
}
