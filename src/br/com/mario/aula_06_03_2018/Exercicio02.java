package br.com.mario.aula_06_03_2018;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º Valor: ");
        int a = scanner.nextInt();

        System.out.println("Digite o 2º Valor: ");
        int b = scanner.nextInt();

        int resultado = a + b;
        System.out.println("A soma é : " + resultado);
    }
}
