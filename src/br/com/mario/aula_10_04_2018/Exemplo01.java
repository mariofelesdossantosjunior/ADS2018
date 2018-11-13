package br.com.mario.aula_10_04_2018;

public class Exemplo01 {

    public static void main(String[] args) {

        int soma = 0;

        for (int cont = 0; cont < 100000000; cont++) {
            soma++;
            System.out.println(soma);
        }
    }
}
