package apteka;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        setTitle("APTEKA");
        setLocation(50, 100);
    }
    String sciezka = "C:\\Users\\Basian\\Documents\\"
            + "NetBeansProjects\\Apteka\\src\\apteka\\lekarstwa.txt";  //sciezka dokumenty z lekami

    ArrayList<String> list;

    //metoda do dodawania wersow w tabeli, w parametrach podajemy arrayliste z metod ...
    //..wyszukiwania oraz tabele do ktorej zostana dodane wersy
    private void dodajWiersze(ArrayList lista, JTable tabela) throws IOException {

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);                                                 //czyszczenie tabeli
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        list = lista;
        Object rowData[] = new Object[7];                              //uzupelnianie tabeli wierszami 
        for (int i = 0; i < list.size(); i++) {
            String[] first_read = list.get(i).split(";");

            rowData[0] = first_read[0];
            rowData[1] = first_read[1];
            rowData[2] = first_read[2];
            rowData[3] = first_read[3];
            rowData[4] = first_read[4];
            rowData[5] = first_read[5];
            rowData[6] = first_read[6];
            model.addRow(rowData);
        }

    }

//metoda do pobierania numeru wersu z pliku z lekami
    // w parematrze podajemy index danej, po ktorym bedziemy porownywac dane do drugiej tabeli
    private String pobierzWers(int index) {

        int NRwiersza = jTable.getSelectedRow();

        String wiersz = list.get(NRwiersza);

        String[] first_read = wiersz.split(";");

        return first_read[index];

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
        jZakladki = new javax.swing.JTabbedPane();
        jPanel_Nazwa = new javax.swing.JPanel();
        jBtnID = new javax.swing.JButton();
        jTxtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Nazwa1 = new javax.swing.JPanel();
        jBtnNazwa = new javax.swing.JButton();
        jTxtNazwa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel_Nazwa2 = new javax.swing.JPanel();
        jBtnKatgoria = new javax.swing.JButton();
        jTxtKategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBtnWyjscie = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePorownania = new javax.swing.JTable();
        jBtnPorownajKategoria = new javax.swing.JButton();
        jBtnPrzeciwwskazanie = new javax.swing.JButton();
        jBtnZamiennik = new javax.swing.JButton();

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

        jZakladki.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jBtnID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnID.setText("Wyszukaj lek");
        jBtnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIDActionPerformed(evt);
            }
        });

        jTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Wpisz id szukanego leku:");

        javax.swing.GroupLayout jPanel_NazwaLayout = new javax.swing.GroupLayout(jPanel_Nazwa);
        jPanel_Nazwa.setLayout(jPanel_NazwaLayout);
        jPanel_NazwaLayout.setHorizontalGroup(
            jPanel_NazwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NazwaLayout.createSequentialGroup()
                .addGap(0, 558, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_NazwaLayout.setVerticalGroup(
            jPanel_NazwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnID, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(jTxtID, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jBtnID.getAccessibleContext().setAccessibleName("Wyszukaj lek ");

        jZakladki.addTab("ID", jPanel_Nazwa);

        jBtnNazwa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnNazwa.setText("Wyszukaj lek");
        jBtnNazwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNazwaActionPerformed(evt);
            }
        });

        jTxtNazwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNazwaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Wpisz nazwę szukanego leku:");

        javax.swing.GroupLayout jPanel_Nazwa1Layout = new javax.swing.GroupLayout(jPanel_Nazwa1);
        jPanel_Nazwa1.setLayout(jPanel_Nazwa1Layout);
        jPanel_Nazwa1Layout.setHorizontalGroup(
            jPanel_Nazwa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Nazwa1Layout.createSequentialGroup()
                .addGap(0, 527, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_Nazwa1Layout.setVerticalGroup(
            jPanel_Nazwa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnNazwa, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(jTxtNazwa)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jZakladki.addTab("Nazwa", jPanel_Nazwa1);

        jBtnKatgoria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnKatgoria.setText("Wyszukaj lek");
        jBtnKatgoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnKatgoriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Wyszukaj kategorię:");

        javax.swing.GroupLayout jPanel_Nazwa2Layout = new javax.swing.GroupLayout(jPanel_Nazwa2);
        jPanel_Nazwa2.setLayout(jPanel_Nazwa2Layout);
        jPanel_Nazwa2Layout.setHorizontalGroup(
            jPanel_Nazwa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Nazwa2Layout.createSequentialGroup()
                .addGap(0, 595, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnKatgoria, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_Nazwa2Layout.setVerticalGroup(
            jPanel_Nazwa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnKatgoria, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(jTxtKategoria)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jZakladki.addTab("Kategoria", jPanel_Nazwa2);

        jBtnWyjscie.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBtnWyjscie.setText("Wyjscie");
        jBtnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnWyjscieActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nazwa", "Skład", "Przeciwwskazania", "Kategoria", "Cena", "Recepta"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jTablePorownania.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nazwa", "Skład", "Przeciwwskazania", "Kategoria", "Cena", "Recepta"
            }
        ));
        jScrollPane3.setViewportView(jTablePorownania);

        jBtnPorownajKategoria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnPorownajKategoria.setText("Porównaj po składzie");
        jBtnPorownajKategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPorownajSkladActionPerformed(evt);
            }
        });

        jBtnPrzeciwwskazanie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnPrzeciwwskazanie.setText("Porównaj po przeciwwskazaniach");
        jBtnPrzeciwwskazanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrzeciwwskazanieActionPerformed(evt);
            }
        });

        jBtnZamiennik.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jBtnZamiennik.setText("Znajdź tańszy zamiennik");
        jBtnZamiennik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnZamiennikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jZakladki, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnPorownajKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPrzeciwwskazanie)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnZamiennik, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnWyjscie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jZakladki, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPorownajKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPrzeciwwskazanie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnZamiennik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jZakladki.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnWyjscieActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnWyjscieActionPerformed

    //przycisk do wyszukiwania po kategorii
    private void jBtnKatgoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnKatgoriaActionPerformed

        String szukany = " " + jTxtKategoria.getText();

        try {    //walidacja pobranych danych
            if (" ".equals(szukany)) {
                JOptionPane.showMessageDialog(null, "Proszę uzupełnić pole Wyszukania.");
            } else {
                WyszukiwanieKategorie wk = new WyszukiwanieKategorie();
                dodajWiersze(wk.WyszukiwanieKategorie(sciezka, szukany), jTable);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd");
        }
    }//GEN-LAST:event_jBtnKatgoriaActionPerformed
