/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


/**
 *
 * @author User
 */
public class Voznja  implements GenericEntity{
    private Long voznjaID;
    private int trajanje;
    private LocalDateTime datum;
    private Masinovodja masinovodja;
    private Voz voz;
    
    public Voznja() {
    }

    public Voznja(Long voznjaID, int trajanje, LocalDateTime datum, Masinovodja masinovodja, Voz voz) {
        this.voznjaID = voznjaID;
        this.trajanje = trajanje;
        this.datum = datum;
        this.masinovodja = masinovodja;
        this.voz = voz;
    }

   

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public Long getVoznjaID() {
        return voznjaID;
    }

    public void setVoznjaID(Long voznjaID) {
        this.voznjaID = voznjaID;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    
    

    public Masinovodja getMasinovodja() {
        return masinovodja;
    }

    public void setMasinovodja(Masinovodja masinovodja) {
        this.masinovodja = masinovodja;
    }

    public Voz getVoz() {
        return voz;
    }

    public void setVoz(Voz voz) {
        this.voz = voz;
    }
    
    @Override
    public String toString() {
        return "Masinovodja: " + masinovodja.getIme()+ " " + masinovodja.getPrezime() + ", upravlja vozom: " + voz.getNazivVoza()
                + ", dana: " + datum;
    }

    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnNamesForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getInsertValues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
