/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pbo_unangw;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class Koneksi2 {
    public static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException{
        if(mysqlkonek == null){
            try{
                String DB = "jdbc:mysql://localhost:3306/db_nilai_pbo";
                String user = "root";
                String pass = "uhn10071999";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
                System.out.println("Berhasil");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"GAGAL" +e.getMessage());
            }
        }
        return mysqlkonek;
    }
    
}
