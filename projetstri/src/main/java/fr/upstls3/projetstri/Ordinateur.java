/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 *
 * @author Ludovic
 */
public class Ordinateur extends Equipement {
    
    private String carteGraphique;
    private String type;
    
    
    public Ordinateur(String carteGraphique,String type) {
        super();
        this.carteGraphique = carteGraphique;
        this.type = type;
        
    }
    
}
