package br.com.mario.aula_12_03_2018;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado de 1 quadrado: ");
        int valor = scanner.nextInt();

        System.out.println("A área total do quadrado é " + (valor * valor));
    }

}
