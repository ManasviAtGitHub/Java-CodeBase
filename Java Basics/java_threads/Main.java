/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manasvi
 */
class NewThread implements Runnable {

    Thread t;
    NewThread(){
    
        t =  new Thread(this,"Demo Thread");
        
        
        System.out.println("Child thread: "+t);
    }
    
    
    
    public void run() {

        try {
        for (int i = 0; i < 5; i++) {   
            System.out.println("Child Thread: "+i);
            Thread.sleep(500);
        }
        }catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        
        System.out.println("Exiting child thread");

    }

}
class NewThread2 extends Thread {

    
    NewThread2(){
    
       
        super("Demo 2 Thread");
        
        System.out.println("Child thread: "+this);
    }
    
    
    
    public void run() {

        try {
        for (int i = 0; i < 5; i++) {   
            System.out.println("Child Thread: "+i);
            Thread.sleep(500);
        }
        }catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        
        System.out.println("Exiting child thread");

    }

}

class NewThread3 implements Runnable {

    Thread t;
    String name;
    NewThread3(String name){
    
        this.name = name;
        t =  new Thread(this,name);
        
        
        System.out.println("New thread: "+t);
    }
    
    
    
    public void run() {

        try {
        for (int i = 0; i < 5; i++) {   
            System.out.println(this.name+" : "+i);
            Thread.sleep(500);
        }
        }catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        
        System.out.println(this.name+" Exiting");

    }

}




public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

//        Thread t = Thread.currentThread();
//        System.out.println("Current thread: " + t);
//        t.setName("My Thread");
//        System.out.println("After renaming: " + t);
//
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println(i);
//            Thread.sleep(2000);
//
//        }
        
        
//        NewThread nt = new NewThread();
        NewThread2 nt2 = new NewThread2();
//        nt2.start();
        
        NewThread3 one = new NewThread3("A");
        NewThread3 two = new NewThread3("B");
        NewThread3 three = new NewThread3("C");
        one.t.start();
        two.t.start();
        three.t.start();
        
        
        

//        nt.t.start();
        
        for (int i = 0; i < 5; i++) {

            System.out.println("Main Thread : "+i);
            Thread.sleep(1000);

        }

        
        
//        tt.start();
    }

}
