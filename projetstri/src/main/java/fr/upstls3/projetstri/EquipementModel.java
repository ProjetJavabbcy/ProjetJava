/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ludovic
 */
public class EquipementModel extends DefaultTableModel {

    private List<Equipement> a;

    public EquipementModel() {
        this.a = new ArrayList<Equipement>();

    }

    @Override
    public int getColumnCount() {
        return 7;

    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Identifiant";
        } else if (column == 1) {
            return "CPU";
        } else if (column == 2) {
            return "RAM";
        } else if (column == 3) {
            return "OS";
        } else if (column == 4) {
            return "Etat";
        } else if (column == 5) {
            return "@MAC";
        } else if (column == 6) {
            return "Disque";
        } else {
            return null;
        }

    }
    
        @Override
    public Object getValueAt(int row, int column) {
        if (column == 0) {
            return a.get(row).getId_equipement();
        } 
        else if (column == 1){
            return a.get(row).getCpu();
        }
        else if (column == 2){
            return a.get(row).getRam();
        }
        else if (column == 3){
            return a.get(row).getOs();
        }
        else if (column == 4){
            return a.get(row).getAdresseMAC();
        }
      
        return "error";
    }

    
    
    
    
}
