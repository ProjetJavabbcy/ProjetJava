/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 * Classe Routeur héritée de la classe Equipement
 * @author Loic - BARBARESCO
 */
public class Routeur extends Equipement{
    
    protected int nbPortsGoEthernet;
    protected int nbPortsLAN;
    
    /**
    * Constructeur de la classe Salle
    * @author Loic - BARBARESCO
    * @param marque variable d'entrée de type String représentant la marque du routeur.
    * @param modele variable d'entrée de type String représentant le modele du routeur.
    * @param os variable d'entrée de type String représsentant l'os du routeur.
    * @param etat variable d'entrée de type String représentant l'état du routeur.
    * @param nbPortsGoEthernet variable d'entrée de type int représentant le nombre de ports Go Ethernet du routeur.
    * @param nbPortsLAN variable d'entrée de type int représentant le nombre de ports LAN du routeur.
    */
    public Routeur(int id,String marque, String modele, String os, String etat,int nbPortsGoEthernet, int nbPortsLAN, int numero_salle) {
        super(id,marque, modele,os,etat,numero_salle);
        this.nbPortsGoEthernet = nbPortsGoEthernet;
        this.nbPortsLAN = nbPortsLAN;
    }
    /**
    * Fonction getNbPortsGoEthernet : getteur de l'attibut nbPortsGoEthernet 
    * @author Loic - BARBARESCO
    * @return le nombre de ports Go Ethernet du routeur.
    */
    public int getNbPortsGoEthernet (){
        return this.nbPortsGoEthernet;
    }
    /**
    * Fonction getNbPortsLAN : getteur de l'attibut nbPortsLAN 
    * @author Loic - BARBARESCO
    * @return le nombre de ports LAN du routeur.
    */
    public int getNbPortsLAN() {
        return nbPortsLAN;
    }
    /**
    * Fonction setNbPortsGoEthernet : setteur de l'attibut nbPortsGoEthernet 
    * @author Loic - BARBARESCO
    * @param nbPortsGoEthernet variable d'entrée de type int permettant de modifier le nombre de ports GoEthernet du routeur.
    */
    public void setNbPortsGoEthernet(int nbPortsGoEthernet) {
        this.nbPortsGoEthernet = nbPortsGoEthernet;
    }
    /**
    * Fonction setNbPortsLAN : setteur de l'attibut nbPortsLAN 
    * @author Loic - BARBARESCO
    * @param nbPortsLAN variable d'entrée de type int permettant de modifier le nombre de ports LAN du routeur.
    */
    public void setNbPortsLAN(int nbPortsLAN) {
        this.nbPortsLAN = nbPortsLAN;
    }
     
}
