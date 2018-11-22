/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_22_11_2018;

import static java.lang.String.format;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int qtdParafuso = 6;
    private static final Parafuso[] parafusos = new Parafuso[qtdParafuso];

    public static void main(String[] args) {

        cadastrarParafusos();
        mostrarParafusos();
        mostrarPesosComprimentoMedio();
        mostrarMaiorMenorParafuso();
        mostrarPercentualSuperiorMedia();

    }

    /**
     * A) Receber o peso e comprimento de cada parafuso
     */
    private static void cadastrarParafusos() {
        for (int i = 0; i < parafusos.length; i++) {
            System.out.println("Digite o peso do " + (i + 1) + "º parafuso:");
            double peso = scanner.nextDouble();

            System.out.println("Digite o comprimento do " + (i + 1) + "º parafuso:");
            double comprimento = scanner.nextDouble();

            parafusos[i] = new Parafuso(peso, comprimento);
        }
        System.out.println("==================================");
    }

    /**
     * B) Mostre uma listagem de todos os parafusos (comprimentos e pesos)
     */
    private static void mostrarParafusos() {

        for (int i = 0; i < parafusos.length; i++) {
            System.out.println("Parafuso\t peso \t\tcomprimento");
            System.out.println("" + (i + 1) + "\t\t " + parafusos[i].getPeso() + "\t\t" + parafusos[i].getComprimento());
        }

        System.out.println("=================================");
    }

    /**
     * C) Mostre o peso e comprimento medio
     */
    private static void mostrarPesosComprimentoMedio() {
        double pesoMedio = 0.0;
        double comprimentoMedio = 0.0;

        for (Parafuso parafuso : parafusos) {
            pesoMedio += parafuso.getPeso();
            comprimentoMedio += parafuso.getComprimento();
        }

        System.out.println("Peso medio é : " + format("%.2f", (pesoMedio / parafusos.length)));
        System.out.println("Comprimento medio é : " + format("%.2f", comprimentoMedio / parafusos.length));
        System.out.println("=================================");
    }

    /**
     * D) Mostre o comprimento do maior e menor parafuso E) Mostre a diferença
     * de tamanho entre o parafuso cumprido e o o mais curto
     */
    private static void mostrarMaiorMenorParafuso() {
        double menorParafuso = parafusos[0].getComprimento();
        double maiorParafuso = parafusos[0].getComprimento();

        for (Parafuso parafuso : parafusos) {
            if (parafuso.getComprimento() < menorParafuso) {
                menorParafuso = parafuso.getComprimento();
            } else if (parafuso.getComprimento() > maiorParafuso) {
                maiorParafuso = parafuso.getComprimento();
            }
        }

        System.out.println("O maior parafuso é :" + maiorParafuso);
        System.out.println("O menor parafuso é :" + menorParafuso);
        System.out.println("=================================\n");

        System.out.println("Diferença entre os parafusos: " + (maiorParafuso - menorParafuso));
        System.out.println("=================================\n");
    }

    /**
     * Mostrar o percentual de parfusos com peso superior a media da amostra
     */
    private static void mostrarPercentualSuperiorMedia() {
        double pesoMedio = 0.0;
        double qtdParafusoSuperiorMedia = 0.0;

        for (Parafuso parafuso : parafusos) {
            pesoMedio += parafuso.getPeso();
        }

        //Encontrando a media de peso
        pesoMedio = (pesoMedio / parafusos.length);

        for (Parafuso parafuso : parafusos) {
            if (parafuso.getPeso() > pesoMedio) {
                qtdParafusoSuperiorMedia++;
            }
        }

        System.out.println("Peso medio é : " + format("%.2f", pesoMedio));
        System.out.println("Quantidade de parafuso superior a media: " + qtdParafusoSuperiorMedia);
        System.out.println("Percentual de parafusos com peso superior a media é: " + ((qtdParafusoSuperiorMedia / parafusos.length) * 100) + " %");
        System.out.println("=================================");
    }

}
