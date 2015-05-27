/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 * Classe Tablette héritée de la classe Equipement
 * @author Ludovic
 */
public class Tablette extends Equipement {
    
    protected int tailleEcran;
    protected String cpu;
    protected int ram;
    protected String adresseMAC;
    protected int disque;
   
       
    /**
    * Constructeur de la class Tablette
    * @author Ludovic
    * @param id variable d'entrée de type int représentant l'Id de la tablette.
    * @param cpu variable d'entrée de type int représentant le CPU de la tablette. 
    * @param ram variable d'entrée de type int représentant la RAM de la tablette
    * @param os variable d'entrée de type String représentant l'OS de la tablette
    * @param etat variable d'entrée de type String représentant l'état de la tablette
    * @param adresseMAC variable d'entrée de type String représentant l'adresse MAC de la tablette
    * @param disque variable d'entrée de type int représentant le disque de la tablette
    * @param tailleEcran variable d'entrée de type int représentant la taille de l'écran de la tablette
    * @param marque variable d'entrée de type String représentant la marque de la tablette
    * @param modele variable d'entrée de type String représentant le modèle de la tablette
    * @param numero_salle variable d'entrée de type int représentant le numéro de la salle a laquelle appartient la tablette
    */
    public Tablette(int id,String cpu, int ram, String os, String etat, String adresseMAC, int disque,int tailleEcran,String marque, String modele,int numero_salle){
        
        super(id,marque, modele,os, etat,numero_salle);
        this.tailleEcran = tailleEcran;
        this.adresseMAC = adresseMAC;
        this.cpu = cpu;
        this.disque = disque;
        this.ram = ram;
    }
   /**
    * Fonction getTailleEcran : getteur de l'attribut tailleEcran 
    * @author Ludovic
    * @return la taille de l'écran
    */
    public int getTailleEcran() {
        return this.tailleEcran;
    }
    /**
    * Fonction getCpu : getteur de l'attribut cpu 
    * @author Ludovic
    * @return le cpu de la tablette
    */
    public String getCpu() {
        return cpu;
    }
    /**
    * Fonction getAdresseMAC : getteur de l'attibut adresseMAC de la tablette 
    * @author Ludovic
    * @return l'adresse MAC de la tablette
    */
    public String getAdresseMAC() {
        return adresseMAC;
    }
    /**
    * Fonction getDisque : getteur de l'attibut disque de la tablette 
    * @author Ludovic
    * @return le disque de la tablette
    */
    public int getDisque() {
        return disque;
    }
    /**
    * Fonction getRam : getteur de l'attibut RAM de la tablette 
    * @author Ludovic
    * @return la ram de la tablette
    */
    public int getRam() {
        return ram;
    }
    /**
    * Fonction setAdresseMAC : setteur permettant de modifier l'attibut adresseMAC de la tablette 
    * @author Ludovic
    * @param adresseMAC variable d'entrée de type String représentant l'adresse MAC de la tablette
    */
    public void setAdresseMAC(String adresseMAC) {
        this.adresseMAC = adresseMAC;
    }
    /**
    * Fonction setCpu : setteur de l'attibut cpu de la tablette 
    * @author Ludovic
    * @param cpu variable d'entrée de type String représentant le cpu de la tablette
    */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    /**
    * Fonction setDisque : setteur de l'attibut disque de la tablette 
    * @author Ludovic
    * @param disque variable d'entrée de type String représentant le disque de la tablette
    */
    public void setDisque(int disque) {
        this.disque = disque;
    }
    /**
    * Fonction setTailleEcran : setteur de l'attibut tailleEcran de la tablette 
    * @author Ludovic
    * @param tailleEcran variable d'entrée de type String représentant la taille de l'écran de la tablette
    */
    public void setTailleEcran(int tailleEcran) {
        this.tailleEcran = tailleEcran;
    }
    /**
    * Fonction setRam : setteur de l'attibut ram de la tablette 
    * @author Ludovic
    * @param ram variable d'entrée de type String représentant la ram de la tablette
    */
    public void setRam(int ram) {
        this.ram = ram;
    }
    
}
