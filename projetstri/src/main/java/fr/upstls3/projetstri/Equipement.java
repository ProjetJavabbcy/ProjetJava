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
    public boolean etat;
    public String adresseMAC;
    public int disque;
  
    public Equipement (int id_equipement,String cpu, int ram, String os, boolean etat, String adresseMAC, int disque)
    {
        this.id_equipement = id_equipement;
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.etat= etat;
        this.adresseMAC = adresseMAC;
        this.disque = disque;
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
    
    public boolean getEtat(){
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

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}