//przycisk do wyszukiwania po nazwie
    private void jBtnNazwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNazwaActionPerformed
        String szukany = jTxtNazwa.getText();

        try {
            if ("".equals(szukany)) {
                JOptionPane.showMessageDialog(null, "Proszę uzupełnić pole Wyszukania.");
            } else {
                Wczytanie w = new Wczytanie(sciezka, szukany);
                w.wyszukanie_kmp();
                dodajWiersze(w.przekazanie_elementow(), jTable);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd");
        }
    }//GEN-LAST:event_jBtnNazwaActionPerformed
//przycisk do wyszukiwania po ID
    private void jBtnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIDActionPerformed

        String doSprawdzenia = jTxtID.getText();

        WyszukiwanieBinarne wb = new WyszukiwanieBinarne();
        String sprawdzenie = "";
        for (int i = 0; i < doSprawdzenia.length(); i++) {
            if (Character.isDigit(doSprawdzenia.charAt(i))) {
                sprawdzenie += String.valueOf(doSprawdzenia.charAt(i));
            }
        }

        if (!doSprawdzenia.equals(sprawdzenie)) {
            JOptionPane.showMessageDialog(null, "W polu wyszukania ID wymaga się tylko cyfr!");
        } else {
            try {
                int szukany = Integer.valueOf(jTxtID.getText());
                if ("".equals(szukany)) {
                    JOptionPane.showMessageDialog(null, "Proszę uzupełnić pole Wyszukania.");
                } else {
                    dodajWiersze(wb.wyszukanieID(sciezka, szukany), jTable);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd");
            }
        }

//           
    }//GEN-LAST:event_jBtnIDActionPerformed

    private void jTxtNazwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNazwaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNazwaActionPerformed

    //przycisk do porownania składu
    private void jBtnPorownajSkladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPorownajSkladActionPerformed
        try {
            if (jTable.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Proszę wybrać wiersz do porównania");
            } else {
                String[] ps = pobierzWers(2).split(",");
                Wczytanie porownanie = new Wczytanie(sciezka, "");
                //Petla ktora wykonuje sie tyle razy ile jest skladnikow do porownania
                for (int i = 0; i < ps.length; i++) {
                    porownanie.zmianapatterna(ps[i]);
                    porownanie.porownanie_algorytm_boyer_more();

                }
                dodajWiersze(porownanie.przekazanie_elementow(), jTablePorownania);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd");
        }
    }//GEN-LAST:event_jBtnPorownajSkladActionPerformed
