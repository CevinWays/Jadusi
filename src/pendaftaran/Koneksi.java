/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author cevin
 */
public class Koneksi {
    private static Connection conn;

    public static Connection connDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/db_judul"; //url database
            String user = "root"; //user database
            String pass = ""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Koneksi gagal "+e.getMessage());//Catching error and tampilkan pesan error
        }
        return conn;
    }
        }
