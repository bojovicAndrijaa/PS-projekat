/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Masinovodja;
import domain.Voznja;
import domain.Voz;
import java.util.ArrayList;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class RepositoryVoznja implements DbRepository<Voznja>{

    @Override
    public List<Voznja> getAll(Voznja param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 

    @Override
    public void add(Voznja voznja) throws Exception {
        
        String sql = "INSERT INTO voznja (VoznjaID,Trajanje,Datum,MasinovodjaID, VozID) VALUES (?,?,?,?,?)";
        
        Connection conn = DbConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setLong(1,voznja.getVoznjaID());
        ps.setInt(2, voznja.getTrajanje());
        ps.setDate(3, new java.sql.Date(voznja.getDatum().getTime()));
        ps.setLong(4, voznja.getMasinovodja().getMasinovodjaID());
        ps.setLong(5, voznja.getVoz().getVozID());
        ps.executeUpdate();
        ps.close();
        
        
    }

    @Override
    public void edit(Voznja voznja) throws Exception {
         String sql = "UPDATE voznja SET Datum= ?, Trajanje = ?, MasinovodjaID = ?, VozID =? WHERE VoznjaID = ?";
         
        Connection connection = DbConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setDate(1, new java.sql.Date(voznja.getDatum().getTime()));
        ps.setInt(2, voznja.getTrajanje());
        ps.setLong(3, voznja.getMasinovodja().getMasinovodjaID());
        ps.setLong(4, voznja.getVoz().getVozID());
        ps.setLong(5, voznja.getVoznjaID());
        ps.executeUpdate();
        ps.close();
                
    }

    @Override
    public void delete(Voznja param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Voznja> getAll() {
        
        try {
            String sql = "select * from voznja";
            List<Voznja> voznje = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Voznja voznja = new Voznja();
                voznja.setTrajanje(rs.getInt("Trajanje"));
                voznja.setDatum(new java.util.Date(rs.getDate("Datum").getTime()));
                voznja.setMasinovodja(getMasinovodjaForId(rs.getLong("MasinovodjaID")));
                voznja.setVoz(getVozForID(rs.getLong("VozID")));
                voznje.add(voznja);
            }
            rs.close();
            statement.close();
            return voznje;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
        Masinovodja getMasinovodjaForId(Long id){
        RepositoryMasinovodja repMasinovodja = new RepositoryMasinovodja();
        List<Masinovodja> masinovodje = repMasinovodja.getAll();
        for(Masinovodja masinovodja : masinovodje){
            if(masinovodja.getMasinovodjaID().equals(id)){
                return masinovodja;
            }
        }
        return null;
    }
    Voz getVozForID(Long id){
        RepositoryVoz repVoz = new RepositoryVoz();
        List<Voz> vozovi = repVoz.getAll();
        for(Voz voz : vozovi){
            if(voz.getVozID().equals(id)){
                return voz;
            }
        }
        return null;
    }
//    Voznja getVoznjaForId(Long id){
//        RepositoryVoznja repVoznja = new RepositoryVoznja();
//        List<Voznja> voznje = repVoznja.getAll();
//        for (Voznja voznja : voznje) {
//            if(voznja.getVoznjaID().equals(id)){
//                return voznja;
//            }
//        }
//        return null;
//    }

    
}
