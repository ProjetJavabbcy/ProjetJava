/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upstls3.projetstri;

/**
 *
 * @author 21408116
 */
public class NewJFrame extends javax.swing.JFrame {

    SalleModel salleModel = new SalleModel();
    EquipementModel EquipementModel = new EquipementModel();

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tableau_Salle = new javax.swing.JScrollPane();
        tableSalle = new javax.swing.JTable();
        label_salle = new javax.swing.JLabel();
        label_ajout_salle = new javax.swing.JLabel();
        label_nom_salle = new javax.swing.JLabel();
        champ_salle = new javax.swing.JTextField();
        label_emplacement_salle = new javax.swing.JLabel();
        champ_emplacement_salle = new javax.swing.JTextField();
        label_poste_possible = new javax.swing.JLabel();
        champ_poste_possible = new javax.swing.JTextField();
        label_poste_installe = new javax.swing.JLabel();
        champ_poste_installe = new javax.swing.JTextField();
        bouton_valider_salle = new javax.swing.JButton();
        bouton_annuler_salle = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_equipement = new javax.swing.JLabel();
        label_ajout_equipement = new javax.swing.JLabel();
        champ_id_equipement = new javax.swing.JTextField();
        label_id_equipement = new javax.swing.JLabel();
        label_type = new javax.swing.JLabel();
        ComboBox_type = new javax.swing.JComboBox();
        label_cpu = new javax.swing.JLabel();
        champ_cpu = new javax.swing.JTextField();
        label_ram = new javax.swing.JLabel();
        champ_ram = new javax.swing.JTextField();
        label_disque = new javax.swing.JLabel();
        champ_disque = new javax.swing.JTextField();
        label_carte_graphique = new javax.swing.JLabel();
        champ_carte_graphique = new javax.swing.JTextField();
        label_os = new javax.swing.JLabel();
        champ_os = new javax.swing.JTextField();
        label_num_salle = new javax.swing.JLabel();
        champ_num_salle = new javax.swing.JTextField();
        bouton_valider_equipement = new javax.swing.JButton();
        bouton_annuler_equipement = new javax.swing.JButton();
        tableau_Equipement = new javax.swing.JScrollPane();
        tableEquipement = new javax.swing.JTable();
        label_adresse_mac = new javax.swing.JLabel();
        champ_adresse_mac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableSalle.setModel(salleModel);
        tableau_Salle.setViewportView(tableSalle);

        label_salle.setText("Salles :");

        label_ajout_salle.setText("Ajouter Salle :");

        label_nom_salle.setText("Nom salle : ");

