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
    protected String cpu;
    protected int ram;
    protected String adresseMAC;
    protected int disque;
   
    
    public Tablette(int id,String cpu, int ram, String os, String etat, String adresseMAC, int disque,int tailleEcran,String marque, String modele,int numero_salle){
        
        super(id,marque, modele,os, etat,numero_salle);
        this.tailleEcran = tailleEcran;
        this.adresseMAC = adresseMAC;
        this.cpu = cpu;
        this.disque = disque;
        this.ram = ram;
    }
    
    public int getTailleEcran() {
        return this.tailleEcran;
    }

    public String getCpu() {
        return cpu;
    }

    public String getAdresseMAC() {
        return adresseMAC;
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

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDisque(int disque) {
        this.disque = disque;
    }

    public void setTailleEcran(int tailleEcran) {
        this.tailleEcran = tailleEcran;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
}
