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
public class Equipement {
    
    public int id_equipement;
    public String cpu;
    public int ram;
    public String os;
    public String etat;
    public String adresseMAC;
    public int disque;
    public String marque;
    public String modele;
    public int numero_salle;
    
    public Equipement (String marque,String modele,String cpu, int ram, String os, String etat, String adresseMAC, int disque, int numero_salle)
    {
        this.id_equipement = id_equipement;
        this.marque = marque;
        this.modele = modele;
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.etat= etat;
        this.adresseMAC = adresseMAC;
        this.disque = disque;
        this.numero_salle = numero_salle;
    }

    public int getId_equipement() {
        return id_equipement;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }
    
    public String getEtat(){
        return etat;
    }
    
    public String getAdresseMAC() {
        return adresseMAC;
    }

    public int getDisque() {
        return disque;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getNumero_salle() {
        return numero_salle;
    }
    
    
}


