/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_10_09_2018;

/**
 *
 * @author mario
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double bascara = bascara(10.0, 20.0, -3.0);
        System.out.println("Bascara: " + bascara);
    }

    private static Double bascara(Double a, Double b, Double c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }

}
