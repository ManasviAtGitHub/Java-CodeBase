package client_side;

import java.io.DataOutputStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manasvi
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Try block to check if exception occurs
        try {
 
            // Creating Socket class object and
            // initializing Socket
            Socket soc = new Socket("localhost", 6666);
 
            
            DataOutputStream d = new DataOutputStream(
                soc.getOutputStream());
 
            
            // Message to be displayed
            d.writeUTF("Hello Java Networking !");
 
            // Flushing out internal buffers,
            // optimizing for better performance
            d.flush();
 
            // Closing the connections
 
            // Closing DataOutputStream
            d.close();
            // Closing socket
            soc.close();
        }
 
        // Catch block to handle exceptions
        catch (Exception e) {
 
            // Print the exception on the console
            System.out.println(e);
        }
        
        
        
    }
    
}
