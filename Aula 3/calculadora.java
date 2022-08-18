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
public class calculadora {
    public void soma(int num1 , int num2){
    
        System.out.println(num1 + num2);
        
    
    }
    
    public void multiplica(int num1 , int num2 ){
        
        if ((num1== 0||num2== 0)  ) {
           return; 
        }
        
        System.out.println(num1 * num2);
        
    
    }
    
    public double divide(double num1 , double num2 ){
        if (num2 != 0 ) {
           return num1/num2; 
        }
        return 0; 
        
    
    }
    
    public int divideInt(double num1 , double num2 ){
    
        return (int)(num1/num2);
        
    
    }
    
    
}
