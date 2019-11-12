/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_2;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Artigo {
    Scanner teclado = new Scanner(System.in);
    private double prezoU;
    private double cantidadeU;
    private double prezoT;
    private double desconto;
    
    public Artigo(){
        
    }

    public Artigo(double prezoU, double cantidadeU) {
        this.prezoU = prezoU;
        this.cantidadeU = cantidadeU;
    }

    public double getPrezoU() {
        return prezoU;
    }

    public double getCantidadeU() {
        return cantidadeU;
    }

    public void setPrezoU(double prezoU) {
        this.prezoU = prezoU;
    }

    public void setCantidadeU(double cantidadeU) {
        this.cantidadeU = cantidadeU;
    }
    
    public void datos(){
        System.out.println("Escribe o número de unidades:");
        cantidadeU = teclado.nextDouble();
        System.out.println("Escribe o prezo por unidade:");
        prezoU = teclado.nextDouble();
    }
    
    public String operacions(){
        if(cantidadeU < 100){
            desconto = 0;
            prezoT = cantidadeU * prezoU - cantidadeU * prezoU * desconto;
        }
        if(cantidadeU >= 100 && cantidadeU < 200){
            if((cantidadeU * prezoU)>4000){
                desconto = 0.05; 
            }
            else{
                desconto = 0.02;
            }
            prezoT = cantidadeU * prezoU - cantidadeU * prezoU * desconto;
        }
        else{
            if((cantidadeU * prezoU)>4000){
                desconto = 0.10; 
            }
            else{
                desconto = 0.08;
            }
            prezoT = cantidadeU * prezoU - cantidadeU * prezoU * desconto;
        }
        
        return ("\nUnidades: "+cantidadeU+"\nPrezo unidade: "+prezoU+"\nDesconto: "+Math.round(desconto*100)+"%"+"\nPrezo total: "+prezoT);
    }
}
