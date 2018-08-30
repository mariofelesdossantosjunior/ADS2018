package br.com.mario.aula_02_07_2018;

/**
 * +
 * Receba 2 vetores de inteiro A e B com 5 numeros cada
 * um mostre a Soma de cada Vetor e a soma de ambas
 */
public class Exercicio01 {

    public static void main(String[] args) {
        int vetorA[] = new int[]{1, 3, 5, 2, 4};
        int vetorB[] = new int[]{2, 4, 3, 5, 0};

        int somaVetorA = 0;
        int somaVetorB = 0;

        for (int indice = 0; indice < vetorA.length; indice++) {
            somaVetorA = somaVetorA + vetorA[indice];
        }

        for (int indice = 0; indice < vetorB.length; indice++) {
            somaVetorB = somaVetorB + vetorB[indice];
        }

        System.out.println("A soma do vetor A e: " + somaVetorA);
        System.out.println("A soma do vetor B e: " + somaVetorB);
        System.out.println("A soma Geral e: " + (somaVetorA + somaVetorB));

    }
}
