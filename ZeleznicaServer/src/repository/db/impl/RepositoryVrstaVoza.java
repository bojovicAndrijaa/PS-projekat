/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.VrstaVoza;
import java.sql.Connection;
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
public class RepositoryVrstaVoza implements DbRepository<VrstaVoza>{

    @Override
    public List<VrstaVoza> getAll(VrstaVoza param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(VrstaVoza param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void edit(VrstaVoza param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(VrstaVoza param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<VrstaVoza> getAll() {
        try {
            String sql = "select * from vrstavoza";
            List<VrstaVoza> vrste = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                VrstaVoza vrsta = new VrstaVoza();
                vrsta.setNazivVrste(rs.getString("NazivVrste"));
                vrsta.setVrstaID(rs.getLong("VrstaVozaID"));
               
                vrste.add(vrsta);
            }
            rs.close();
            statement.close();
            return vrste;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    
}
