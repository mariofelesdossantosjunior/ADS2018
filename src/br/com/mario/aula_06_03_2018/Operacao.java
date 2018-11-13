package br.com.mario.aula_06_03_2018;

public class Operacao {

    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        int c = 10;
        int d = 2;

        System.out.println("Resultado : " + funcaoExemplo(a, b, d, c));
    }

    public static int funcaoExemplo(int a, int b, int d, int c) {
        return a + b * d - c;
    }

}
