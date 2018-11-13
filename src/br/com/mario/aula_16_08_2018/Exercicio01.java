/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_08_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Exercicio01 {

    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String resultado = "";
        String textoDigitado = JOptionPane.showInputDialog("Digite o texto:");

        for (int i = 0; i < textoDigitado.length(); i++) {
            char letra = textoDigitado.charAt(i);

            for (int indice = 0; indice < letras.length; indice++) {
                if (letras[indice] == letra) {

                    switch (letras[indice]) {
                        case 'x':
                            resultado += letras[0];
                            break;
                        case 'y':
                            resultado += letras[1];
                            break;
                        case 'z':
                            resultado += letras[2];
                            break;
                        default:
                            resultado += letras[indice + 3];
                            break;
                    }
                }
            }
        }

        System.out.println("Palavra criptografada: " + resultado);
    }
}