        champ_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champ_salleActionPerformed(evt);
            }
        });

        label_emplacement_salle.setText("Emplacement salle :");

        champ_emplacement_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champ_emplacement_salleActionPerformed(evt);
            }
        });

        label_poste_possible.setText("Nb postes possibles : ");

        label_poste_installe.setText("Nb postes installés : ");

        bouton_valider_salle.setText("Valider");
        bouton_valider_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_valider_salleActionPerformed(evt);
            }
        });

        bouton_annuler_salle.setText("Annuler");
        bouton_annuler_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_annuler_salleActionPerformed(evt);
            }
        });

        label_equipement.setText("Equipements : ");

        label_ajout_equipement.setText("Ajouter Equipement :");

        label_id_equipement.setText("ID  :");

        label_type.setText("Type : ");

        ComboBox_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ordinateur", "Tablette", "Routeur" }));
        ComboBox_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_typeActionPerformed(evt);
            }
        });

        label_cpu.setText("CPU : ");

        label_ram.setText("RAM :");

        label_disque.setText("Disque : ");

        label_carte_graphique.setText("Carte graphique : ");

        champ_carte_graphique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champ_carte_graphiqueActionPerformed(evt);
            }
        });

        label_os.setText("OS :");

        champ_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champ_osActionPerformed(evt);
            }
        });

        label_num_salle.setText("Numero salle :");

        champ_num_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champ_num_salleActionPerformed(evt);
            }
        });

        bouton_valider_equipement.setText("Valider");
        bouton_valider_equipement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_valider_equipementActionPerformed(evt);
            }
        });

        bouton_annuler_equipement.setText("Annuler");

        tableEquipement.setModel(EquipementModel);
        tableau_Equipement.setViewportView(tableEquipement);

        label_adresse_mac.setText("@Mac :");

        jLabel1.setText("Etat :");

        jCheckBox1.setText("Allumé");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Eteint");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_num_salle)
                                    .addComponent(champ_num_salle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nom_salle)
                                    .addComponent(champ_salle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(champ_emplacement_salle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_emplacement_salle, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(champ_poste_possible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_poste_possible))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_poste_installe)
                                    .addComponent(champ_poste_installe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bouton_valider_salle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bouton_annuler_salle))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_ajout_salle)
                            .addComponent(label_salle)
                            .addComponent(tableau_Salle, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_ajout_equipement)
                            .addComponent(label_equipement)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_id_equipement)
                                        .addGap(59, 59, 59)
                                        .addComponent(label_type)
                                        .addGap(44, 44, 44)
                                        .addComponent(label_cpu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(champ_id_equipement, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ComboBox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(champ_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_ram)
                                    .addComponent(champ_ram, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(champ_disque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_disque))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(champ_carte_graphique, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(champ_os, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_carte_graphique)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_os)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_adresse_mac)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(champ_adresse_mac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2))))
                            .addComponent(tableau_Equipement, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bouton_valider_equipement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bouton_annuler_equipement)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_salle)
                .addGap(16, 16, 16)
                .addComponent(tableau_Salle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ajout_salle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nom_salle)
                    .addComponent(label_emplacement_salle)
                    .addComponent(label_poste_installe)
                    .addComponent(label_num_salle)
                    .addComponent(label_poste_possible))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champ_salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_emplacement_salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_poste_possible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_num_salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_poste_installe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouton_valider_salle)
                    .addComponent(bouton_annuler_salle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_equipement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableau_Equipement, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(label_ajout_equipement)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id_equipement)
                    .addComponent(label_type)
                    .addComponent(label_cpu)
                    .addComponent(label_ram)
                    .addComponent(label_disque)
                    .addComponent(label_carte_graphique)
                    .addComponent(label_os)
                    .addComponent(label_adresse_mac)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champ_id_equipement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_disque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_carte_graphique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_os, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champ_adresse_mac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouton_valider_equipement)
                    .addComponent(bouton_annuler_equipement))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void champ_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champ_salleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champ_salleActionPerformed

    private void ComboBox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_typeActionPerformed

    private void champ_carte_graphiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champ_carte_graphiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champ_carte_graphiqueActionPerformed

    private void champ_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champ_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champ_osActionPerformed

    private void bouton_valider_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_valider_salleActionPerformed
        // TODO add your handling code here:
        int i = Integer.parseInt(champ_num_salle.getText()) ;
        int j = Integer.parseInt(champ_poste_possible.getText()) ;
        int k = Integer.parseInt(champ_poste_installe.getText()) ;
        salleModel.addItem(new Salle(i,champ_salle.getText(), champ_emplacement_salle.getText(), j, k));
        salleModel.refresh();
    }//GEN-LAST:event_bouton_valider_salleActionPerformed

    private void champ_num_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champ_num_salleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champ_num_salleActionPerformed

    private void champ_emplacement_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champ_emplacement_salleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champ_emplacement_salleActionPerformed

    private void bouton_annuler_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_annuler_salleActionPerformed
        // TODO add your handling code here:
        champ_num_salle.setText("");
        champ_salle.setText("");
        champ_emplacement_salle.setText("");
        champ_poste_possible.setText("");
        champ_poste_installe.setText("");
    }//GEN-LAST:event_bouton_annuler_salleActionPerformed

    private void bouton_valider_equipementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_valider_equipementActionPerformed
        // TODO add your handling code here:
        int i = Integer.parseInt(champ_id_equipement.getText()) ;
        int j = Integer.parseInt(champ_disque.getText()) ;
        int k = Integer.parseInt(champ_ram.getText()) ;
       // EquipementModel.addItem(new Equipement(i,champ_cpu.getText(),k, champ_os.getText(), j, k));
        salleModel.refresh();
    }//GEN-LAST:event_bouton_valider_equipementActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_type;
    private javax.swing.JButton bouton_annuler_equipement;
    private javax.swing.JButton bouton_annuler_salle;
    private javax.swing.JButton bouton_valider_equipement;
    private javax.swing.JButton bouton_valider_salle;
    private javax.swing.JTextField champ_adresse_mac;
    private javax.swing.JTextField champ_carte_graphique;
    private javax.swing.JTextField champ_cpu;
    private javax.swing.JTextField champ_disque;
    private javax.swing.JTextField champ_emplacement_salle;
    private javax.swing.JTextField champ_id_equipement;
    private javax.swing.JTextField champ_num_salle;
    private javax.swing.JTextField champ_os;
    private javax.swing.JTextField champ_poste_installe;
    private javax.swing.JTextField champ_poste_possible;
    private javax.swing.JTextField champ_ram;
    private javax.swing.JTextField champ_salle;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label_adresse_mac;
    private javax.swing.JLabel label_ajout_equipement;
    private javax.swing.JLabel label_ajout_salle;
    private javax.swing.JLabel label_carte_graphique;
    private javax.swing.JLabel label_cpu;
    private javax.swing.JLabel label_disque;
    private javax.swing.JLabel label_emplacement_salle;
    private javax.swing.JLabel label_equipement;
    private javax.swing.JLabel label_id_equipement;
    private javax.swing.JLabel label_nom_salle;
    private javax.swing.JLabel label_num_salle;
    private javax.swing.JLabel label_os;
    private javax.swing.JLabel label_poste_installe;
    private javax.swing.JLabel label_poste_possible;
    private javax.swing.JLabel label_ram;
    private javax.swing.JLabel label_salle;
    private javax.swing.JLabel label_type;
    private javax.swing.JTable tableEquipement;
    private javax.swing.JTable tableSalle;
    private javax.swing.JScrollPane tableau_Equipement;
    private javax.swing.JScrollPane tableau_Salle;
    // End of variables declaration//GEN-END:variables
}
