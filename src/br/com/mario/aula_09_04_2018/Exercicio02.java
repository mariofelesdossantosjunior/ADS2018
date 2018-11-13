package br.com.mario.aula_09_04_2018;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um codigo de um produto");

        switch (aux) {
            case "1001":
                System.out.println("Caneta - R$ 1,00");
                break;
            case "2536":
                System.out.println("Lapis - R$ 0,50");
                break;
            case "1245":
                System.out.println("Caderno - R$ 22,00");
                break;
            case "0965":
                System.out.println("Borracha - R$ 1,50");
                break;
            case "8155":
                System.out.println("Apontador - R$ 3,00");
                break;
            default:
                System.out.println("Codigo invalido");
                break;
        }

    }
}
