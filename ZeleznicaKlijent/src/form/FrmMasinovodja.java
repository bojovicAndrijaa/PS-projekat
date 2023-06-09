/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Masinovodja;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import tables.MasinovodjaTableModel;

/**
 *
 * @author User
 */
public class FrmMasinovodja extends javax.swing.JDialog {

    /**
     * Creates new form FrmMasinovodja
     */
    public FrmMasinovodja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Masinovođa");
        prepareTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMasinovodje = new javax.swing.JTable();
        jBtnDodaj = new javax.swing.JButton();
        jBtnIzmeni = new javax.swing.JButton();
        jBtnPretragaMasinovodje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Pregled mašinovođa");

        jTableMasinovodje.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableMasinovodje);

        jBtnDodaj.setText("Dodaj mašinovođu");
        jBtnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDodajActionPerformed(evt);
            }
        });

        jBtnIzmeni.setText("Izmeni mašinovođu");
        jBtnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIzmeniActionPerformed(evt);
            }
        });

        jBtnPretragaMasinovodje.setText("Pretraga mašinovođe");
        jBtnPretragaMasinovodje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPretragaMasinovodjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jBtnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnPretragaMasinovodje, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDodaj)
                    .addComponent(jBtnIzmeni)
                    .addComponent(jBtnPretragaMasinovodje))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDodajActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FrmKreirajMasinovodju(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jBtnDodajActionPerformed

    private void jBtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIzmeniActionPerformed
        // TODO add your handling code here:
         this.dispose();
         new FrmIzmeniMasinovodju(new JFrame(),true).setVisible(true);
    }//GEN-LAST:event_jBtnIzmeniActionPerformed

    private void jBtnPretragaMasinovodjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPretragaMasinovodjeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FrmNadjiMasinovodju(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jBtnPretragaMasinovodjeActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDodaj;
    private javax.swing.JButton jBtnIzmeni;
    private javax.swing.JButton jBtnPretragaMasinovodje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMasinovodje;
    // End of variables declaration//GEN-END:variables

    private void prepareTable() {
        
        try {
            List<Masinovodja> masinovodje = Communication.getInstance().ucitajListuMasinovodja();
            TableModel tm = new MasinovodjaTableModel(masinovodje);
            jTableMasinovodje.setModel(tm);
        } catch (Exception ex) {
            Logger.getLogger(FrmMasinovodja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
