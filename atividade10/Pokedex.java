/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;

/**
 *
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Espeon es = new Espeon();
        Flareon f = new Flareon();
        Glaceon g = new Glaceon();
        Leafeon l = new Leafeon();
        Sylveon s = new Sylveon();
        Umbreon u = new Umbreon();
        Vaporeon v = new Vaporeon();
        
        e.imprimir();
        j.imprimir();
        es.imprimir();
        f.imprimir();
        g.imprimir();
        l.imprimir();
        s.imprimir();
        u.imprimir();
        v.imprimir();
                        
    }
    
}
