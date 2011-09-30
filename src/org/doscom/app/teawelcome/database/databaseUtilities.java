/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doscom.app.teawelcome.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author badak
 */
public class databaseUtilities {

    public static Connection connection;

    public static Connection getConnection(){
        try{
            Class.forName(koneksi.driver);
            connection=DriverManager.getConnection(koneksi.url,koneksi.username,koneksi.password);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }

    
}
