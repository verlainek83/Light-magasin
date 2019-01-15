package presentation;

import dao.ClientsDao;
import dao.DaoFactory;
import javax.swing.JTable;

/**
 *
 * @author verla
 */
public class JIFClients extends javax.swing.JInternalFrame {
    
   private DaoFactory factory = DaoFactory.getInstance();
   private ClientsDao daoCli = factory.getDAOClients();
   private TableModelClients myCliModel = new TableModelClients(daoCli.selectClients());; 
    
    public JIFClients() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(myCliModel);

        setBorder(null);
        setTitle("CLIENTS");
        setVisible(true);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 204, 153));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
