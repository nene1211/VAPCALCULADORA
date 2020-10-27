/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vapcalculadora;

/**
 *
 * @author NENE1
 */




    public class Calculadora {
     double num1, num2;
    
    public Calculadora(){
    
}
    public Calculadora(double num1, double num2){
    
        this.num1=num1;
        this.num2=num2;
    }
    public double suma(double num1, double num2){
        return num1 + num2;
    }
    
    public double resta(double num1, double num2){
        
        return num1 - num2;
    }
    
    public double multiplicacion(double num1, double num2){
        
        return num1 * num2;
    }
    
    public double division (double num1, double num2){

        return num1 / num2;
    }
    /**
     * @param args the command line arguments
     */
}



