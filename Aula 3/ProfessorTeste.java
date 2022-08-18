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
public class ProfessorTeste {
    public static void main(String[] args){
    
    Professor prof1 = new Professor();
    
    prof1.nome = "Ruan";
    prof1.matricula = "1235";
    prof1.salario = 1200f;
    prof1.imprime(prof1);
    
    
    }
    
    
    
    
    
}
