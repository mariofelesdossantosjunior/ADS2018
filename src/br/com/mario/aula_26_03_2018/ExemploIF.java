/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_26_03_2018;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExemploIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        if(idade >= 18){
            System.out.println("Voce e de MAIOR");
        }else{
            System.out.println("Voce e de MENOR");
        }
    }

}
