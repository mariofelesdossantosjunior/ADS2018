/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_25_10_2018;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class MainTwo {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Informe os dados do aluno:");

        System.out.println("Nome:");
        String nome = scanner.next();

        System.out.println("Idade:");
        int idade = scanner.nextInt();

        System.out.println("Peso:");
        double peso = scanner.nextDouble();

        System.out.println("Altura:");
        double altura = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, idade, peso, altura);
        System.out.println(aluno.toString());

        System.out.println("O IMC do " + aluno.getNome() + " é: " + aluno.getImc());

    }

}
