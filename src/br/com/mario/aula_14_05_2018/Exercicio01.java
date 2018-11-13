/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_14_05_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author ifpr Crie um programa com do while que receba N valores double
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double soma = 0.0;
        double valor = 0.0;
        double somaDesconto = 0.0;
        double cont = 0.0;

        do {
            String aux = JOptionPane.showInputDialog("Digite o numero");
            valor = Double.parseDouble(aux);

            if (valor != -1) {
                double desconto = (valor * 10 / 100);
                double valorComDesconto = (valor - (valor * 10 / 100));

                System.out.println(valor + " - 10% " + valorComDesconto);

                soma += valor;
                somaDesconto += desconto;

                cont++;
            }

        } while (valor != -1);

        System.out.println("A soma dos valores: " + soma);
        System.out.println("A soma dos descontos: " + somaDesconto);
        System.out.println("A quantidade de vezes foi : " + cont);
    }

}
