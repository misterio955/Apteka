package apteka;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basian
 */
public class Apteka extends javax.swing.JFrame {

    /**
     * Creates new form blablabll
     */
    public Apteka() {
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

        jPanel1 = new javax.swing.JPanel();
        jTxtFldSzukany = new javax.swing.JTextField();
        jZakladki = new javax.swing.JTabbedPane();
        jPanel_Nazwa = new javax.swing.JPanel();
        jButtonID = new javax.swing.JButton();
        jPanel_Kategoria = new javax.swing.JTabbedPane();
        jPanel_ID = new javax.swing.JTabbedPane();
        jPanelZamiennik = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnWyjscie = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtFldSzukany.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTxtFldSzukany.setText("Wpisz szukany lek");
        jTxtFldSzukany.setToolTipText("");

        jButtonID.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonID.setText("Wyszukaj lek");
        jButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_NazwaLayout = new javax.swing.GroupLayout(jPanel_Nazwa);
        jPanel_Nazwa.setLayout(jPanel_NazwaLayout);
        jPanel_NazwaLayout.setHorizontalGroup(
            jPanel_NazwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NazwaLayout.createSequentialGroup()
                .addGap(0, 380, Short.MAX_VALUE)
                .addComponent(jButtonID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_NazwaLayout.setVerticalGroup(
            jPanel_NazwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NazwaLayout.createSequentialGroup()
                .addComponent(jButtonID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jButtonID.getAccessibleContext().setAccessibleName("Wyszukaj lek ");

        jZakladki.addTab("Nazwa", jPanel_Nazwa);
        jZakladki.addTab("Kategoria", jPanel_Kategoria);
        jPanel_Kategoria.getAccessibleContext().setAccessibleName("Kategoria");

        jZakladki.addTab("ID", jPanel_ID);
        jZakladki.addTab("Zamiennik", jPanelZamiennik);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jBtnWyjscie.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jBtnWyjscie.setText("Wyjscie");
        jBtnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnWyjscieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtFldSzukany)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jZakladki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTxtFldSzukany, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jZakladki, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jZakladki.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIDActionPerformed
        
        
        
        try {
            WyszukiwanieBinarne wb = new WyszukiwanieBinarne();
            wb.wyszukanieID("C:\\lekarstwa.txt", 2);
        } catch (IOException ex) {
            Logger.getLogger(Apteka.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButtonIDActionPerformed

    private void jBtnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnWyjscieActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnWyjscieActionPerformed

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
            java.util.logging.Logger.getLogger(Apteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apteka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnWyjscie;
    private javax.swing.JButton jButtonID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jPanelZamiennik;
    private javax.swing.JTabbedPane jPanel_ID;
    private javax.swing.JTabbedPane jPanel_Kategoria;
    private javax.swing.JPanel jPanel_Nazwa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtFldSzukany;
    private javax.swing.JTabbedPane jZakladki;
    // End of variables declaration//GEN-END:variables

    
}
