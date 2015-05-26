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
    
    protected int tailleEcran;
   
    
    public Tablette(String cpu, int ram, String os, String etat, String adresseMAC, int disque,int tailleEcran,String marque, String modele,int numero_salle){
        
        super( marque, modele, cpu,  ram,  os,  etat,  adresseMAC,  disque,numero_salle);
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
