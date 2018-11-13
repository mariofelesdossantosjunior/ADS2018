package br.com.mario.aula_12_03_2018;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("A raiz desse número é :" + (Math.sqrt(numero)));
    }
}