//przycisk do porownania po przeciwwksazaniach
    private void jBtnPrzeciwwskazanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrzeciwwskazanieActionPerformed
        try {
            if (jTable.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Proszę wybrać wiersz do porównania");
            } else {
                String[] pw = pobierzWers(3).split(",");
                Algorytm_Karpa_Rabina akr = new Algorytm_Karpa_Rabina(sciezka);
                //Petla ktora wykonuje tyle razy ile jest przeciwskazan
                for (int i = 0; i < pw.length; i++) {

                    akr.wyszukaniePrzeciwwskazania(pw[i]);
                }
                dodajWiersze(akr.przekazanie_elementow(), jTablePorownania);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd");
        }

    }//GEN-LAST:event_jBtnPrzeciwwskazanieActionPerformed
//przycisk do znaleznienia tanszego zamiennika
    private void jBtnZamiennikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnZamiennikActionPerformed

        try {
            if (jTable.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Proszę wybrać wiersz do porównania");
            } else {
                ArrayList<String> temp;
                WyszukiwanieKategorie wk = new WyszukiwanieKategorie();
                temp = wk.WyszukiwanieKategorie(sciezka, pobierzWers(4));
                String tab[];
                ArrayList<Integer> numery_indekow_do_usuniecia = new ArrayList<>();

                //Petla ktora szuka tanszych zamienikow po cenie
                for (String item : temp) {
                    tab = item.split(";");
                    if (Float.valueOf(tab[5]) > Float.valueOf(pobierzWers(5))) {
                        numery_indekow_do_usuniecia.add(Integer.valueOf(tab[0]));
                    }

                }
                //Petla do usowania drozszych produktow
                for (int item : numery_indekow_do_usuniecia) {
                    temp.remove(item);
                }

                dodajWiersze(temp, jTablePorownania);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Wystąpił nieoczekiwany błąd");
        }
    }//GEN-LAST:event_jBtnZamiennikActionPerformed

    private void jTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIDActionPerformed

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
    private javax.swing.JButton jBtnID;
    private javax.swing.JButton jBtnKatgoria;
    private javax.swing.JButton jBtnNazwa;
    private javax.swing.JButton jBtnPorownajKategoria;
    private javax.swing.JButton jBtnPrzeciwwskazanie;
    private javax.swing.JButton jBtnWyjscie;
    private javax.swing.JButton jBtnZamiennik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Nazwa;
    private javax.swing.JPanel jPanel_Nazwa1;
    private javax.swing.JPanel jPanel_Nazwa2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTablePorownania;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtKategoria;
    private javax.swing.JTextField jTxtNazwa;
    private javax.swing.JTabbedPane jZakladki;
    // End of variables declaration//GEN-END:variables

}
