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
    
    
    public Ordinateur(int id_equipement,String cpu, int ram, String os, boolean etat, String adresseMAC, int disque,String carteGraphique,String type) 
    {
        super(id_equipement, cpu,  ram,  os,  etat,  adresseMAC,  disque);
        this.carteGraphique = carteGraphique;
        this.type = type;   
    }
    
    public String getCarteGraphique() {
        return this.carteGraphique;
    }
    
    public String getType() {
        return this.type;
    }   
}
