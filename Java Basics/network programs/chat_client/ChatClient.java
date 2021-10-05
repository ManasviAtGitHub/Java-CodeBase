/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author manasvi
 */
public class ChatClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("Client started running...");
        System.out.println("Started chatting with server..");
        
        Socket soc = new Socket("localhost",9990);
 
        DataInputStream input = new DataInputStream(soc.getInputStream());
        DataOutputStream output = new DataOutputStream(soc.getOutputStream());

        
        Scanner sc = new Scanner(System.in);
 
        String str1="",str2="";
        while(!str1.equals("stop")){
        
            str2 = sc.nextLine();
            output.writeUTF(str2);
            str1 = input.readUTF();
            System.out.println("Server : "+str1);
            
        }
        
        input.close();
        output.close();        
        
        
        
    }
    
}
