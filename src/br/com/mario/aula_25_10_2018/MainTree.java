/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_25_10_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class MainTree {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];

        /**alunos[0] = new Aluno("Pedro", 20, 80, 1.88);
        alunos[1] = new Aluno("Mario", 38, 60, 1.65);
        alunos[2] = new Aluno("Jose", 40, 78, 1.98);**/

        System.out.println(Arrays.toString(alunos));

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Informe os dados do aluno:");

            System.out.println("Nome:");
            String nome = scanner.next();

            System.out.println("Idade:");
            int idade = scanner.nextInt();

            System.out.println("Peso:");
            double peso = scanner.nextDouble();

            System.out.println("Altura:");
            double altura = scanner.nextDouble();

            alunos[i] = new Aluno(nome, idade, peso, altura);
        }
        
        System.out.println(Arrays.toString(alunos));
    }

}
