/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Masinovodja {
    private Long masinovodjaID;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private int radniStaz;

    public Masinovodja() {
    }

    public Masinovodja(Long masinovodjaID, String ime, String prezime, Date datumRodjenja, int radniStaz) {
        this.masinovodjaID = masinovodjaID;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.radniStaz = radniStaz;
    }
   
    public Long getMasinovodjaID() {
        return masinovodjaID;
    }

    public void setMasinovodjaID(Long masinovodjaID) {
        this.masinovodjaID = masinovodjaID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public int getRadniStaz() {
        return radniStaz;
    }

    public void setRadniStaz(int radniStaz) {
        this.radniStaz = radniStaz;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Masinovodja other = (Masinovodja) obj;
        if (this.radniStaz != other.radniStaz) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        if (!Objects.equals(this.masinovodjaID, other.masinovodjaID)) {
            return false;
        }
        return Objects.equals(this.datumRodjenja, other.datumRodjenja);
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
}
