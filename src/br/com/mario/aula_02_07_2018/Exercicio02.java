package br.com.mario.aula_02_07_2018;

/**
 * +
 * Receba 2 vetores A e B Inteiros de 5 posicoes cada
 * crie um vetor C de 10 posicoes que sera o resultado de
 * A + B ao final mostre o vetor C
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int vetorA[] = new int[]{1, 3, 5, 2, 4};
        int vetorB[] = new int[]{2, 4, 3, 5, 0};
        int vetorC[] = new int[10];

        for (int indice = 0; indice < vetorA.length; indice++) {
            vetorC[indice] = vetorA[indice];
        }

        for (int indice = 0; indice < vetorB.length; indice++) {
            vetorC[indice + 5] = vetorB[indice];
        }


        System.out.println("Vetor C");
        System.out.println("=======================================");

        for (int indice = 0; indice < vetorC.length; indice++) {
            System.out.println(vetorC[indice]);
        }
    }
}
