package br.com.mario.aula_02_07_2018;

import java.util.Scanner;

/**
 * Receba cada Informação a seguir em um vetor diferente: (Para 5 Pacientes)
 * Codigo do Paciente(inteiro)
 * Nome do Paciente (Texto)
 * Idade (Inteiro)
 * Altura (Numero Fracionado)
 * e um Status com o estado clinico do paciente, Grave ou Não (Boolean).
 * Ao final mostre:
 * <p>
 * a) Uma Listagem formada exibindo o codigo, idade, altura e status (Grave / Estavel)
 * <p>
 * b) A media de idade dos pacientes
 * <p>
 * c) A media de altura dos pacientes
 * <p>
 * d) A quantidade de pacientes que possuem caso clinico grave
 * <p>
 * e) O nome dos pacientes e idades que possuem caso cliico grave
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdPaciente = 5;
        double mediaIdade = 0;
        double mediaAltura = 0;
        int qtdPacienteGrave = 0;

        int codigos[] = new int[qtdPaciente];
        String nomes[] = new String[qtdPaciente];
        int idades[] = new int[qtdPaciente];
        double alturas[] = new double[qtdPaciente];
        boolean status[] = new boolean[qtdPaciente];


        for (int indice = 0; indice < qtdPaciente; indice++) {
            System.out.println("Digite seu codigo: ");
            codigos[indice] = scanner.nextInt();

            System.out.println("Digite seu nome: ");
            nomes[indice] = scanner.next();

            System.out.println("Digite sua idade: ");
            idades[indice] = scanner.nextInt();

            System.out.println("Digite sua altura (1,55): ");
            alturas[indice] = scanner.nextDouble();

            System.out.println("O status do paciente é grave? : (Sim, Não)");
            String statusDoPaciente = scanner.next();

            status[indice] = statusDoPaciente.equalsIgnoreCase("Sim");

            mediaIdade += idades[indice];
            mediaAltura += alturas[indice];

        }

        for (int indice = 0; indice < qtdPaciente; indice++) {
            System.out.println("========================Pessoas=============================");
            //codigo, idade, altura e status (Grave / Estavel)
            System.out.println(codigos[indice]);
            System.out.println(nomes[indice]);
            System.out.println(idades[indice]);
            System.out.println(alturas[indice]);
            System.out.println(status[indice] ? "Grave" : "Não Grave");
            System.out.println("============================================================\n");

            if (status[indice]) {
                qtdPacienteGrave++;
            }
        }

        System.out.println("A media de idades é : " + (mediaIdade / qtdPaciente));
        System.out.println("A media de alturas é : " + (mediaAltura / qtdPaciente));
        System.out.println("A quantidade de pacientes com status grave é : " + qtdPacienteGrave + "\n");

        // O nome dos pacientes e idades que possuem caso cliico grave
        for (int indice = 0; indice < qtdPaciente; indice++) {
            if (status[indice]) {
                System.out.println("======================Paciente em caso grave:=========================");
                System.out.println(nomes[indice]);
                System.out.println(idades[indice]);
                System.out.println("======================================================================");
            }
        }
    }
}
