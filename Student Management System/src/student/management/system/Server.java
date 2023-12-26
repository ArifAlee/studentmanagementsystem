/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

/**
 *
 * @author arifali
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;


        
public class Server {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public static void main(String[] args) {
        
        try(ServerSocket server = new ServerSocket(1527))
        {
            System.out.println("Server is Connected");
            Socket sock = server.accept();
            
            BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String tmp = ed.readLine();
             System.out.print("I Recieved :"+tmp);
            
             PrintStream pr = new PrintStream(sock.getOutputStream());
             String str = "Yup I got it !!";
             pr.println(str);
             
        }
      catch(Exception ex){}
    }
    
}

