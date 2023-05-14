/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import domain.*;
import java.util.Date;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Mesto m = new Mesto(1100l,"Beograd");
        Masinovodja mas = new Masinovodja(1l, "Andrija", "Bojovic", new Date(1, 1, 2000), 1);
        Voz v = new Voz(1l, "Cira", 0, new Date(1,1,2000), new VrstaVoza(1l,"cira"));
        System.out.println(v);
        
    }
}
