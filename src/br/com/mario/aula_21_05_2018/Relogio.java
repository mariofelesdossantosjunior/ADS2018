/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_21_05_2018;

/**
 *
 * @author mario
 */
public class Relogio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {

                    System.out.println(horas + ":" + minutos + ":" + segundos);
                    Thread.sleep(1000);
                }
            }
        }
    }

}
