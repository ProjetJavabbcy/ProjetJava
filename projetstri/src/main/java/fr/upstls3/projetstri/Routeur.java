/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 *
 * @author Selim
 */
public class Routeur extends Equipement{
    
    protected int nbPortsGoEthernet;
    protected int nbPortsLAN;
    
    public Routeur(String marque, String modele, String os, String etat,int nbPortsGoEthernet, int nbPortsLAN, int numero_salle) {
        super(marque, modele, cpu,  ram,  os,  etat,  adresseMAC,  disque,numero_salle);
        this.nbPortsGoEthernet = nbPortsGoEthernet;
        this.nbPortsLAN = nbPortsLAN;
    }
    
    public int getNbPortsGoEthernet (){
        return this.nbPortsGoEthernet;
    }
    
    public int getnbPortsLAN() {
        return this.nbPortsLAN;
    }
    
    
}
