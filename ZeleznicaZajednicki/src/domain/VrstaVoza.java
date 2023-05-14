/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author User
 */
public class VrstaVoza {
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

    
    
    
}
