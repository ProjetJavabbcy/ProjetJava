/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 * Classe Equipement 
 * @author Selim - YAHI
 */
public class Equipement {
    
    protected String os;
    protected String etat;
    protected String marque;
    protected String modele;
    protected int numero_salle;
    protected int id;
    /**
    * Constructeur Equipement
    * @author Selim - YAHI
    * @param id variable d'entrée de type int représentant l'id de l'équipement.
    * @param marque variable d'entrée de type String représentant la marque l'équipement.
    * @param modele variable d'entrée de type String représentant le modèle de l'équipement.
    * @param os variable d'entrée de type String rerésentant l'os de l'équipement.
    * @param etat variable d'entrée de type String représentant l'état de l'équipement
    * @param numero_salle variable d'entrée de type int représentant le numero de la salle a laquelle partiennt l'équipement.
    */
    public Equipement (int id,String marque,String modele,String os, String etat,int numero_salle)
    {
        this.marque = marque;
        this.modele = modele;
        this.os = os;
        this.etat= etat;
        this.numero_salle = numero_salle;
        this.id =id;
    }
    
    /**
    * Fonction getOs : getteur de l'attribut os
    * @author Selim - YAHI
    * @return L'os de l'équipement.
    */  
    public String getOs() {
        return os;
    }
    
    /**
    * Fonction getEtat : getteur de l'attribut etat
    * @author Selim - YAHI
    * @return L'état de l'équipement.
    */
    public String getEtat(){
        return etat;
    }
    
    /**
    * Fonction getMarque : getteur de l'attribut marque
    * @author Selim - YAHI
    * @return La marque de l'équipement.
    */
    public String getMarque() {
        return marque;
    }
    
     /**
     * Fonction getModele : getteur de l'attribut modele
     * @author Selim - YAHI
     * @return Le modele de l'équipement.
     */
    public String getModele() {
        return modele;
    }
    /**
     * Fonction getNumero_salle : getteur de l'attribut numeroSalle
     * @author Selim - YAHI
     * @return Le numero de la salle.
     */
    public int getNumero_salle() {
        return numero_salle;
    }
     /**
     * Fonction getId : getteur de l'attribut id
     * @author Selim - YAHI
     * @return L'Id de l'équipement.
     */
    public int getId() {
        return id;
    }
   
    /**
     * Fonction setOs : setteur de l'attribut os
     * @author Selim - YAHI
     * @param os variable d'entrée de type String représentant le nouvel os de l'équipement.
     */
    public void setOs(String os) {
        this.os = os;
    }
     /**
     * Fonction setEtat : setteur de l'attribut etat
     * @author Selim - YAHI
     * @param etat variable d'entrée de type String représentant le nouvel etat de l'équipement.
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }
     /**
     * Fonction setMarque : setteur de l'attribut marque
     * @author Selim - YAHI
     * @param marque variable d'entrée de type String représentant la nouvelle marque de l'équipement.
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * Fonction setModele : setteur de l'attribut modele
     * @author Selim - YAHI
     * @param modele variable d'entrée de type String représentant le nouveau modele de l'équipement.
     */
    public void setModele(String modele) {
        this.modele = modele;
    }
     /**
     * Fonction setNumero : setteur de l'attribut numro_salle
     * @author Selim - YAHI
     * @param numero_salle variable d'entrée de type int représentant la nouvelle salle de l'équipement.
     */
    public void setNumero_salle(int numero_salle) {
        this.numero_salle = numero_salle;
    }

   /**
     * Fonction setId : setteur de l'attribut Id
     * @author Selim - YAHI
     * @param id variable d'entrée de type int représentant le nouvel id de l'équipement.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}