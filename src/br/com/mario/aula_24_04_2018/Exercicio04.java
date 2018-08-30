package br.com.mario.aula_24_04_2018;

import br.com.mario.*;
import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        String aux;
        aux = JOptionPane.showInputDialog("Digite um numero: ");

        int numero = Integer.parseInt(aux);

        for (int x = 1; x <= numero; x++) {
            System.out.println(x);
        }
    }
}
