/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author User
 */
public class DbConnectionFactory {
    
    private Connection connection;
    private static DbConnectionFactory instance;

    private DbConnectionFactory() {
    }

    public static DbConnectionFactory getInstance() {
        if (instance == null) {
            instance = new DbConnectionFactory();
        }
        return instance;
    }

    public Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            Properties properties = new Properties();
            properties.load(new FileInputStream("config/dbconfig.properties"));
            String url = properties.getProperty("url");
            String user = properties.getProperty("username");
            String pass = properties.getProperty("password");
//            String url="jdbc:mysql://localhost:3306/projekat";
//            String user="root";
//            String pass="admin";
           
            connection = DriverManager.getConnection(url, user, pass);
            connection.setAutoCommit(false);
            System.out.println("Uspesna konekcija");

        }
        return connection;
    }
    
}
