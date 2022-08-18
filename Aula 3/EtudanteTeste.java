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
public class EtudanteTeste {
    
    public static void main(String[] args){
    
        Estudante estudante = new Estudante();
        estudante.setNome("Yuri");
        estudante.setIdade(23);
        double[] notas = {3,7,5,6};
        estudante.setNotas(notas);
        
    }
    
}
