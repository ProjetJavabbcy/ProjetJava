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

    private List<String> k;

    public SalleModel() {
        k = new ArrayList<>();
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
        if (column == 1) {
            return k.get(row);
        } else {
            return column;
        }
    }

    @Override
    public int getRowCount() {
        if (k != null) {
            return k.size();
        } else {
            return 0;
        }
    }

    void refresh() {
        fireTableStructureChanged();
    }

    void addItem(String text) {
        k.add(text);
    }
}
