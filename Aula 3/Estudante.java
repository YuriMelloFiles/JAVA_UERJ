/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uerj.eng.desc.javacore.introclasses;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
}
