/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_21_05_2018;

import javax.swing.*;

/**
 * @author mario
 */
public class Login {

    /**
     * @param args the command line arguments
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

                while (valor != 0){

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
