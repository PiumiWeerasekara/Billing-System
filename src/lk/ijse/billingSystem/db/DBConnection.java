/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author DEll
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
        Properties dbProperties=new Properties();
        File file=new File("Settings/MysqlSettings.Properties");
        FileReader dbFileReader=new FileReader(file);
        dbProperties.load(dbFileReader);
        
        String ip=dbProperties.getProperty("ip");
        String port=dbProperties.getProperty("port");
        String database=dbProperties.getProperty("database");
        String username=dbProperties.getProperty("username");
        String password=dbProperties.getProperty("password");
        
        String url="jdbc:mysql://"+ip+":"+port+"/"+database;
        
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection(url, username, password);
    }
    public static DBConnection getInstance() throws ClassNotFoundException, IOException, FileNotFoundException, SQLException{
        if (dbConnection==null) {
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
