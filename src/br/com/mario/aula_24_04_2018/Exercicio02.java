package br.com.mario.aula_24_04_2018;

import br.com.mario.*;
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        double media = 0;
        String aux;

        for (int x = 1; x <= 5; x++) {
            aux = JOptionPane.showInputDialog("Digite o " + x + " numero: ");
            media += Double.parseDouble(aux);
        }

        System.out.println("A media e : " + (media / 5));
    }
}
