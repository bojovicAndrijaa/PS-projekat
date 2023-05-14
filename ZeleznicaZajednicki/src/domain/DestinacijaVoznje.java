/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author User
 */
public class DestinacijaVoznje {
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
    
    
}
