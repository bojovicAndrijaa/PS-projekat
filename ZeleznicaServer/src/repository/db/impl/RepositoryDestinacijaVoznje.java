/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import java.sql.*;
import domain.DestinacijaVoznje;
import domain.Mesto;
import domain.Voznja;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author User
 */
public class RepositoryDestinacijaVoznje implements DbRepository<DestinacijaVoznje>{

    @Override
    public List<DestinacijaVoznje> getAll(DestinacijaVoznje param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(DestinacijaVoznje param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void edit(DestinacijaVoznje param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(DestinacijaVoznje param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DestinacijaVoznje> getAll() {
        
        try {
            String sql = "SELECT * FROM destinacijaVoznje";
            List<DestinacijaVoznje> destinacije = new ArrayList<>();
            
            Connection conn = DbConnectionFactory.getInstance().getConnection();
            
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                DestinacijaVoznje destinacija = new DestinacijaVoznje();
                destinacija.setRedniBroj(rs.getInt("RedniBroj"));
                destinacija.setVoznja(getVoznjaForId(rs.getLong("VoznjaID")));
                destinacija.setMesto(getMestoForID(rs.getLong("PostanskiBroj")));
                destinacije.add(destinacija);
            }
            rs.close();
            s.close();
            return destinacije;
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
            
    }

    private Mesto getMestoForID(long id) {
        RepositoryMesto repMesto = new RepositoryMesto();
        List<Mesto> mesta = repMesto.getAll();
        for (Mesto mesto : mesta) {
            if(mesto.getPostanskiBroj().equals(id)){
                return mesto;
            }
  
        }
            return null;
    }
    private Voznja getVoznjaForId(Long id){
        RepositoryVoznja repVoznja = new RepositoryVoznja();
        List<Voznja> voznje = repVoznja.getAll();
        for (Voznja voznja : voznje) {
            if( voznja.getVoznjaID().equals(id)){
                return voznja;
            }
        }
        return null;
    }
}
