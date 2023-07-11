/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author User
 */
public class DestinacijaVoznje implements GenericEntity{
    private Voznja voznja;
    private int redniBroj;
    private Mesto mesto;

    public DestinacijaVoznje() {
    }

    public DestinacijaVoznje(Voznja voznja, int redniBroj, Mesto mesto) {
        this.voznja = voznja;
        this.redniBroj = redniBroj;
        this.mesto = mesto;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Voznja getVoznja() {
        return voznja;
    }

    public void setVoznja(Voznja voznja) {
        this.voznja = voznja;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    @Override
    public String toString() {
        return "DestinacijaVoznje{" + "voznja=" + voznja + ", redniBroj=" + redniBroj + ", mesto=" + mesto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.voznja);
        hash = 71 * hash + this.redniBroj;
        hash = 71 * hash + Objects.hashCode(this.mesto);
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
        final DestinacijaVoznje other = (DestinacijaVoznje) obj;
        if (this.redniBroj != other.redniBroj) {
            return false;
        }
        if (!Objects.equals(this.voznja, other.voznja)) {
            return false;
        }
        return Objects.equals(this.mesto, other.mesto);
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
