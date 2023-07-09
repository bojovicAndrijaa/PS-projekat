/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author User
 */
public class Voz implements Serializable {
    
    private Long vozID;
    private String nazivVoza;
    private int brojSedista;
    private Date godinaProizvodnje;
    private VrstaVoza vrstaVozaID;
    

    public Voz() {
    }

    public Voz(Long vozID, String nazivVoza, int brojSedista, Date godinaProizvodnje, VrstaVoza vrstaVozaID) {
        this.vozID = vozID;
        this.nazivVoza = nazivVoza;
        this.brojSedista = brojSedista;
        this.godinaProizvodnje = godinaProizvodnje;
        this.vrstaVozaID = vrstaVozaID;
    }

    public VrstaVoza getVrstaVozaID() {
        return vrstaVozaID;
    }

    public void setVrstaVozaID(VrstaVoza vrstaVozaID) {
        this.vrstaVozaID = vrstaVozaID;
    }

    public Long getVozID() {
        return vozID;
    }

    public void setVozID(Long vozID) {
        this.vozID = vozID;
    }

    public String getNazivVoza() {
        return nazivVoza;
    }

    public void setNazivVoza(String nazivVoza) {
        this.nazivVoza = nazivVoza;
    }

    public int getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(int brojSedista) {
        this.brojSedista = brojSedista;
    }

    public Date getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(Date godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    @Override
    public String toString() {
        return  vozID + " "+ nazivVoza;
    }
 
    
    
}
