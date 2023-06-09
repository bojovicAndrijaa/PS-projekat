/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Masinovodja;
import domain.Voz;
import domain.Voznja;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrmIzmeniVoznju extends javax.swing.JDialog {

    /**
     * Creates new form FrmIzmeniVoznju
     */
    public FrmIzmeniVoznju(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Izmeni vožnju");
        setLocationRelativeTo(null);
        prepareInputs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVoznja = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tbDatum = new javax.swing.JTextField();
        tbMasinovodja = new javax.swing.JTextField();
        tbVoz = new javax.swing.JTextField();
        cbVoznje = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblMasinovodja2 = new javax.swing.JLabel();
        lblVoz2 = new javax.swing.JLabel();
        cbMasinovodja2 = new javax.swing.JComboBox<>();
        cbVoz2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTxtTrajanje = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtYear = new javax.swing.JTextField();
        jTxtMonth = new javax.swing.JTextField();
        jTxtDay = new javax.swing.JTextField();
        jTxtHours = new javax.swing.JTextField();
        jTxtMinutes = new javax.swing.JTextField();
        jTxtSec = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIzmeni = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        tbVoznjaID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tbTrajanje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblVoznja.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Izmeni voznju", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Izaberi Voznju");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Datum");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Voz");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setText("Masinovodja");

        tbDatum.setEnabled(false);
        tbDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDatumActionPerformed(evt);
            }
        });

        tbMasinovodja.setEnabled(false);

        tbVoz.setEnabled(false);

        cbVoznje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVoznjeActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unesi nove podatke", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N

        lblMasinovodja2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblMasinovodja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMasinovodja2.setText("Mašinovođa");

        lblVoz2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblVoz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoz2.setText("Voz");

        cbVoz2.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Trajanje");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setText("Datum (yyyy-MM-dd)");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Vreme (HH:MM:SS)");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("-");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("-");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText(":");

        btnIzmeni.setText("Izmeni voznju");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVoz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMasinovodja2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTxtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtSec, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbMasinovodja2, javax.swing.GroupLayout.Alignment.LEADING, 0, 304, Short.MAX_VALUE)
                                .addComponent(cbVoz2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTxtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jTxtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMasinovodja2)
                    .addComponent(cbMasinovodja2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVoz2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVoz2))
                .addGap(41, 41, 41)
                .addComponent(btnIzmeni)
                .addGap(54, 54, 54))
        );

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setText("Trajanje");

        tbVoznjaID.setEnabled(false);
        tbVoznjaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbVoznjaIDActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel17.setText("VoznjaID");

        tbTrajanje.setEnabled(false);
        tbTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTrajanjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblVoznjaLayout = new javax.swing.GroupLayout(lblVoznja);
        lblVoznja.setLayout(lblVoznjaLayout);
        lblVoznjaLayout.setHorizontalGroup(
            lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblVoznjaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
            .addGroup(lblVoznjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblVoznjaLayout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblVoznjaLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbVoz, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lblVoznjaLayout.createSequentialGroup()
                                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbVoznjaID, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbVoznje, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbMasinovodja, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lblVoznjaLayout.setVerticalGroup(
            lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblVoznjaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbVoznje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbVoznjaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tbMasinovodja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblVoznjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tbVoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVoznja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVoznja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed

        validateInputs();
        String hh=jTxtHours.getText();
        String mm=jTxtMinutes.getText();
        String ss=jTxtSec.getText();
        String year = jTxtYear.getText();
        String month = jTxtMonth.getText();
        String day = jTxtDay.getText();
        String trajanjeS = jTxtTrajanje.getText();
        String voznjaIDS = tbVoznjaID.getText();
        
        int hours   = Integer.parseInt(hh); 
        int minutes = Integer.parseInt(mm); 
        int sec = Integer.parseInt(ss); 
        int yr = Integer.parseInt(year);
        int mo = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        
        int trajanje = Integer.parseInt(trajanjeS);
        
        
        Voznja voznja = (Voznja) cbVoznje.getSelectedItem();
        LocalDateTime dateTime = LocalDateTime.of(yr, mo, d, hours, minutes, sec);
        
        voznja.setMasinovodja((Masinovodja) cbMasinovodja2.getSelectedItem());
        voznja.setDatum(dateTime);
        voznja.setVoz((Voz) cbVoz2.getSelectedItem());
        voznja.setTrajanje(trajanje);

        try {

            Communication.getInstance().zapamtiVoznju(voznja);
            JOptionPane.showMessageDialog(this, "Uspesno izvrsena izmena voznje!");
            cbVoznje.removeAllItems();
            prepareInputs();
            this.dispose();
            new FrmVoznja(new JFrame(), true).setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri izmeni voznje!", "Greska", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void tbDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDatumActionPerformed

    private void cbVoznjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVoznjeActionPerformed
        Voznja voznja = (Voznja) cbVoznje.getSelectedItem();
        if (voznja != null) {
            tbVoznjaID.setText(String.valueOf(voznja.getVoznjaID()));
            tbTrajanje.setText(String.valueOf(voznja.getTrajanje()));
            tbVoz.setText(voznja.getVoz().toString());
            tbDatum.setText(voznja.getDatum().toString());
            tbMasinovodja.setText(voznja.getMasinovodja().toString());
        }

    }//GEN-LAST:event_cbVoznjeActionPerformed

    private void tbVoznjaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbVoznjaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbVoznjaIDActionPerformed

    private void tbTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTrajanjeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajVoznju;
    private javax.swing.JButton btnDodajVoznju1;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JComboBox<Object> cbMasinovodja;
    private javax.swing.JComboBox<Object> cbMasinovodja1;
    private javax.swing.JComboBox<Object> cbMasinovodja2;
    private javax.swing.JComboBox<Object> cbMestoDolaska;
    private javax.swing.JComboBox<Object> cbMestoDolaska1;
    private javax.swing.JComboBox<Object> cbVoz;
    private javax.swing.JComboBox<Object> cbVoz1;
    private javax.swing.JComboBox<Object> cbVoz2;
    private javax.swing.JComboBox<Object> cbVoznje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTxtDay;
    private javax.swing.JTextField jTxtHours;
    private javax.swing.JTextField jTxtMinutes;
    private javax.swing.JTextField jTxtMonth;
    private javax.swing.JTextField jTxtSec;
    private javax.swing.JTextField jTxtTrajanje;
    private javax.swing.JTextField jTxtYear;
    private javax.swing.JLabel lblMasinovodja;
    private javax.swing.JLabel lblMasinovodja1;
    private javax.swing.JLabel lblMasinovodja2;
    private javax.swing.JLabel lblMestoDolaska;
    private javax.swing.JLabel lblMestoDolaska1;
    private javax.swing.JLabel lblVoz;
    private javax.swing.JLabel lblVoz1;
    private javax.swing.JLabel lblVoz2;
    private javax.swing.JPanel lblVoznja;
    private javax.swing.JTextField tbDatum;
    private javax.swing.JTextField tbMasinovodja;
    private javax.swing.JTextField tbTrajanje;
    private javax.swing.JTextField tbVoz;
    private javax.swing.JTextField tbVoznjaID;
    // End of variables declaration//GEN-END:variables

    private void prepareInputs() {
        try {
            List<Voznja> voznje = Communication.getInstance().ucitajListuVoznji();
            for (Voznja voznja : voznje) {
                cbVoznje.addItem(voznja);
            }
            List<Masinovodja> masinovodje = Communication.getInstance().ucitajListuMasinovodja();
            for (Masinovodja masinovodja : masinovodje) {
                cbMasinovodja2.addItem(masinovodja);
            }
            List<Voz> vozovi = Communication.getInstance().ucitajListuVozova();
            for (Voz voz : vozovi) {
                cbVoz2.addItem(voz);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void validateInputs() {
        String hh = jTxtHours.getText();
        String mm = jTxtMinutes.getText();
        String ss = jTxtSec.getText();
        String year = jTxtYear.getText();
        String month = jTxtMonth.getText();
        String day = jTxtDay.getText();
        String trajanjeS = jTxtTrajanje.getText();

        if (trajanjeS == null || trajanjeS.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti voznju!");
            return;
        }

        if (hh.isEmpty() || mm.isEmpty() || ss.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti vreme voznje");
            return;
        }
        if (year.isEmpty() || month.isEmpty() || day.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti datum voznje");
            return;
        }
        if (cbVoz2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti voz");
            return;
        }

        if (cbMasinovodja2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti masinovodju");
            return;
        }

        try {
            int hours = Integer.parseInt(hh);
            int minutes = Integer.parseInt(mm);
            int secunds = Integer.parseInt(ss);
            int trajanje = Integer.parseInt(trajanjeS);
            int godina = Integer.parseInt(year);
            int mesec = Integer.parseInt(month);
            int dan = Integer.parseInt(day);

            if (hours > 24 || hours < 0 || minutes < 0 || minutes > 60 || secunds > 60 || secunds < 0) {
                JOptionPane.showMessageDialog(this, "Vreme mora biti u validnom formatu HH:[0-24], MM:[0-60], SS:[0-60]");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Greska prilikom parsiranja datuma/vremena");
        }

    }

}
