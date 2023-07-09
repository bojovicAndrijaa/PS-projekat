/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Masinovodja;
import domain.Voz;
import domain.VrstaVoza;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author User
 */
public class RepositoryVoz implements DbRepository<Voz>{
    
    @Override
    public List<Voz> getAll(Voz param) throws Exception {
        try {
            String sql="Select * from Voz WHERE VozID = ?";
            List<Voz> vozovi = new ArrayList<>();
            
            Connection conn = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, param.getVozID());
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Voz voz = new Voz();
                voz.setVozID(rs.getLong("VozID"));
                voz.setNazivVoza(rs.getString("NazivVoza"));
                voz.setBrojSedista(rs.getInt("BrojSedista"));
                voz.setGodinaProizvodnje(rs.getDate("GodinaProizvodnje"));
                voz.setVrstaVozaID(getVrstaVozaForIDVrste(rs.getLong("VrstaVoza")));
                vozovi.add(voz);
            }
            rs.close();
            ps.close();
            if(vozovi.size() != 0) return vozovi;
            return null;
            
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    public void add(Voz voz) throws Exception {
        String sql = "INSERT INTO VOZ VALUES (?,?,?,?,?)";
        
        Connection connection = DbConnectionFactory.getInstance().getConnection();
        
        PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setLong(1, voz.getVozID());
            pstatement.setString(2, voz.getNazivVoza());
            pstatement.setInt(3, voz.getBrojSedista());
            pstatement.setDate(4,new java.sql.Date(voz.getGodinaProizvodnje().getTime()));
            pstatement.setLong(5, voz.getVrstaVozaID().getVrstaID());
            pstatement.executeUpdate();
            pstatement.close();
    }

    @Override
    public void edit(Voz voz) throws Exception {
        
        String sql = "UPDATE voz Set BrojSedista = ? WHERE VozID = ?";
        
        
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setInt(1, voz.getBrojSedista());
            pstatement.setLong(2, voz.getVozID());
            pstatement.executeUpdate();
            pstatement.close();
        
    }

    @Override
    public void delete(Voz param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Voz> getAll() {
       try {
            String sql = "select * from voz";
            List<Voz> vozovi = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Voz voz = new Voz();
                voz.setVozID(rs.getLong("VozId"));
                voz.setNazivVoza(rs.getString("NazivVoza"));
                voz.setBrojSedista(rs.getInt("BrojSedista"));
                voz.setGodinaProizvodnje(rs.getDate("GodinaProizvodnje"));
                voz.setVrstaVozaID(getVrstaVozaForIDVrste(rs.getLong("VrstaVoza")));
                vozovi.add(voz);
            }
            rs.close();
            statement.close();
            return vozovi;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    
    private VrstaVoza getVrstaVozaForIDVrste(long vrstaID){
        RepositoryVrstaVoza repositoryVrstaVoza=new RepositoryVrstaVoza();
        List<VrstaVoza> vrste = repositoryVrstaVoza.getAll();
        for (VrstaVoza vrstaVoza : vrste) {
            if(vrstaVoza.getVrstaID()== vrstaID){
                return vrstaVoza;
            }
        }
        return null;
    }
     
}
