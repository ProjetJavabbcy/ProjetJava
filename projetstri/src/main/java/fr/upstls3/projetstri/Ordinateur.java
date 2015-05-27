/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 * Classe Ordinateur héritée de la classe Equipement
 * @author Cyril CRISTOFOL
 */
public class Ordinateur extends Equipement {
    
    protected int carteGraphique;
    protected String mobilite;
    protected String cpu;
    protected int ram;
    protected String adresseMAC;
    protected int disque;
    
    /**
    * Constructeur de la classe Ordinateur
    * @author Cyril - CRISTOFOL
    * @param marque variable d'entrée de type String représentant la marque de l'ordinateur.
    * @param modele variable d'entrée de type String représentant le modele de l'ordinateur.
    * @param cpu variable d'entrée de type String représentant le cpu de l'ordinateur.
    * @param ram variable d'entrée de type int représentant la ram de l'ordinateur.
    * @param os variable d'entrée de type String représsentant l'os l'ordinateur.
    * @param etat variable d'entrée de type String représentant l'état du routeur.
    * @param adresseMAC variable d'entrée de type String représentant l'adresse MAC de l'ordinateur.
    * @param disque variable d'entrée de type int représentant le disque de l'ordinateur.
    * @param carteGraphique variable d'entrée de type int représentant la carte graphique de l'ordinateur.
    * @param mobilite variable d'entrée de type String représentant la mobilité de l'ordinateur (fixe, portable)
    * @param numero_salle variable d'entrée de type int représentant le numero de la salle a laquelle appartient l'ordinateur.
    */
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
        
    /**
    * Fonction getCarteGraphique
    * @author Cyril CRISTOFOL
    * @return Retourne l'attribut carteGraphique de l'ordinateur
    */
    public int getCarteGraphique() {
        return this.carteGraphique;
    }
    /**
    * Fonction getMobilite
    * @author Cyril CRISTOFOL
    * @return Retourne l'attribut mobilite de l'ordinateur
    */
    public String getMobilite() {
        return mobilite;
    }
    /**
    * Fonction getAdresseMAC
    * @author Cyril CRISTOFOL
    * @return Retourne l'attribut adresseMAC de l'ordinateur
    */
    public String getAdresseMAC() {
        return adresseMAC;
    }
    /**
    * Fonction getCpu
    * @author Cyril CRISTOFOL
    * @return Retourne l'attribut cpu de l'ordinateur
    */
    public String getCpu() {
        return cpu;
    }
    /**
    * Fonction getDisque
    * @author Cyril CRISTOFOL
    * @return Retourne l'attribut disque de l'ordinateur
    */
    public int getDisque() {
        return disque;
    }
    /**
    * Fonction getRam
    * @author Cyril CRISTOFOL
    * @return Retourne l'attribut ram de l'ordinateur
    */
    public int getRam() {
        return ram;
    }
    /**
    * Fonction setAdresseMAC
    * @author Cyril CRISTOFOL
    * @param adresseMAC variable d'entrée de type String représentant la nouvelle adresse MAC de l'ordinateur.
    */
    public void setAdresseMAC(String adresseMAC) {
        this.adresseMAC = adresseMAC;
    }
    /**
    * Fonction setCarteGraphique
    * @author Cyril CRISTOFOL
    * @param carteGraphique variable d'entrée de type int représentant la nouvelle carte graphique de l'ordinateur.
    */
    public void setCarteGraphique(int carteGraphique) {
        this.carteGraphique = carteGraphique;
    }
    /**
    * Fonction setCpu
    * @author Cyril CRISTOFOL
    * @param cpu variable d'entrée de type String représentant le nouveau cpu de l'ordinateur.
    */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    /**
    * Fonction setDisque
    * @author Cyril CRISTOFOL
    * @param disque variable d'entrée de type int représentant lee nouveau disque de l'ordinateur.
    */
    public void setDisque(int disque) {
        this.disque = disque;
    }
    /**
    * Fonction setRam
    * @author Cyril CRISTOFOL
    * @param ram variable d'entrée de type int représentant la nouvelle ram de l'ordinateur.
    */
    public void setRam(int ram) {
        this.ram = ram;
    }
    /**
    * Fonction setMobilite
    * @author Cyril CRISTOFOL
    * @param mobilite variable d'entrée de type String représentant la nouvelle mobilité de l'ordinateur.
    */
    public void setMobilite(String mobilite) {
        this.mobilite = mobilite;
    }
}
