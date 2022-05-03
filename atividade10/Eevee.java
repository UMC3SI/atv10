/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;

/**
 *
 * @author alunocmc
 */
public class Eevee {
    
    String tipo;
    Double peso;
    int altura;
    int hp;
    
    public String Ataque(){
        return "Ataque Rápido";
    }
    
    public String Defesa(){
        return "Desvio";
    }
    
    public String Especial(){
        return "Tri-Ataque";
    }
    
    public void imprimir(){
        System.out.println("------------------------------");
        System.out.println("Ataque: " + this.Ataque());
        System.out.println("Defesa: " + this.Defesa());
        System.out.println("Especial: " + this.Especial());
        System.out.println("------------------------------");
        
    }
    
}
