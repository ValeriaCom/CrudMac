/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmacedone.UI;

import crudmacedone.AnnullaEvent;
import crudmacedone.AutomaCrud;
import crudmacedone.AutomabileCrud;
import crudmacedone.ConfermaEvent;
import crudmacedone.ModificaEvent;
import crudmacedone.NuovaEvent;
import crudmacedone.RicercaEvent;
import crudmacedone.RimuoviEvent;
import crudmacedone.SelezionaEvent;

/**
 *
 * @author 39392
 */
public class CrudUI extends javax.swing.JFrame implements AutomabileCrud {

    AutomaCrud automa;

    /**
     * Creates new form CrudUI
     */
    public CrudUI() {
        initComponents();
        automa = new AutomaCrud(this);
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
        jTable1 = new javax.swing.JTable();
        jButtonModifica = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jButtonNuova = new javax.swing.JButton();
        jButtonCerca = new javax.swing.JButton();
        jLabelCodice = new javax.swing.JLabel();
        jLabelDescrizione = new javax.swing.JLabel();
        jButtonSeleziona = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Column1 = new javax.swing.JTable();
        jLabelCercaPerCodice = new javax.swing.JLabel();
        jTextFieldInserisciCodice = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonModifica.setText("Modifica");
        jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaActionPerformed(evt);
            }
        });

        jButtonConferma.setText("Conferma");
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");
        jButtonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviActionPerformed(evt);
            }
        });

        jButtonNuova.setText("Nuova");
        jButtonNuova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuovaActionPerformed(evt);
            }
        });

        jButtonCerca.setText("Cerca");
        jButtonCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCercaActionPerformed(evt);
            }
        });

        jLabelCodice.setText("Codice");

        jLabelDescrizione.setText("Descrizione");

        jButtonSeleziona.setText("Seleziona");
        jButtonSeleziona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelezionaActionPerformed(evt);
            }
        });

        Column1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(Column1);

        jLabelCercaPerCodice.setText("Cerca Per Codice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonModifica)
                                    .addComponent(jLabelCodice))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescrizione)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonConferma)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAnnulla)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonRimuovi)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonNuova))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSeleziona))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldInserisciCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCerca))
                            .addComponent(jLabelCercaPerCodice))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodice)
                    .addComponent(jLabelDescrizione))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModifica)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonRimuovi)
                    .addComponent(jButtonNuova))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCercaPerCodice)
                        .addGap(77, 77, 77)
                        .addComponent(jButtonSeleziona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCerca)
                            .addComponent(jTextFieldInserisciCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        automa.next(new ModificaEvent());
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCercaActionPerformed
        automa.next(new RicercaEvent());
    }//GEN-LAST:event_jButtonCercaActionPerformed

    private void jButtonSelezionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelezionaActionPerformed
        automa.next(new SelezionaEvent());
    }//GEN-LAST:event_jButtonSelezionaActionPerformed

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        automa.next(new RimuoviEvent());
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        automa.next(new ConfermaEvent());
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    private void jButtonNuovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuovaActionPerformed
        automa.next(new NuovaEvent());
    }//GEN-LAST:event_jButtonNuovaActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        automa.next(new AnnullaEvent());

    }//GEN-LAST:event_jButtonAnnullaActionPerformed

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
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Column1;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonCerca;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonNuova;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonSeleziona;
    private javax.swing.JLabel jLabelCercaPerCodice;
    private javax.swing.JLabel jLabelCodice;
    private javax.swing.JLabel jLabelDescrizione;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldInserisciCodice;
    // End of variables declaration//GEN-END:variables

    @Override
    public void entraStatoRicerca() {
        //inizio form
        jButtonModifica.setVisible(false);
        jButtonConferma.setVisible(false);
        jButtonAnnulla.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonNuova.setVisible(true);
        jLabelCodice.setVisible(false);
        jLabelDescrizione.setVisible(false);
        //fine form
        jButtonCerca.setEnabled(true);
        jButtonSeleziona.setVisible(false);
        Column1.setVisible(true);
        jTable1.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
    }

    @Override
    public void entraStatoAdd() {
        jButtonModifica.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonNuova.setVisible(false);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        //fine form
        jButtonCerca.setEnabled(false);
        jButtonSeleziona.setVisible(false);
        Column1.setVisible(true);
        jTable1.setVisible(false);
    }

    @Override
    public void entraStatoVisualizza() {
        jButtonModifica.setVisible(false);
        jButtonConferma.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonRimuovi.setVisible(false);
        jButtonNuova.setVisible(false);
        jLabelCodice.setVisible(false);
        jLabelDescrizione.setVisible(false);
        //fine form
        jButtonCerca.setEnabled(true);
        jButtonSeleziona.setVisible(false);
        Column1.setVisible(true);
        jTable1.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
    }

    @Override
    public void entraStatoModifica() {
        //inizio form
        jButtonModifica.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonNuova.setVisible(false);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        //fine form
        jButtonCerca.setVisible(false);

    }

    @Override
    public void entraStatoRimuovi() {
        jButtonModifica.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonNuova.setVisible(false);
        jLabelCodice.setEnabled(false);
        jLabelDescrizione.setEnabled(false);
        jButtonCerca.setVisible(false);

    }

    @Override
    public void stampaMessaggio(String msg) {
    }

   

   
}
