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
}
