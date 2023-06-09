/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author HP Elitebook
 */
public class ÄndraHattmakare extends javax.swing.JFrame {
    

    /**
     * Creates new form ÄndraHattmakare
     */
    public ÄndraHattmakare() 
     { 
        initComponents();
        fyllcbHattmakare();
    }
    
    private void fyllcbHattmakare(){
        Connector conn = new Connector();
    String q = "SELECT Name FROM Employee;";

        ArrayList<String> Employees;
        try {
            Employees = conn.idb.fetchColumn(q);

            for (String employ : Employees) {
                CbHattmakare.addItem(employ);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelFooter = new javax.swing.JLabel();
        EditHattmakare = new javax.swing.JTextField();
        CbHattmakare = new javax.swing.JComboBox<>();
        Confirm_hattmakare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra namn på Hattmakare");

        LabelFooter.setText("Ange produktionsID för de artiklar du vill ändra hattmakare på:");

        EditHattmakare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditHattmakareActionPerformed(evt);
            }
        });

        CbHattmakare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj personal" }));
        CbHattmakare.setToolTipText("");
        CbHattmakare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbHattmakareActionPerformed(evt);
            }
        });

        Confirm_hattmakare.setText("Bekräfta");
        Confirm_hattmakare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_hattmakareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelFooter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EditHattmakare, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbHattmakare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(311, 311, 311))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Confirm_hattmakare)
                                .addGap(25, 25, 25))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditHattmakare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbHattmakare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(Confirm_hattmakare)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditHattmakareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditHattmakareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditHattmakareActionPerformed

    private void CbHattmakareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbHattmakareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbHattmakareActionPerformed

    private void Confirm_hattmakareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_hattmakareActionPerformed
        // TODO add your handling code here:
        try{
            Connector conn = new Connector();
            String changeHattmakare = EditHattmakare.getText();
            String newHattmakare = CbHattmakare.getSelectedItem().toString();
            
            //String fraga = "update production set EmployeeID='" + newStatus + "'where ProductionID= '" + changeStatus+"'";
            
                  String fraga1 = "select employeeID from employee where name = '" + newHattmakare + "'";
                  String getFraga1 = conn.idb.fetchSingle(fraga1);
                  String fraga= "UPDATE Production SET EmployeeID = " + getFraga1 + " where productionID = " + changeHattmakare + "";
            
            
            conn.idb.update(fraga);
            JOptionPane.showMessageDialog(null, "Hattmakare är ändrad");
        
        }
        
        catch(InfException ex){}
                                  
    }//GEN-LAST:event_Confirm_hattmakareActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraHattmakare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraHattmakare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraHattmakare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraHattmakare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÄndraHattmakare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbHattmakare;
    private javax.swing.JButton Confirm_hattmakare;
    private javax.swing.JTextField EditHattmakare;
    private javax.swing.JLabel LabelFooter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
