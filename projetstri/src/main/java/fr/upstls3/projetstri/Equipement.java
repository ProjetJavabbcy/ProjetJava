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
    
    protected String os;
    protected String etat;
    protected String marque;
    protected String modele;
    protected int numero_salle;
    protected int id;
    
    public Equipement (int id,String marque,String modele,String os, String etat,int numero_salle)
    {
        this.marque = marque;
        this.modele = modele;
        this.os = os;
        this.etat= etat;
        this.numero_salle = numero_salle;
        this.id =id;
    }

    public String getOs() {
        return os;
    }
    
    public String getEtat(){
        return etat;
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

    public int getId() {
        return id;
    }
    
    public void setOs(String os) {
        this.os = os;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setNumero_salle(int numero_salle) {
        this.numero_salle = numero_salle;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}