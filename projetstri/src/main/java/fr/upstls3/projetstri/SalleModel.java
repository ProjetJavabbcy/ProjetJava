/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 21408116
 */
public class SalleModel extends DefaultTableModel {

    private List<Salle> k;

    public SalleModel() {
        this.k = new ArrayList<Salle>();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
       if (column == 0) {
            return "Nom salle";
        } 
       else if (column ==1){
            return "Emplacement";
        }
        else if (column ==2){
            return "Nombre de pistes possibles";
        }
        else if (column ==3){
            return "Nombre de postes installés";
        }
        else {
        return null;   
        }
        
    }

    
    @Override
    public Object getValueAt(int row, int column) {
        if (column == 0) {
            return k.get(row).getNom();
        } 
        else if (column == 1){
            return k.get(row).getEmplacement();
        }
        else if (column == 2){
            return k.get(row).getNbPostePossibles();
        }
        else if (column == 3){
            return k.get(row).getNbPosteInstalles();
        }
        
        return "error";
    }

    @Override
    public int getRowCount() {
        if (k != null) {
            return k.size();
        } else {
            return 0;
        }
    }

    public void refresh() {
        fireTableStructureChanged();
    }

    public void addItem(Salle s) {
        k.add(s);
    }
}
