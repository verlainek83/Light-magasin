package presentation;

import beans.Clients;
import beans.LigneVente;
import beans.Produits;
import beans.Ventes;
import dao.DaoFactory;

import dao.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class JDLigneVenteInsert extends javax.swing.JDialog {
    private LigneVenteDao daoLig = DaoFactory.getInstance().getDAOLigneVente();
    private VentesDao daoVen = DaoFactory.getInstance().getDAOVentes();
    private ProduitsDao daoPro = DaoFactory.getInstance().getDAOProduits();
    
    /** Creates new form JDApparInsert */
    public JDLigneVenteInsert(java.awt.Frame parent, String titre) {
        super(parent, titre, true);
        initComponents();
        fillComponents();
        getRootPane().setDefaultButton(jButtonOK);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/3);
        setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxVente = new javax.swing.JComboBox();
        MaskFormatter mM=null;
        try {
            mM = new MaskFormatter("######.##");
            mM.setPlaceholderCharacter('0');
        }
        catch (ParseException e){
            System.out.println ("Problème de masque");
        }
        jFormattedTextFieldQuantite = new JFormattedTextField(mM);
        jLabel2 = new javax.swing.JLabel();
        MaskFormatter mf=null;
        try {
            mf = new MaskFormatter("######.##");
            mf.setPlaceholderCharacter('0');
        }
        catch (ParseException e){
            System.out.println ("Problème de masque");
        }
        jFormattedTextFieldPrix = new JFormattedTextField(mf);
        jComboBoxProd = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTES");

        jLabel3.setText("PRIX");

        jLabel5.setText("QUANTITE");

        jFormattedTextFieldQuantite.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jFormattedTextFieldQuantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldQuantiteActionPerformed(evt);
            }
        });

        jLabel2.setText("PRODUITS");

        jFormattedTextFieldPrix.setEditable(false);
        jFormattedTextFieldPrix.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jFormattedTextFieldPrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPrixActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel5)
                    .add(jLabel3)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jFormattedTextFieldQuantite, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxVente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 314, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldPrix, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 314, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboBoxVente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jFormattedTextFieldQuantite, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jFormattedTextFieldPrix, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(142, 142, 142))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonOK);

        jButtonAnnul.setText("Annuler");
        jButtonAnnul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAnnul);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        LigneVente lig = new LigneVente();
        lig.setNumVente((Ventes) jComboBoxVente.getSelectedItem());
        lig.setCodeProd((Produits) jComboBoxProd.getSelectedItem());
        lig.setQuantite(Double.parseDouble(jFormattedTextFieldQuantite.getText()));
        //lig.setPrix(Double.parseDouble(jFormattedTextFieldPrix.getText()));
        lig.getCodeProd().setPrix(Double.parseDouble(jFormattedTextFieldPrix.getText()));
                
        try {
            daoLig.insertLigneVente(lig);
            System.out.println("coucou");
        } catch (DaoException e) {
            JOptionPane.showMessageDialog(null,"Insertion impossible ! ","Avertissement",JOptionPane.ERROR_MESSAGE);
        }

        this.dispose();  
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jFormattedTextFieldQuantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldQuantiteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, jFormattedTextFieldQuantite.getText());
    }//GEN-LAST:event_jFormattedTextFieldQuantiteActionPerformed

    private void jFormattedTextFieldPrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPrixActionPerformed
        JOptionPane.showMessageDialog(this, jFormattedTextFieldPrix.getText());
    }//GEN-LAST:event_jFormattedTextFieldPrixActionPerformed
    
    private void fillComponents()
    {
        // lig.setPrix(Double.parseDouble(jFormattedTextFieldPrix.getText()));
        //jFormattedTextFieldPrix.setText(Double.toString(lig.getCodeProd().getPrix()));
        /* charger toutes les catégories */
        ArrayList <Produits> pro = daoPro.selectProduits();
        for (int i=0;i<pro.size();i++)
            jComboBoxProd.addItem(pro.get(i));
        
        ArrayList <Ventes> ven = daoVen.selectVentes();
        for (int i=0;i<ven.size();i++)
            jComboBoxVente.addItem(ven.get(i));
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnul;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxProd;
    private javax.swing.JComboBox jComboBoxVente;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrix;
    private javax.swing.JFormattedTextField jFormattedTextFieldQuantite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
}
