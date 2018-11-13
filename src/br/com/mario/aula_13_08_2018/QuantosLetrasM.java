/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_13_08_2018;

/**
 *
 * @author mario
 */
public class QuantosLetrasM {

    public static void main(String[] args) {
        String instituto = "IFPR - Campus Umuarama";
        int qtdDeM = 0;

        for (int i = 0; i < instituto.length(); i++) {
            if (instituto.charAt(i) == 'm') {
                qtdDeM++;
            }
        }
        
        System.out.println("Qtd de M minusculos: "+qtdDeM);

    }

}
