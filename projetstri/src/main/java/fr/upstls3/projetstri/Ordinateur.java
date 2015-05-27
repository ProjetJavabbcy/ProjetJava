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
    protected String mobilite;
    protected String cpu;
    protected int ram;
    protected String adresseMAC;
    protected int disque;
    
    
    public Ordinateur(int id, String marque, String modele,String cpu, int ram, String os, String etat, String adresseMAC, int disque,int carteGraphique,String mobilite, int numero_salle) 
    {
        super(id,marque,modele,os,etat,numero_salle);
        this.carteGraphique = carteGraphique;
        this.mobilite = mobilite;
        this.adresseMAC = adresseMAC;
        this.cpu = cpu;
        this.disque = disque;
        this.ram = ram;
    }
    
    public int getCarteGraphique() {
        return this.carteGraphique;
    }

    public String getMobilite() {
        return mobilite;
    }

    public String getAdresseMAC() {
        return adresseMAC;
    }

    public String getCpu() {
        return cpu;
    }

    public int getDisque() {
        return disque;
    }

    public int getRam() {
        return ram;
    }

    public void setAdresseMAC(String adresseMAC) {
        this.adresseMAC = adresseMAC;
    }

    public void setCarteGraphique(int carteGraphique) {
        this.carteGraphique = carteGraphique;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDisque(int disque) {
        this.disque = disque;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMobilite(String mobilite) {
        this.mobilite = mobilite;
    }
}
