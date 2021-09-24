/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creating_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
//class First implements Runnable{
//    
//    public void run(){
//        System.out.println("Hello First Thread");
//        
//        for(int i =0;i<3;i++){
//            
//            try {             
//                Thread.sleep(500);
//                System.out.println("Child Thread : "+i);
//                
//            } catch (InterruptedException ex) {
//                
//            }
//        }
//    }
//}

class Second extends Thread{
        public void run(){
        System.out.println("Hello Second Thread");
        
        for(int i =0;i<3;i++){
            
            try {             
                Thread.sleep(500);
                System.out.println("Second Child Thread : "+i);
                
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        First obj1 = new First(); 
//        
//        Thread tobj1 = new Thread(obj1);
//        tobj1.start();
//        
//        for(int i =0;i<3;i++){
//            
//            try {             
//                Thread.sleep(1000);
//                System.out.println("Parent Thread : "+i);
//                
//            } catch (InterruptedException ex) {
//                
//            }
//        }
        
        
        
        
        
        
        
//        obj1.run();
        
        
        
//        Thread tobj1 = new Thread();
//        tobj1.start();
        
        
        
        
        
        
        
        Second obj2 = new Second(); 
        
        obj2.start();
        for(int i =0;i<3;i++){
            
            try {             
                Thread.sleep(1000);
                System.out.println("Parent Thread : "+i);
                
            } catch (InterruptedException ex) {
                
            }
        }
        
        
        
//        
    
    }
    
}
