package br.com.mario.aula_12_03_2018;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println(nome + " o dobro de seu salário é " + (salario * 2));
    }

}
