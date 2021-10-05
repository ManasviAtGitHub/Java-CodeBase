/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_side;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author manasvi
 */
public class ServerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
 
            // Creating an object of ServerSocket class
            // in the main() method  for socket connection
            ServerSocket s = new ServerSocket(6666);
            System.out.println("Server is running ");
            
            
            // Establishing a connection
            Socket soc = s.accept();
 
            // Invoking input stream via getInputStream()
            // method by creating DataInputStream class
            // object
            
            
            
            DataInputStream dis
                = new DataInputStream(soc.getInputStream());
 
            String str = dis.readUTF();
 
            // Display the string on the console
            System.out.println("Message from client " + str);
 
            
            // method to release memory resources
            s.close();
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
 
            // Display the exception on the console
            System.out.println(e);
        }        
        
        
        
        
    }
    
}
