/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_13_08_2018;

import java.util.Arrays;

/**
 *
 * @author mario
 */
public class ExemploForEach {

    public static void main(String[] args) {
        int numeros[] = {1, 20, 15, 6, 30};

        //ForEach Java 7
        for (int numero : numeros) {
            System.out.println(numero);
        }

        //ForEach Java 8
        Arrays.stream(numeros).boxed().forEach(System.out::println);
    }

}
