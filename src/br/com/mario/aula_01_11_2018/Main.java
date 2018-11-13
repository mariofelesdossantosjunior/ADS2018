/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_01_11_2018;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final Aluno[] alunos = new Aluno[5];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        gerarAlunos();

        Aluno alunoMaisVelho = alunoMaisVelho();

        System.out.println("O alunos mais velho é: "
                + alunoMaisVelho.getNome()
                + " sua idade é "
                + alunoMaisVelho.getIdade());

        Aluno alunoMaisNovo = alunoMaisNovo();

        System.out.println("O alunos mais novo é: "
                + alunoMaisNovo.getNome()
                + " sua idade é "
                + alunoMaisNovo.getIdade());

        double mediaDeIdades = mediaIdadeAlunos();

        System.out.println("A media de idade dos alunos é : " + mediaDeIdades);

    }

    private static void gerarAlunos() {
        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do " + (i + 1) + "º aluno: ");
            int idade = scanner.nextInt();

            alunos[i] = new Aluno(nome, idade);
            
            
        }
    }

    private static Aluno alunoMaisVelho() {
        return Stream.of(alunos)
                .max(Comparator.comparing(Aluno::getIdade))
                .get();
    }

    private static Aluno alunoMaisNovo() {
        return Stream.of(alunos)
                .min(Comparator.comparing(Aluno::getIdade))
                .get();
    }

    private static double mediaIdadeAlunos() {
        return Stream.of(alunos)
                .mapToInt(Aluno::getIdade)
                .average()
                .getAsDouble();
    }
}
