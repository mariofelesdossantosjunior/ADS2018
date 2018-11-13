/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_07_05_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author ifpr
 */
public class Exercicio02 {

    /**
     * Mostre a tabuada de 1 ate 10
     */
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            System.out.println("====================================");
            
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + " x " + y + " = " + (x * y));
            }

        }
    }

}
