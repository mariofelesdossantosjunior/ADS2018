/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_29_10_2018;

/**
 *
 * @author mario
 */
public class Cidade {

    private String nome;
    private int QtdHabitantes;
    private String regiao;

    public Cidade() {
    }

    public Cidade(String nome) {
        this.nome = nome;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdHabitantes() {
        return QtdHabitantes;
    }

    public void setQtdHabitantes(int QtdHabitantes) {
        this.QtdHabitantes = QtdHabitantes;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", QtdHabitantes=" + QtdHabitantes + ", regiao=" + regiao + '}';
    }

}
