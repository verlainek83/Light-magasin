package presentation;

import beans.Clients;
import beans.Produits;
import beans.Ventes;
import dao.DaoFactory;

import dao.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class JDVentesInsert extends javax.swing.JDialog {
    private VentesDao daoVen = DaoFactory.getInstance().getDAOVentes();
    private ClientsDao daoCli = DaoFactory.getInstance().getDAOClients();
    private ProduitsDao daoPro = DaoFactory.getInstance().getDAOProduits();
    
    /** Creates new form JDApparInsert */
    public JDVentesInsert(java.awt.Frame parent, String titre) {
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
        jLabel6 = new javax.swing.JLabel();
        jComboCli = new javax.swing.JComboBox();
        jDateChooserDate = new com.toedter.calendar.JDateChooser();
        jCheckBoxPaye = new javax.swing.JCheckBox();
        MaskFormatter mf=null;
        try {
            mf = new MaskFormatter("######.##");
            mf.setPlaceholderCharacter('0');
        }
        catch (ParseException e){
            System.out.println ("Problème de masque");
        }
        jFormattedTextFieldTotal = new JFormattedTextField(mf);
        jPanel2 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTS");

        jLabel3.setText("PAYE");

        jLabel5.setText("TOTAL");

        jLabel6.setText("DATE");

        jDateChooserDate.setDateFormatString("dd-MM-yyyy");

        jFormattedTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jFormattedTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTotalActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel5)
                            .add(jLabel3))
                        .add(27, 27, 27)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jDateChooserDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jCheckBoxPaye)
                            .add(jFormattedTextFieldTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboCli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 314, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboCli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jDateChooserDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .add(20, 20, 20)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jFormattedTextFieldTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jCheckBoxPaye))
                .add(136, 136, 136))
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
        Ventes ven = new Ventes();
        ven.setNumCli((Clients)jComboCli.getSelectedItem());
        ven.setDate(jDateChooserDate.getDate()); 
        ven.setTotal(Double.parseDouble(jFormattedTextFieldTotal.getText()));
        ven.setPaye(jCheckBoxPaye.isSelected());
       
        //total = prix * quantite;
       // lig.setQuantite(Double.parseDouble(jFormattedTextFieldQuantite.getText()));
        //lig.setPrix(Double.parseDouble(jFormattedTextFieldPrix.getText()));
       // lig.getCodeProd().setPrix(Double.parseDouble(jFormattedTextFieldPrix.getText()));
        
        
        try {
            daoVen.insertVentes(ven);
        } catch (DaoException e) {
            JOptionPane.showMessageDialog(null,"Insertion impossible ! ","Avertissement",JOptionPane.ERROR_MESSAGE);
        }

        this.dispose();
       
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jFormattedTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTotalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, jFormattedTextFieldTotal.getText());
    }//GEN-LAST:event_jFormattedTextFieldTotalActionPerformed
    
    private void fillComponents()
    {
        /* charger toutes les catégories */
        ArrayList <Clients> cli = daoCli.selectClients();
        for (int i=0;i<cli.size();i++)
            jComboCli.addItem(cli.get(i));
        
        Date now = new Date();
        jDateChooserDate.setDate(now);
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnul;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxPaye;
    private javax.swing.JComboBox jComboCli;
    private com.toedter.calendar.JDateChooser jDateChooserDate;
    private javax.swing.JFormattedTextField jFormattedTextFieldTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
}
