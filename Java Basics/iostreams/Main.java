/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manasvi
 */
public class Main implements Serializable {

    /**
     * @param args the command line arguments
     */
    String value;
    int key;

    Main(int key, String value) {

        this.value = value;
        this.key = key;

    }

    static void file_IO_bytestream() {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            in = new FileInputStream("input.txt");

            out = new FileOutputStream("F:\\Examples\\JavaSamples\\output1.txt");
//         out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (Exception e) {

        }

    }

    static void file_IO_charstream() {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input.txt");
            out = new FileWriter("c_output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            out.close();
        } catch (Exception e) {

        }

    }

    static void file_serialization_objectstream() {

        try {

            Main emp1 = new Main(20110, "John");
            Main emp2 = new Main(22110, "Jerry");
            Main emp3 = new Main(20120, "Sam");
            FileOutputStream fout = new FileOutputStream("F:\\Examples\\JavaSamples\\dataoutput.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp1);
            out.writeObject(emp2);
            out.writeObject(emp3);
            out.flush();
            out.close();
            System.out.println("Serialization and Deserialization is been successfully executed");

        } catch (IOException ex) {

        }

    }

    static void file_deserialization_objectstream() {

        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\Examples\\JavaSamples\\dataoutput.txt"));
            Main e1 = (Main) in.readObject();
            Main e2 = (Main) in.readObject();
            Main e3 = (Main) in.readObject();
            System.out.println(e1.key + " " + e1.value);
            System.out.println(e2.key + " " + e2.value);
            System.out.println(e3.key + " " + e3.value);

        } catch (Exception ex) {

            System.out.println("Key");
            ex.printStackTrace();

        }

    }


    
    static void readFromRandomAccessFile(String file, int position){
        String record = null;
        
        try{
        
            RandomAccessFile store = new RandomAccessFile(file,"rw");
            store.seek(position);
            
            record = store.readUTF();
            
            System.out.println(record);
            store.close();
        
        }catch(Exception e){
        
        }
        
    }
    
    static void writeToRandomAccessFile(String file, int position){
        
        String record = "Hi!!!, lets see if this works";
        try {
            RandomAccessFile store = new RandomAccessFile(file,"rw");
            store.seek(position);
            
            store.writeUTF(record);
            
            store.close();
        } catch (Exception ex) {
            
        }
    
    }
    
    
    
    

    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

//        file_IO_bytestream();
//        file_IO_charstream();
//        file_serialization_objectstream();
//        file_deserialization_objectstream();
        writeToRandomAccessFile("random_file.txt",10);
        readFromRandomAccessFile("random_file.txt",10);
        




    }

}
