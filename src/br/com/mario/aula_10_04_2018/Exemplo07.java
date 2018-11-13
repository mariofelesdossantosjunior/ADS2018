package br.com.mario.aula_10_04_2018;

import javax.swing.*;

public class Exemplo07 {

    /**
     * Receba do usuario 4 numeros e e mostre a media dos numeros informados
     */
    public static void main(String[] args) {

        String aux = "";
        double soma = 0;

        for (int cont = 1; cont < 5; cont++) {
            aux = JOptionPane.showInputDialog("Digite o " + cont + " número");
            soma += Double.parseDouble(aux);
        }

        double media = soma / 4;
        System.out.println("A media dos numeros é :" + media);
    }
}
