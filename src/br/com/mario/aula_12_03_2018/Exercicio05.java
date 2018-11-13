package br.com.mario.aula_12_03_2018;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Hoje você tem " + idade + " anos, daque a 10 anos você terá " + (idade + 10) + " anos.");
    }

}
