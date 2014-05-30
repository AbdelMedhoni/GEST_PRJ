/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gest_prj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Abdrahman
 */
public class Project_tools {
      public String generate(int length)
{
	    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // Tu supprimes les lettres dont tu ne veux pas
	    String pass = "";
	    for(int x=0;x<length;x++)
	    {
	       int i = (int)Math.floor(Math.random() * 62); // Si tu supprimes des lettres tu diminues ce nb
	       pass += chars.charAt(i);
	    }
	    System.out.println(pass);
	    return pass;
}
public void connect_db()  {            

          try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              
              System.out.println("class trouvé");
              
              String url = "jdbc:sqlserver://localhost:1433;databaseName=BD_STAGE;integratedSecurity=true";
              
              Connection connect  = DriverManager.getConnection(url);
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(Project_tools.class.getName()).log(Level.SEVERE, null, ex);
          }

        }
            public static void main (String []args) {
            Project_tools p = new Project_tools();
            p.connect_db();
                
                
                                                    }



                }

    
   
   

