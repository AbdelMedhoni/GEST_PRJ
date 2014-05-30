/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gest_prj;

import java.sql.*;

/**
 *
 * @author Abdrahman
 */
public class methodes {
     public static Connection connect;
    public Statement ste ;
    public ResultSet rs;
    private java.sql.Statement st;
    private PreparedStatement pt;
    /*conecter = ca marche bien*/
    public void connecter ()
    {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class trouvé");
        }catch(ClassNotFoundException ex){System.out.println("kadaliik probliiim");}
        try{
        String url = "jdbc:sqlserver://Abdrahman-PC:1433;databaseName=BD_STAGE;integratedSecurity=true";
        System.out.println("connection en cours");
        connect  = DriverManager.getConnection(url);
        System.out.println("connection établie");
        
        }catch(SQLException ex){
            System.out.println("probliiim a 3shiri");
        }
    }
    public void main (String []args) {
    methodes m = new methodes();
    m.connecter();
    }
}
