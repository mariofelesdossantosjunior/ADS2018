package br.com.mario.prova;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        //exercicio01();
        //exercicio02();
        exercicio03();
    }

    private static void exercicio01() {
        Scanner scanner = new Scanner(System.in);

        double pesos[] = new double[5];
        double pesoTotal = 0.0;

        for (int indice = 0; indice < pesos.length; indice++) {
            System.out.println("Digite o peso do " + (indice + 1) + " vagão:");
            double peso = scanner.nextDouble();
            pesos[indice] = peso;
            pesoTotal += peso;
        }

        System.out.println("O peso total é: " + pesoTotal);
        System.out.println("O peso medio é: " + (pesoTotal / pesos.length));
    }

    private static void exercicio02() {
        Scanner scanner = new Scanner(System.in);

        int v[] = new int[200];
        int menor = 0;
        int posicao = 0;

        for (int indice = 0; indice < v.length; indice++) {
            System.out.println("Digite o " + (indice + 1) + " Numero:");
            v[indice] = scanner.nextInt();
        }

        for (int indice = 0; indice < v.length; indice++) {
            if (menor == 0) {
                menor = v[indice];
            }

            if (v[indice] < menor) {
                menor = v[indice];
                posicao = indice;
            }
        }

        System.out.println("O menor elemento de V é " + menor + " e a sua posicao no vetor é: " + posicao);
    }

    public static void exercicio03() {
        Scanner scanner = new Scanner(System.in);

        int qtdPaciente = 100;
        int qtdCasoEmergencia = 0;
        double qtdPacienteConvenio = 0;
        double qtdPacienteAtendido = 0;
        int qtdPacienteMenor18 = 0;
        int somaIdade = 0;
        int somaIdadeEmergencia = 0;

        String nomes[] = new String[qtdPaciente];
        int idades[] = new int[qtdPaciente];
        int casoClinicos[] = new int[qtdPaciente];
        boolean convenios[] = new boolean[qtdPaciente];

        for (int indice = 0; indice < qtdPaciente; indice++) {
            System.out.println("Digite seu nome: ");
            nomes[indice] = scanner.next();

            System.out.println("Digite sua idade: ");
            idades[indice] = scanner.nextInt();

            System.out.println("Digite seu caso clinico "
                    + "1 - Emergencia "
                    + "2 - Urgente "
                    + "3 - Não Urgente");
            casoClinicos[indice] = scanner.nextInt();

            System.out.println("Possui convênio: ");
            convenios[indice] = scanner.next().equalsIgnoreCase("Sim");

            qtdPacienteAtendido++;
        }

        for (int indice = 0; indice < qtdPaciente; indice++) {
            System.out.println(nomes[indice]);

            //Casos de Emergencia
            if (casoClinicos[indice] == 1) {
                qtdCasoEmergencia++;
                somaIdadeEmergencia += idades[indice];
            }

            //Casos com convenio
            if (convenios[indice]) {
                qtdPacienteConvenio++;
            }

            //Pacientes menores que 18
            if (idades[indice] < 18) {
                qtdPacienteMenor18++;
            }
        }

        for (int indice = 0; indice < idades.length; indice++) {
            somaIdade += idades[indice];
        }

        System.out.println("O numeros de casos de emergencia é: " + qtdCasoEmergencia);
        System.out.println("O percentual de pacientes atendidos com convenio é : " + (qtdPacienteConvenio * qtdPacienteAtendido / 100));
        System.out.println("A quantidade de pacientes menores que 18 é : " + qtdPacienteMenor18);
        System.out.println("A media de idade dos pacientes atendidos é : " + (somaIdade / idades.length));
        System.out.println("A media de idade dos pacientes em caso de emergencia é : " + (somaIdadeEmergencia / qtdCasoEmergencia));

    }
}
