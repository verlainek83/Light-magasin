/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import beans.LigneVente;
import beans.Ventes;
import dao.DaoException;
import dao.DaoFactory;
import dao.LigneVenteDao;
import dao.ProduitsDao;
import dao.VentesDao;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author verla
 */
public class JIFLigneVente extends javax.swing.JInternalFrame {

    private DaoFactory factory = DaoFactory.getInstance();
    private LigneVenteDao daoLig = DaoFactory.getInstance().getDAOLigneVente();
    private VentesDao daoVen = DaoFactory.getInstance().getDAOVentes();
    private ProduitsDao daoPro = DaoFactory.getInstance().getDAOProduits();
    private TableModelLigneVente myLigModel = new TableModelLigneVente(daoLig.selectLigneVente());
    
    public JIFLigneVente() {
        initComponents();
        fillComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(myLigModel);
        jButtonAjouter = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBorder(null);
        setTitle("LIGNEVENTE");
        setVisible(true);

        jTable1.setBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(jTable1);

        jButtonAjouter.setText("AJOUTER");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jButtonSupprimer.setText("SUPPRIMER");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jButtonModifier.setText("MODIFIER");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });

        jLabel2.setText("NUMERO VENTE: ");

        jLabel3.setText("DATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModifier, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAjouter, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAjouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSupprimer)
                        .addContainerGap(205, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComponents() throws DaoException
    {

        ArrayList<Ventes> listeVen = daoVen.selectVentes();
        listeVen.add(0, new Ventes(0)); 
        for (Ventes ven : listeVen) {
            jComboBox1.addItem(Integer.toString(ven.getNumVente()));
        }
        
        jComboBox1.setEnabled(true);
     }
    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
         JFrame parent = (JFrame)(this.getDesktopPane().getTopLevelAncestor());
        new JDLigneVenteInsert(parent, "INSERTION De la Ligne de vente");
        // après l'insertion : rafraîchir les données en relisant la BD
        myLigModel.setMyList(daoLig.selectLigneVente());
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        if (jTable1.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(this,"Sélectionnez d'abord une ligne svp !","Avertissement",JOptionPane.ERROR_MESSAGE);
        else {
            // renvoie l'objet Ventes à passer en paramètre
            LigneVente lig = myLigModel.getMyList(jTable1.convertRowIndexToModel(jTable1.getSelectedRow()));
                      
            // récupère la JFrame parente
            JFrame parent = (JFrame)(this.getDesktopPane().getTopLevelAncestor());
            new JDLigneVenteModif(parent, "MODIFICATION De la vente", lig);
            
            // après la modification : rafraîchir les données en relisant la BD
            myLigModel.setMyList(daoLig.selectLigneVente()); 
        }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        if (jTable1.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null,"Sélectionnez d'abord une ligne svp !","Avertissement",JOptionPane.ERROR_MESSAGE);
        else {
            int rep = JOptionPane.showConfirmDialog(this,"Voulez-vous vraiment supprimer " +
                    myLigModel.getValueAt(jTable1.convertRowIndexToModel(jTable1.getSelectedRow()), 0) + " ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (rep == JOptionPane.YES_OPTION)
                try {    
                    daoLig.deleteLigneVente((Integer)myLigModel.getValueAt(jTable1.convertRowIndexToModel(jTable1.getSelectedRow()), 0));
                }
                catch (DaoException e) {
                    JOptionPane.showMessageDialog(null,"Suppression impossible !","Avertissement",JOptionPane.ERROR_MESSAGE);
                }
        }
        // après la suppression : rafraîchir les données en relisant la BD
        myLigModel.setMyList(daoLig.selectLigneVente());
    }//GEN-LAST:event_jButtonSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
