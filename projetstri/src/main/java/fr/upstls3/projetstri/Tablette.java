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
public class Tablette extends Equipement {
    
    private int tailleEcran;
    private String marque;
    private String modele;
    
    public Tablette(int tailleEcran,String marque, String modele){
        
        super();
        this.tailleEcran = tailleEcran;
        this.marque = marque;
        this.modele = modele;
    }
            
            
    
}
