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
    
    private int nbPortsGoEthernet;
    private int nbPortsLAN;
    
    public Routeur(int id_equipement,String cpu, int ram, String os, boolean etat, String adresseMAC, int disque,int nbPortsGoEthernet, int nbPortsLAN) {
        super(id_equipement, cpu,  ram,  os,  etat,  adresseMAC,  disque);
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
