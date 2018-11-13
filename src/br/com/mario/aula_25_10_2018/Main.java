/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_25_10_2018;

/**
 *
 * @author mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Mario");
        aluno.setAltura(1.88);
        aluno.setPeso(90);
        aluno.setIdade(32);

        Aluno pedro = new Aluno("PEdro");
        pedro.setAltura(1.88);
        pedro.setPeso(90);
        pedro.setIdade(32);
        aluno.setIdade(32);

        Aluno jose = new Aluno("Jose", 30, 90, 30);
        
        System.out.println(aluno.toString());

        double imc = aluno.getImc();

        System.out.println("IMC: " + imc);
    }

}
