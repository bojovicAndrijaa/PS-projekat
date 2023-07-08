/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.Controller;
import domain.DestinacijaVoznje;
import domain.Masinovodja;
import domain.Mesto;
import domain.Voz;
import domain.Voznja;
import domain.VrstaVoza;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.db.impl.RepositoryMasinovodja;
import server.Server;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
          new Server().startServer();
        
    }
}
