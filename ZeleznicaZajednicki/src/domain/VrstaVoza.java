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
public class VrstaVoza implements Serializable{
    private Long vrstaID;
    private String nazivVrste;

    public VrstaVoza() {
    }

    public VrstaVoza(Long vrstaID, String nazivVrste) {
        this.vrstaID = vrstaID;
        this.nazivVrste = nazivVrste;
    }

    public Long getVrstaID() {
        return vrstaID;
    }

    public void setVrstaID(Long vrstaID) {
        this.vrstaID = vrstaID;
    }

    public String getNazivVrste() {
        return nazivVrste;
    }

    public void setNazivVrste(String nazivVrste) {
        this.nazivVrste = nazivVrste;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.vrstaID);
        hash = 83 * hash + Objects.hashCode(this.nazivVrste);
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
        final VrstaVoza other = (VrstaVoza) obj;
        if (!Objects.equals(this.nazivVrste, other.nazivVrste)) {
            return false;
        }
        return Objects.equals(this.vrstaID, other.vrstaID);
    }

    @Override
    public String toString() {
        return nazivVrste ;
    }

    
    
    
}
