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
public class CalculadoraTeste {
    
    public static void main(String[] args){
        
        calculadora calc = new calculadora();
        calc.soma(10,41);
        calc.multiplica(1,33);
        System.out.println(calc.divide(8,0));
        System.out.println(calc.divideInt(7,2));
    
    
    }
    
}
