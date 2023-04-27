/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filip
 */
public class KopaMaterial extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form KopaMaterial
     */
    public KopaMaterial() {
        initComponents();
    try{
        idb = new InfDB ("hattdb", "3306", "hattdba", "hattkey");
        
    } catch(InfException e){
        
    }
    
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
        artikelT = new javax.swing.JTable();
        sokKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        artikelT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Artiklar ", "Material(m)"
            }
        ));
        jScrollPane1.setViewportView(artikelT);

        sokKnapp.setText("Sök");
        sokKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokKnappActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Sök lagda artiklar ");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sokKnapp)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(sokKnapp)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sokKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokKnappActionPerformed
        
       try{
            //String lagd = "Select status from production where status = 'lagd'"; 
            //String sqlFraga = "select material_name, amount from article, production, material, article_contains_of_material where status = '" + lagd + "'";
            //String sqlFraga = "select a.article_Name, acm.Amount from article a join article_contains_of_material acm on a.ArticleID = acm.ArticleID join production p on a.ArticleID = p.ArticleID where p.status = '"+ lagd + "'";
            //String sqlFraga = "select distinct Material_name from material, article_contains_of_material, article, production where material.MaterialID = article_contains_of_material.MaterialID and article_contains_of_material.ArticleID = Article.ArticleID and Article.ArticleID = production.ArticleID and status = '" + lagd + "';" ;
//            String sqlFraga = "SELECT m.Material_Name, acm.Amount \n" +
//            "FROM article a \n" +
//            "JOIN article_contains_of_material acm ON a.ArticleID = acm.ArticleID \n" +
//            "Join material m ON m.MaterialID = acm.MaterialID \n" +
//            "JOIN production p ON a.ArticleID = p.ArticleID \n" +
//            "WHERE p.Status = 'Lagd';";
            String sqlFraga = "select amount, material_Name FROM article a JOIN article_contains_of_material acm ON a.ArticleID = acm.ArticleID Join material m ON m.MaterialID = acm.MaterialID JOIN production p ON a.ArticleID = p.ArticleID WHERE p.Status = 'Lagd';"; 
            
            
            
            DefaultTableModel dTM = (DefaultTableModel) artikelT.getModel();
            dTM.setRowCount(0);

            //Skapa hashmap för att hålla lista på Namn och Registreringsdatum.
        ArrayList<HashMap<String, String>> artikelT; // först testa vi bara  HashMap<String, String>, men förslag gav oss istället Arraylist<HashMap<String, String>> som funka.
        artikelT = idb.fetchRows(sqlFraga);

        //Loopa igenom datum.
        for(HashMap ettRegDatum : artikelT){
                Vector nyLista = new Vector(); //Vi testade först med --> ArrayList nyLista = new ArrayList(); men gav felmedellande. Förslag gav = gör med vector istället. 
                nyLista.add(ettRegDatum.get("Material_name"));
                nyLista.add(ettRegDatum.get("Amount"));
                dTM.addRow(nyLista);
        }
        } catch (InfException undanTag){
        JOptionPane.showMessageDialog(null,"Något fel uppstod");
        System.out.println("Error: " + undanTag);
        } 
        
        
        
        
        
        
    }//GEN-LAST:event_sokKnappActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(KopaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KopaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KopaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KopaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KopaMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable artikelT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sokKnapp;
    // End of variables declaration//GEN-END:variables
}