/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import domain.*;
import form.FrmLogin;
import form.FrmMain;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
       new FrmLogin(new JFrame(), true).setVisible(true);
     
    }
}
