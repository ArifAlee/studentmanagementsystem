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

import java.net.*;
import java.io.*;
import student.management.system.*;




public class Client {
    
    
   public void client() {
       
        try
        {
            Socket socket = new Socket("localhost",9999);
            
            PrintStream pr = new PrintStream(socket.getOutputStream());
            
            System.out.print("Enter Something : ");
          
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);
            
            String temp = ed.readLine();            
            
            pr.println(temp);
        
            BufferedReader gt = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String tm = gt.readLine();
            System.out.print(tm);
            
        }
        catch(Exception ex)
        {
            
        }
    }
}
