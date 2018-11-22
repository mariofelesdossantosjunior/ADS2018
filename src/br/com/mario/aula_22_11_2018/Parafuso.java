/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_22_11_2018;

/**
 *
 * @author mario
 */
public class Parafuso {

    private Double peso;
    private Double comprimento;

    public Parafuso() {
    }

    public Parafuso(Double peso, Double comprimento) {
        this.peso = peso;
        this.comprimento = comprimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Parafuso{" + "peso=" + peso + ", comprimento=" + comprimento + '}';
    }

}
