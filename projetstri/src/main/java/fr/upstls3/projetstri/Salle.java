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

    private String nom;
    private int nbPosteInstalles;
    private int nbPostePossibles;
    private String emplacement;
    
    
    public Salle (String nom, String emplacement, int nbPostePossi, int nbPosteIns)
    {
        this.nom = nom;
        this.emplacement = emplacement;
        this.nbPostePossibles = nbPostePossi;
        this.nbPosteInstalles = nbPosteIns;
        
        
    }
    
    Salle s = new Salle("toto", "u2", 50, 10);

}
