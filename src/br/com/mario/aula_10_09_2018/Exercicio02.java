/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_10_09_2018;

/**
 *
 * @author mario
 */
public class Exercicio02 {

    public static void main(String[] args) {
        String faixaEtaria = verificaFaixaEtaria(18);
        System.out.println(faixaEtaria);
    }

    public static String verificaFaixaEtaria(int idade) {
        if (idade >= 0 && idade <= 2) {
            return "Bebê";
        } else if (idade >= 3 && idade <= 11) {
            return "Criança";
        } else if (idade >= 12 && idade <= 19) {
            return "Adolescente";
        } else if (idade >= 20 && idade <= 30) {
            return "Jovem";
        } else if (idade >= 31 && idade <= 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
