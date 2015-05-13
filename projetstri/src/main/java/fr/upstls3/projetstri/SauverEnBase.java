/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cyrilou
 */
public class SauverEnBase {
    public static void main(String[] args) {
        // Information d'accès à la base de données
		String url = "jdbc:mysql://151.80.140.253/projet_java_bd";
		String login = "java";
		String passwd = "projetjava3166";
		Connection cn =null;
		Statement st =null;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			/*String sql = "INSERT INTO `Ordinateur` (`Id_ordinateur`,`num_salle`) VALUES ('1')";*/
                        String sql = "INSERT INTO `Salle` (`num_salle`) VALUES ('1')";
			// Etape 4 : exécution requête
			st.executeUpdate(sql);
                        
			// Si récup données alors étapes 5 (parcours Resultset)

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    }
    }
}
