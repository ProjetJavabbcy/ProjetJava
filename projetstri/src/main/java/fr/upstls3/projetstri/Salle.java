/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 *
 * @author 21408116
 */
public class Salle {

    protected int numeroSalle;
    protected String nom;
    protected int nbPosteInstalles;
    protected int nbPostePossibles;
    protected String emplacement;
    
    
    public Salle (int numeroSalle,String nom, String emplacement, int nbPostePossi, int nbPosteIns)
    {
        this.numeroSalle = numeroSalle;
        this.nom = nom;
        this.emplacement = emplacement;
        this.nbPostePossibles = nbPostePossi;
        this.nbPosteInstalles = nbPosteIns;
        
        
    }

    public int getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(int numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    
    public String getEmplacement() {
        return emplacement;
    }

    public int getNbPosteInstalles() {
        return nbPosteInstalles;
    }

    public int getNbPostePossibles() {
        return nbPostePossibles;
    }

    public String getNom() {
        return nom;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public void setNbPosteInstalles(int nbPosteInstalles) {
        this.nbPosteInstalles = nbPosteInstalles;
    }

    public void setNbPostePossibles(int nbPostePossibles) {
        this.nbPostePossibles = nbPostePossibles;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    
   

}
