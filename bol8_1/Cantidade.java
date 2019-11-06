/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_1;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Cantidade {
    Scanner teclado = new Scanner(System.in);
    private double cantidade;
    private double incremento;
    private double cantidadeFinal;
    
    public Cantidade() {
    }
    
    public String operaciones(){
        System.out.println("Escribe un número:");
        cantidade = teclado.nextDouble();
        if(cantidade <= 500){
            incremento = 0.5;
            cantidadeFinal = cantidade + (cantidade * incremento);
        }
        else if(cantidade>500 && cantidade<=1000){
            incremento = 0.07;
            cantidadeFinal = cantidade + (cantidade * incremento);
        }
        else if(cantidade>1000 && cantidade<=5000){
            incremento = 0.15;
            cantidadeFinal = cantidade + (cantidade * incremento);
        }
        else{
            incremento = 0.03;
            cantidadeFinal = cantidade + (cantidade * incremento);
        }
        return ("\nCantidade "+cantidade+"\nIncremento "+Math.round(incremento*100)+"%"+"\nCantidade final "+cantidadeFinal);
    }
}
