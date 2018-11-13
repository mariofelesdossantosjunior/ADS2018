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
public class Conta {

    private Integer codigo;
    private String nome;
    private Double saldo;

    public Conta() {
    }

    public Conta(Integer codigo, String nome, Double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "codigo=" + codigo + ", nome=" + nome + ", saldo=" + saldo + '}';
    }

}
