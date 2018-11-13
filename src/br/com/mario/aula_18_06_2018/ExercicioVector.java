package br.com.mario.aula_18_06_2018;

import java.util.Scanner;

public class ExercicioVector {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Exercícios da aula 18/06/2018 - Vetor
     *
     * @param args
     */
    public static void main(String[] args) {
        //exercio01();
        //exercio02();
        exercio03();
    }

    /**
     * * 1. Crie um programa que receba o salário mínimo e o salário de 10 funcionários.
     * Armazene em um vetor o salário dos funcionários.
     * Ao final, mostre quantos funcionários recebem menos 2 salários.
     */
    private static void exercio01() {
        Double[] salarios = new Double[11];

        int contador = 0;
        System.out.println("Digite o salario minimo: ");
        salarios[0] = scanner.nextDouble();

        for (int x = 1; x <= 10; x++) {
            System.out.println("Digite o valor do " + x + " funcionario: ");
            salarios[x] = scanner.nextDouble();
        }

        for (int x = 1; x < salarios.length; x++) {
            if (salarios[x] < salarios[0] * 2) {
                System.out.println(salarios[x]);
                contador++;
            }

        }

        System.out.println("A quantidade de funcionarios que receberam menos que 2 salarios foram: " + contador);
    }

    /**
     * * 2. Crie um algoritmo que receba 10 notas de uma prova e armazene em um vetor. Ao final, mostre a menor e a maior nota.
     */
    private static void exercio02() {
        double notas[] = new double[10];
        double maior = 0;
        double menor = 0;

        for (int x = 0; x < notas.length; x++) {
            System.out.println("Digite a " + (x + 1) + " nota:");
            notas[x] = scanner.nextDouble();

            //Iniciando as variaveis
            if (menor == 0) {
                menor = notas[x];
            }
            if (maior == 0) {
                maior = notas[x];
            }


            if (notas[x] < menor) {
                menor = notas[x];
            } else if (notas[x] > maior) {
                maior = notas[x];
            }
        }

        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);

    }

    /**
     * * 3. Crie um algoritmo que receba o nome e a idade de 10 pessoas. Armazene em dois vetores diferentes essas informações
     * (1 vetor de String e 1 vetor de Integer).
     * Ao final mostre:
     * * a) O nome de todas as pessoas cadastradas.
     * * a) O nome das pessoas que tem mais de 18 anos.
     * * b) A média das idades.
     * * d) A idade da pessoa mais nova e mais velha.
     */
    private static void exercio03() {

        int tamanho = 5;

        String nomes[] = new String[tamanho];
        Integer idades[] = new Integer[tamanho];

        int idadeMaior = 0;
        int idadeMenor = 0;
        double mediaDasIdades = 0;

        for (int x = 0; x < nomes.length; x++) {
            //Faz a leitura dos nomes
            System.out.println("Digite o " + (x + 1) + "º nome: ");
            String nome = scanner.next();

            //Faz a leitura das idades
            System.out.println("Digite o " + (x + 1) + "ª idade: ");
            int idade = scanner.nextInt();

            nomes[x] = nome;
            idades[x] = idade;
        }

        System.out.println("Todos os nomes das pessoas: \n");
        for (int indice = 0; indice < nomes.length; indice++) {
            //TODO Todos os nomes as pessoas
            System.out.println(nomes[indice]);
        }

        System.out.println("========================\n");
        System.out.println("Maiores que 18 anos:");

        for (int indice = 0; indice < idades.length; indice++) {
            //TODO Maiores que 18 anos
            if (idades[indice] >= 18) {
                System.out.println(nomes[indice]);
            }

            //TODO Soma todas idades
            mediaDasIdades += idades[indice];

            if (idadeMaior == 0 || idadeMenor == 0) {
                idadeMaior = idades[indice];
                idadeMenor = idades[indice];
            }
            //TODO Achando a pessoa mais nova e mais nova
            if (idades[indice] < idadeMenor) {
                idadeMenor = idades[indice];
            } else if (idades[indice] > idadeMaior) {
                idadeMaior = idades[indice];
            }
        }

        System.out.println("========================\n");
        //TODO Faz a media das idades
        System.out.println("A media de idades é : " + (mediaDasIdades / idades.length));
        System.out.println("A maior idade é : " + idadeMaior);
        System.out.println("A menor idade é : " + idadeMenor);


    }
}
