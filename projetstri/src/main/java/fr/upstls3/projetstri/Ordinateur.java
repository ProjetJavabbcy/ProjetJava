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
    
    protected int carteGraphique;
    protected String type;
    
    
    public Ordinateur(String marque, String modele,String cpu, int ram, String os, String etat, String adresseMAC, int disque,int carteGraphique,String type, int numero_salle) 
    {
        super(marque,modele, cpu,  ram,  os,  etat,  adresseMAC,  disque,numero_salle);
        this.carteGraphique = carteGraphique;
        this.type = type;   
    }
    
    public int getCarteGraphique() {
        return this.carteGraphique;
    }
    
    public String getType() {
        return this.type;
    }   
}
