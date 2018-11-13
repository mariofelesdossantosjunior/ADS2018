/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_04_2018;

/**
 * Mostre todos os numeros pares do intervalo de 0 a 100
 */
public class Exercicio03 {

    public static void main(String[] args) {
        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println("Numero: " + x);
            }
        }
    }

}
