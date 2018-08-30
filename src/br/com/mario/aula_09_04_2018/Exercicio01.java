package br.com.mario.aula_09_04_2018;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um dia da semana por estenso");

        switch (aux.toUpperCase()) {
            case "SEGUNDA":
                System.out.println("Dia Letivo");
                break;
            case "TERCA":
                System.out.println("Dia Letivo");
                break;
            case "QUARTA":
                System.out.println("Dia Letivo");
                break;
            case "QUINTA":
                System.out.println("Dia Letivo");
                break;
            case "SEXTA":
                System.out.println("Dia Letivo");
                break;
            case "SABADO":
                System.out.println("Descanso");
                break;
            case "DOMINGO":
                System.out.println("Descanso");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

    }
}
