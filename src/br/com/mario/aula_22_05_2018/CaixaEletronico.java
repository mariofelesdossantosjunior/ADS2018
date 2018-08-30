/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_22_05_2018;

import javax.swing.*;

/**
 * @author mario
 */
public class CaixaEletronico {

    /**
     * Modifique o exercício anterior para fazer um CAIXA ELETRÔNICO.
     * Após logado, o usuário deve informar o valor que ele deseja sacar.
     * Na sequência, mostre a quantidade mínima de notas que serão dadas
     * ao usuário (possíveis notas: 100, 50, 20, 10, 5 e 2).
     */
    public static void main(String[] args) {
        // TODO Variavel de controle
        int cont = 0;

        while (true) {
            String login = JOptionPane.showInputDialog("Digite o login: ");
            String senha = JOptionPane.showInputDialog("Digite a senha: ");

            if (login.equalsIgnoreCase("java") && senha.equals("123")) {
                JOptionPane.showMessageDialog(null, "Usuario logado com sucesso!");

                String valorSaque = JOptionPane.showInputDialog("Qual valor do saque: ");
                double valor = Double.parseDouble(valorSaque);

                Double notasDeCem = valor / 100;
                Double notasDeCinquenta = (valor % 100) / 50;
                Double notasDeVinte = ((valor % 100) % 50) / 20;
                Double notasDeDez = (((valor % 100) % 50) % 20) / 10;
                Double notasDeCinco = ((((valor % 100) % 50) % 20) % 10) / 5;
                Double notasDeDois = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;

                if (valor <= 1500) {

                    System.out.println("Valor: " + valor);
                    System.out.println("você irá receber \n"
                            .concat(String.valueOf(notasDeCem.intValue()))
                            .concat(" notas de cem \n")
                            .concat(String.valueOf(notasDeCinquenta.intValue()))
                            .concat(" notas de cinquenta \n")
                            .concat(String.valueOf(notasDeVinte.intValue()))
                            .concat(" notas de vinte \n")
                            .concat(String.valueOf(notasDeDez.intValue()))
                            .concat(" notas de dez \n")
                            .concat(String.valueOf(notasDeCinco.intValue()))
                            .concat(" notas de cinco \n")
                            .concat(String.valueOf(notasDeDois.intValue()))
                            .concat(" notas de dois \n"));
                } else {
                    System.out.println("Valor Invalido, caixa so permiti saque ate R$ 1500,00");
                }

                System.exit(0);
            } else {
                cont++;

                if (cont == 3) {
                    JOptionPane.showMessageDialog(null, "Usuario bloqueado.");
                    System.exit(0);
                }
            }
        }


    }

}
