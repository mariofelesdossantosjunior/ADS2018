package br.com.mario.aula_19_03_2018;

import javax.swing.*;

public class EntradaDeDados {

    public static void main(String[] args) {

        String aux;

        aux = JOptionPane.showInputDialog("Informe  1º nota:");
        Double nota1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog("Informe  2º nota:");
        Double nota2 = Double.parseDouble(aux);

        double media = (nota1 + nota2 / 2);
        JOptionPane.showMessageDialog(null, "A média é: "+media);
    }
}
