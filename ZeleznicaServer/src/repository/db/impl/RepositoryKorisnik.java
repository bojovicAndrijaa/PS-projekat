/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Korisnik;
import java.util.List;
import repository.db.DbRepository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import repository.db.DbConnectionFactory;

/**
 *
 * @author User
 */
public class RepositoryKorisnik implements DbRepository<Korisnik> {

    @Override
    public List<Korisnik> getAll(Korisnik param) throws Exception {
        try {
            String sql = "select * from korisnik where KorisnickoIme = '" + param.getUsername() + "' and Lozinka = '" + param.getPassword() + "'";
            List<Korisnik> users = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Korisnik korisnik = new Korisnik();
                korisnik.setUsername(rs.getString("KorisnickoIme"));
                korisnik.setPassword(rs.getString("Lozinka"));
                users.add(korisnik);
            }
            rs.close();
            statement.close();
            return users;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void add(Korisnik param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void edit(Korisnik param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Korisnik param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Korisnik> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
