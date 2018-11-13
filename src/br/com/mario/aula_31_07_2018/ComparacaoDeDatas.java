/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_31_07_2018;

import java.time.LocalDateTime;

/**
 *
 * @author mario
 */
public class ComparacaoDeDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime amanha = hoje.plusDays(1);

        LocalDateTime vendaDepoisDe15Horas = hoje.plusHours(5);
        LocalDateTime vendaOntem = hoje.minusDays(1);
        LocalDateTime vendaOntemDeOtem = hoje.minusDays(2);

        validaIntervalo(vendaDepoisDe15Horas, hoje, amanha);
        validaIntervalo(vendaOntem, hoje, amanha);
        validaIntervalo(vendaOntemDeOtem, hoje, amanha);
    }

    private static void validaIntervalo(LocalDateTime dataVenda, LocalDateTime hoje, LocalDateTime amanha) {
        if (dataVenda.isAfter(hoje) && dataVenda.isBefore(amanha)) {
            System.out.println("Está dentro do prazo");
        } else {
            System.out.println("Não está dentro do prazo");
        }
    }

}
