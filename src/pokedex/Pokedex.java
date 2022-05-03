/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 * @author Julia Araujo Calazans - 11211102258@alunos.umc.br
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Flareon f = new Flareon();
        Umbreon u = new Umbreon();
        Leafeon l = new Leafeon();
        Sylveon s = new Sylveon();
        Glaceon g = new Glaceon();
        Espeon es = new Espeon();
        Vaporeon v = new Vaporeon();
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = j;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = f;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = u;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = l;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = s;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = g;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = es;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
        
        e = v;
        
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("-----------------------------");
    }
    
}
