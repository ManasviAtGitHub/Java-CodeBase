/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wait_notifyAll;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manasvi
 */

class Q {

    int n;
    boolean flag = false; 

    synchronized int get() {
        while (!flag) {

            try {
                wait();

            }catch(InterruptedException e){}
            
            
        }

        
        System.out.println("Got: " + n);
        System.out.println(Thread.currentThread().getName());
        flag=false;
        notify();
        
        
        return n;
    }

    synchronized void put(int n) {
        
        while(flag){
            try {
                wait();

            }catch(InterruptedException e){}
                   
        }
        
        this.n = n;
        flag=true;
        System.out.println("Put: " + n);
        
        notify();
//        notifyAll();
    }
}
class Producer implements Runnable{
    
    Q q;
    Thread t;
    Producer(Q q){
        this.q = q;
        t = new Thread(this, "Producer");
    }
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}

class Consumer implements Runnable{
    
    Q q;
    Thread t;
    Consumer(Q q){
        this.q = q;
        t = new Thread(this);
    }
    public void run(){
        while(true){
            q.get();
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        
        }
    }

}

//class Bank{
//
//    int savings =0;
//    int bal = 5000;
//    synchronized void updateBalance(int amount, boolean state){
//        
//        
//        if(state){
//            
////            try {
////            Thread.sleep(1000);
////            
////            
////            } catch (InterruptedException ex) {
////            }
////          
//            
//            bal = bal+amount;
//            notify();
//        }else{
//            
//            bal = bal-amount;
//        }
//
//        
//        if(bal>5000){
//        
//            savings += bal%5000;
//            try {
//                wait();
//                
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//    }
//
//}


//class A implements Runnable{
//
////    int bal = 5000;
//    int amount;
//    boolean state;
//    Thread tobj;
//    Bank bk;
//    A(Bank bk,int amount, boolean state){
//    
//        
//       
//        this.bk = bk;
//        tobj = new Thread(this);
//        this.amount = amount;
//        this.state = state;
//    }
//    
//    
//    
//    public void run(){
//    
//        bk.updateBalance(amount,state);
//    }
//
//}




public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        Bank obj = new Bank();
//        
//        A food = new A(obj,2000,true);
//        
//        A clothes = new A(obj,500,false);
//        
//        A bonus = new A(obj,1000,false);
//        
//        food.tobj.start();
//        clothes.tobj.start();
//        bonus.tobj.start();
//        
//        
//        food.tobj.join();
//        clothes.tobj.join();
//        bonus.tobj.join();
//        
//        System.out.println(obj.bal);
        
        
                
        
        
        
        
        
        Q q = new Q();
        
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        Consumer c1 = new Consumer(q);
        
        
        p.t.start();
        c.t.start();
        c.t.setName("Consumer 1");
        
        c1.t.start();
        c1.t.setName("Consumer 2");
//        System.out.println("Stop ");

    }
    
}
