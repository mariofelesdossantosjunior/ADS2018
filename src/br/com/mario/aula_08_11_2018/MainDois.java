/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_08_11_2018;

/**
 *
 * @author mario
 */
public class MainDois {

    public static Pessoa pessoas[] = {
        new Pessoa("Jose", 50, 80.0, 1.88),
        new Pessoa("Alexandre", 40, 70.0, 1.30),
        new Pessoa("Vitor", 22, 50.0, 1.60),
        new Pessoa("Hugo", 70, 100.0, 2.0),
        new Pessoa("Maria", 46, 90.0, 1.54)};

    public static void main(String[] args) {

        Double somaIdade = 0.0;
        Double somaPeso = 0.0;
        Double somaAltura = 0.0;

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());

            somaIdade += pessoa.getIdade();
            somaPeso += pessoa.getPeso();
            somaAltura += pessoa.getAltura();
        }

        System.out.println("Idade Media: " + (somaIdade / pessoas.length));
        System.out.println("Idade Media: " + (somaPeso / pessoas.length));
        System.out.println("Idade Media: " + (somaAltura / pessoas.length));
    }

}
