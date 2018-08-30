/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_16_08_2018;

/**
 *
 * @author mario
 */
public class FuncoesString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String texto = " IFPR Campus Umuarama ";

        //3) Passando a String para Caixa Alta
        String toUpperCase = texto.toUpperCase();
        System.out.println(toUpperCase);

        //4) Passando a String para Caixa Baixa
        String toLowerCase = texto.toLowerCase();
        System.out.println(toLowerCase);

        //5) Recupetando um pedaço da String
        String substring = texto.substring(0, 3);
        System.out.println(substring);

        //6) Removendo os espaços da String
        String trim = texto.trim();
        System.out.println(trim);

        //7) Substituição de String
        String replaceAll = texto.replaceAll("a", "*");
        System.out.println(replaceAll);

        //8) Conversão de primitivos para String
        int x = 10;
        double y = 23.50;

        String xConvertido = String.valueOf(x);
        String yConvertido = String.valueOf(y);

        System.out.println(xConvertido);
        System.out.println(yConvertido);

        int indexOf = texto.indexOf("a");
        System.out.println("Onde está o primeiro a : " + indexOf);
        
        //9) Pesquisa a posicao da String
    }

}
