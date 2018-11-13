package br.com.mario.aula_12_03_2018;

import java.util.Scanner;

public class Exercicio01 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1 Valor Inteiro: ");
        int valor = scanner.nextInt();

        System.out.println("Seu Antecessor é " + (valor - 1));

        System.out.println("Seu Sucessor é " + (valor + 1));
    }
}
