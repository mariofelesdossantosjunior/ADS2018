/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_30_08_2018;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Metodos {

    public static Scanner scanner = new Scanner(System.in);
    public static double media = 0.0;
    public static final int size = 4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            media += leituraNota(i);
        }

        System.out.println("Media é: " + (media / size));
    }

    private static double leituraNota(int position) {
        System.out.println("Informa a " + position + "ª nota: ");
        return new Scanner(System.in).nextDouble();
    }

}
