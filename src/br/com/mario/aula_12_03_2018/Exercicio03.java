package br.com.mario.aula_12_03_2018;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retangulo em cm: ");
        int base = scanner.nextInt();

        System.out.println("Digite a altura do retangulo em cm: ");
        int altura = scanner.nextInt();

        System.out.println("A área total do retângulo é " + (base * altura) + " cm²");
    }
}

