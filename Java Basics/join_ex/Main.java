/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package join_ex;

/**
 *
 * @author Administrator
 */


class Child implements Runnable{


    public void run(){
        System.out.println("Child Started");
        try {
        for (int i = 0; i < 5; i++) {   
            System.out.println("i : "+i);
            Thread.sleep(1000);
        }
        }catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        
        System.out.println("Child Exiting");
        
    }
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Child cobj=  new Child();
        Thread tobj= new Thread(cobj);
        
        tobj.start();
        
        System.out.println("Child Thread is : "+tobj.isAlive());
        
        tobj.join();
        System.out.println("Child Thread : "+tobj.isAlive());
        
        
        for (int i = 5; i < 10; i++) {   
            System.out.println("i : "+i);  
        }
        
        
        
    }
    
}
