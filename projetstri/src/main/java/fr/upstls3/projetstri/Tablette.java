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
   
    
    public Tablette(int id_equipement,String cpu, int ram, String os, boolean etat, String adresseMAC, int disque,int tailleEcran,String marque, String modele){
        
        super(id_equipement, marque, modele, cpu,  ram,  os,  etat,  adresseMAC,  disque);
        this.tailleEcran = tailleEcran;
        
    }
    
    public int getTailleEcran() {
        return this.tailleEcran;
    }
    
    public String getMarque () {
        return this.marque;
    }
           
    public String getModel() {
        return this.modele;
    }
}
