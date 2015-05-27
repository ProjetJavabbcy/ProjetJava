/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 * Classe Salle
 * @author Selim - YAHI
 */
public class Salle {

    protected int numeroSalle;
    protected String nom;
    protected int nbPosteInstalles;
    protected int nbPostePossibles;
    protected String emplacement;
    
    /**
    * Constructeur de la classe Salle
    * @author Selim - YAHI
    * @param numeroSalle variable d'entrée de type int représentant le numéro de la salle.
    * @param nom variable d'entrée de type String représentant le nom de la salle.
    * @param emplacement variable d'entrée de type String représsentant l'emplacement de la salle.
    * @param nbPostePossi variable d'entrée de type int représentant le nombre de postes possibles dans la salle
    * @param nbPosteIns variable d'entrée de type int représentant le nombre de postes installés dans la salle.
    */
    public Salle (int numeroSalle,String nom, String emplacement, int nbPostePossi, int nbPosteIns)
    {
        this.numeroSalle = numeroSalle;
        this.nom = nom;
        this.emplacement = emplacement;
        this.nbPostePossibles = nbPostePossi;
        this.nbPosteInstalles = nbPosteIns;
        
        
    }
    /**
     * Fonction getNumeroSalle : getteur de l'attribut numeroSalle
     * @author Selim - YAHI
     * @return Le numero de la salle.
     */
    public int getNumeroSalle() {
        return numeroSalle;
    }
    
    /**
     * Fonction setNumeroSalle : setteur de l'attribut numeroSalle
     * @author Selim - YAHI
     * @param numeroSalle variable d'entrée de type int représentant le numéro de la salle que l'on souhaite modifier.
     */
    public void setNumeroSalle(int numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

     /**
     * Fonction getEmplacement : getteur de l'attribut emplacement
     * @author Selim - YAHI
     * @return L'emplacement de la salle.
     */   
    public String getEmplacement() {
        return emplacement;
    }
     /**
     * Fonction getNbPosteInstalles : getteur de l'attribut nbPosteInstalles
     * @author Selim - YAHI
     * @return Le nombre de postes installés dans la salle.
     */
    public int getNbPosteInstalles() {
        return nbPosteInstalles;
    }
     /**
     * Fonction getNbPostePossibles : getteur de l'attribut nbPostePossibles
     * @author Selim - YAHI
     * @return Le nombre de postes possibles dans la salle.
     */
    public int getNbPostePossibles() {
        return nbPostePossibles;
    }
     /**
     * Fonction getNom : getteur de l'attribut nom
     * @author Selim - YAHI
     * @return Le nom de la salle.
     */
    public String getNom() {
        return nom;
    }
     /**
     * Fonction setEmplacement : setteur de l'attribut emplacement
     * @author Selim - YAHI
     * @param emplacement variable d'entrée de type String représentant le nouvel emmplacement de la salle.
     */
    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }
     /**
     * Fonction setNbPosteInstalles : setteur de l'attribut nbPosteInstalles
     * @author Selim - YAHI
     * @param nbPosteInstalles variable d'entrée de type int représentant le nouveau nombre de postes installes dans la salle.
     */
    public void setNbPosteInstalles(int nbPosteInstalles) {
        this.nbPosteInstalles = nbPosteInstalles;
    }
    
     /**
     * Fonction setNbPostePossibles : setteur de l'attribut nbPostePossibles
     * @author Selim - YAHI
     * @param nbPostePossibles variable d'entrée de type int représentant le nouveau nombre de postes possibles dans la salle.
     */
    public void setNbPostePossibles(int nbPostePossibles) {
        this.nbPostePossibles = nbPostePossibles;
    }
     /**
     * Fonction setNom : setteur de l'attribut nom
     * @author Selim - YAHI
     * @param nom variable d'entrée de type String représentant le nouveau nom de la salle.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    
   

}
