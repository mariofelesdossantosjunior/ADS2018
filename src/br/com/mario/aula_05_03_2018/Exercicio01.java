package br.com.mario.aula_05_03_2018;

import java.util.Scanner;

public class Exercicio01 {

   /* private static final double nb1 = 7.5;
    private static final double nb2 = 6.0;
    private static final double nb3 = 9.2;
    private static final double nb4 = 10.0;*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a 1ª Nota:");
        double nb1 = Double.parseDouble(sc.nextLine());
        System.out.println("Informe a 2ª Nota:");
        double nb2 = Double.parseDouble(sc.nextLine());
        System.out.println("Informe a 3ª Nota:");
        double nb3 = Double.parseDouble(sc.nextLine());
        System.out.println("Informe a 4ª Nota:");
        double nb4 = Double.parseDouble(sc.nextLine());
        System.out.println("Informe a 5ª Nota:");
        double nb5 = Double.parseDouble(sc.nextLine());

        System.out.println("Nota 1º Bimenstre " + nb1);
        System.out.println("Nota 2º Bimenstre " + nb2);
        System.out.println("Nota 3º Bimenstre " + nb3);
        System.out.println("Nota 4º Bimenstre " + nb4);
        System.out.println("Média Semestral é : " + media(nb1, nb2, nb3, nb4, nb5));
    }

    public static double media(double... notas) {
        double media = 0.0;

        for (double nota : notas) {
            media = media + nota;
        }

        return media / notas.length;
    }
}
