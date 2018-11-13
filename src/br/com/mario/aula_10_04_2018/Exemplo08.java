package br.com.mario.aula_10_04_2018;

import javax.swing.JOptionPane;

public class Exemplo08 {

    /**
     * Receba do usuario 4 notas, calcule a media e mostre se ele está aprovado
     * ou reprovado considere a media 70
     */
    public static void main(String[] args) {

        String aux = "";
        double soma = 0;

        for (int cont = 1; cont < 5; cont++) {
            aux = JOptionPane.showInputDialog("Digite o " + cont + " número");
            soma += Double.parseDouble(aux);
        }

        double media = soma / 4;

        if (media >= 70) {
            System.out.println("Você está aprovado");
        } else {
            System.out.println("Você está reprovado");
        }
    }
}
