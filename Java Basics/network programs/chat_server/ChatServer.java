/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_server;

import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author manasvi
 */
public class ChatServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket ss = new ServerSocket(9990);
        System.out.println("Server started running...");
        Socket soc = ss.accept();
        
        DataInputStream input = new DataInputStream(soc.getInputStream());
        DataOutputStream output = new DataOutputStream(soc.getOutputStream());

        Scanner sc = new Scanner(System.in);
 
        String str1="",str2="";
        while(!str1.equals("stop")){
        
            str1 = input.readUTF();
            System.out.println("Client : "+str1);
            str2 = sc.nextLine();
            output.writeUTF(str2);
            
        }
        
        input.close();
        output.close();

        
    }
    
}
