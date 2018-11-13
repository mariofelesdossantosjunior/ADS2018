/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_04_2018;

/**
 * Mostre todos os numeros multiplos de 5 de 0 a 50 (incremento de 5 em 5)
 */
public class Exercicio04 {

    public static void main(String[] args) {
        for (int x = 0; x <= 50; x = x + 5) {
            if (x % 5 == 0) {
                System.out.println("Numero: " + x);
            }
        }
    }

}
