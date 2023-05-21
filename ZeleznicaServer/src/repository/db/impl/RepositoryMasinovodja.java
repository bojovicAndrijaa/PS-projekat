/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Masinovodja;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author User
 */
public class RepositoryMasinovodja implements DbRepository<Masinovodja>{

    @Override
    public List<Masinovodja> getAll(Masinovodja param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(Masinovodja masinovodja) throws Exception {
        
        String sql = "INSERT INTO Masinovodja VALUES (?,?,?,?,?)";
        Connection conn = DbConnectionFactory.getInstance().getConnection();
        
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setLong(1, masinovodja.getMasinovodjaID());
        ps.setString(2, masinovodja.getIme());
        ps.setString(3, masinovodja.getPrezime());
        ps.setDate(4, new java.sql.Date(masinovodja.getDatumRodjenja().getTime()));
        ps.setInt(5, masinovodja.getRadniStaz());    
        ps.executeUpdate();
        ps.close();
        
        
    }

    @Override
    public void edit(Masinovodja masinovodja) throws Exception {
        String sql = "UPDATE masinovodja SET RadniStaz = ? WHERE MasinovodjaID = ?";
        
        Connection conn = DbConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, masinovodja.getRadniStaz());
        ps.setLong(2, masinovodja.getMasinovodjaID());
        ps.executeUpdate();
        ps.close();
        
    }

    @Override
    public void delete(Masinovodja param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Masinovodja> getAll() {
        
        try {
            String sql = "SELECT * FROM masinovodja";
           List<Masinovodja> masinovodje = new ArrayList<>();
           Connection connection = DbConnectionFactory.getInstance().getConnection();
           
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Masinovodja masinovodja = new Masinovodja();
                masinovodja.setMasinovodjaID(rs.getLong("MasinovodjaID"));
                masinovodja.setIme(rs.getString("Ime"));
                masinovodja.setPrezime(rs.getString("Prezime"));
                masinovodja.setDatumRodjenja(rs.getDate("DatumRodjenja"));
                masinovodja.setRadniStaz(rs.getInt("RadniStaz"));
                masinovodje.add(masinovodja);
            }
            rs.close();
            statement.close();
            return masinovodje;
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
                
    }
    
}
