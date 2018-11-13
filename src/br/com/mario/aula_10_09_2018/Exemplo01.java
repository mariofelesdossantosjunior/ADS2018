/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_10_09_2018;

/**
 *
 * @author marioViadinhoDaSilva
 */
public class Exemplo01 {

    static Calculos calculos = new Calculos();

    public static void main(String[] args) {
        Double soma = calculos.soma(10.0, 20.0);
        System.out.println("Soma: " + soma);

        Double subtracao = calculos.subtracao(10.0, 20.0);
        System.out.println("Subtracao: " + subtracao);

        Double multiplicacao = calculos.multiplicacao(10.0, 20.0);
        System.out.println("Multiplicacao: " + multiplicacao);

        Double divisao = calculos.divisao(10.0, 20.0);
        System.out.println("Divisao: " + divisao);

        Double exponenciacao = calculos.exponenciacao(10.0, 20.0);
        System.out.println("Exponenciacao: " + exponenciacao);
    }

}
