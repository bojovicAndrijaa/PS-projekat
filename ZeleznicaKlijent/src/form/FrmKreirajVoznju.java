/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.DestinacijaVoznje;
import domain.Masinovodja;
import domain.Mesto;
import domain.Voz;
import domain.Voznja;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrmKreirajVoznju extends javax.swing.JDialog {

    /**
     * Creates new form FrmKreirajVoznju
     */
    public FrmKreirajVoznju(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Kreiraj vožnju");
        setLocationRelativeTo(null);
        pripremi();
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
        lblMasinovodja = new javax.swing.JLabel();
        lblVoz = new javax.swing.JLabel();
        lblMestoDolaska = new javax.swing.JLabel();
        cbMasinovodja = new javax.swing.JComboBox<>();
        cbMestoDolaska = new javax.swing.JComboBox<>();
        cbVoz = new javax.swing.JComboBox<>();
        btnDodajVoznju = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtVoznjaID = new javax.swing.JTextField();
        jTxtTrajanje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtYear = new javax.swing.JTextField();
        jTxtMonth = new javax.swing.JTextField();
        jTxtDay = new javax.swing.JTextField();
        jTxtHours = new javax.swing.JTextField();
        jTxtMinutes = new javax.swing.JTextField();
        jTxtSec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vožnja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N

        lblMasinovodja.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblMasinovodja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMasinovodja.setText("Mašinovođa");

        lblVoz.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblVoz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoz.setText("Voz");

        lblMestoDolaska.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblMestoDolaska.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMestoDolaska.setText("Mesto dolaska");

        cbVoz.setToolTipText("");

        btnDodajVoznju.setText("Dodaj voznju");
        btnDodajVoznju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajVoznjuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VoznjaID");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Trajanje");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Datum (yyyy-MM-dd)");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Vreme (HH:MM:SS)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("-");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(cbVoz, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMasinovodja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtVoznjaID)
                            .addComponent(jTxtTrajanje)
                            .addComponent(cbMestoDolaska, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTxtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTxtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtSec, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72)))))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnDodajVoznju, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVoz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMestoDolaska, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblMasinovodja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtVoznjaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMasinovodja)
                    .addComponent(cbMasinovodja, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVoz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVoz))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMestoDolaska)
                    .addComponent(cbMestoDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnDodajVoznju)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajVoznjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajVoznjuActionPerformed
        validateInputs();
        String hh=jTxtHours.getText();
        String mm=jTxtMinutes.getText();
        String ss=jTxtSec.getText();
        String year = jTxtYear.getText();
        String month = jTxtMonth.getText();
        String day = jTxtDay.getText();
        String trajanjeS = jTxtTrajanje.getText();
        String voznjaIDS = jTxtVoznjaID.getText();
        
        int hours   = Integer.parseInt(hh); 
        int minutes = Integer.parseInt(mm); 
        int sec = Integer.parseInt(ss); 
        int yr = Integer.parseInt(year);
        int mo = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        
        
        try {
            Long.parseLong(voznjaIDS); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da kreira voznju!");
            return;
        }
        
        try{
            Integer.parseInt(trajanjeS);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da kreira voznju!");
            return;
        }
        
        Long voznjaID = Long.parseLong(voznjaIDS);
        int trajanje = Integer.parseInt(trajanjeS);
        
        LocalDateTime dateTime = LocalDateTime.of(yr, mo, d, hours, minutes, sec);
        
        Voznja voznja = new Voznja();
        voznja.setVoznjaID(voznjaID);
        voznja.setMasinovodja((Masinovodja)cbMasinovodja.getSelectedItem());
        voznja.setDatum(dateTime);
        voznja.setVoz((Voz)cbVoz.getSelectedItem());
        voznja.setTrajanje(trajanje);
        try {
            voznja = Communication.getInstance().kreirajVoznju(voznja);
            Communication.getInstance().kreirajDestinacijuVoznje(
                    new DestinacijaVoznje(voznja,0,(Mesto)cbMestoDolaska.getSelectedItem()));
            JOptionPane.showMessageDialog(this, "Sistem je uspesno kreirao voznju!");
            this.dispose();
            new FrmVoznja(new JFrame(), true).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmVoznja.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Sistem ne moze da kreira voznju!","Greska",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnDodajVoznjuActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajVoznju;
    private javax.swing.JComboBox<Object> cbMasinovodja;
    private javax.swing.JComboBox<Object> cbMestoDolaska;
    private javax.swing.JComboBox<Object> cbVoz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtDay;
    private javax.swing.JTextField jTxtHours;
    private javax.swing.JTextField jTxtMinutes;
    private javax.swing.JTextField jTxtMonth;
    private javax.swing.JTextField jTxtSec;
    private javax.swing.JTextField jTxtTrajanje;
    private javax.swing.JTextField jTxtVoznjaID;
    private javax.swing.JTextField jTxtYear;
    private javax.swing.JLabel lblMasinovodja;
    private javax.swing.JLabel lblMestoDolaska;
    private javax.swing.JLabel lblVoz;
    // End of variables declaration//GEN-END:variables

    private void validateInputs() {
        String hh=jTxtHours.getText();
        String mm=jTxtMinutes.getText();
        String ss=jTxtSec.getText();
        String year = jTxtYear.getText();
        String month = jTxtMonth.getText();
        String day = jTxtDay.getText();
        String trajanjeS = jTxtTrajanje.getText();
        String voznjaID = jTxtVoznjaID.getText();
        
        if(voznjaID == null || voznjaID.isEmpty()){
            JOptionPane.showMessageDialog(this, "Obavezno je uneti polje voznjaID");
        }
        
        if(trajanjeS == null ||trajanjeS.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Obavezno je uneti trajanje voznje");
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
        if (cbVoz.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti voz");
            return;
        }

        if (cbMasinovodja.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti masinovodju");
            return;
        }

        if (cbMestoDolaska.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Obavezno je uneti mesto dolaska");
            return;
        }
       
        
        try {
            int hours = Integer.parseInt(hh);
            int minutes = Integer.parseInt(mm);
            int secunds = Integer.parseInt(ss);
            int trajanje = Integer.parseInt(trajanjeS);
            
            
            if (hours > 24 || hours < 0 || minutes < 0 || minutes > 60 || secunds > 60 || secunds < 0) {
                JOptionPane.showMessageDialog(this, "Vreme mora biti u validnom formatu HH:[0-24], MM:[0-60], SS:[0-60]");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vreme mora biti u validnom formatu HH:[0-24], MM:[0-60], SS:[0-60]");
        }
    }

    private void pripremi() {
        try {
            List<Mesto> mesta = Communication.getInstance().ucitajListuMesta();
            for (Mesto mesto : mesta) {
                cbMestoDolaska.addItem(mesto);
            }
            List<Voz> vozovi = Communication.getInstance().ucitajListuVozova();
            for (Voz voz : vozovi) {
                cbVoz.addItem(voz);
            }
            List<Masinovodja> masinovodje = Communication.getInstance().ucitajListuMasinovodja();
            for (Masinovodja masinovodja : masinovodje) {
                cbMasinovodja.addItem(masinovodja);
            }
        } catch (Exception ex) {
            Logger.getLogger(FrmKreirajVoznju.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
