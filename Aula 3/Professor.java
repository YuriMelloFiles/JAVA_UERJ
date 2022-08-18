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
public class Professor {
    
    public String nome;
    public String matricula;
    public float salario;
    
    public void imprime(Professor prof){
        
        System.out.println(prof.nome);
        System.out.println(prof.salario);
    
    }

    
}
