/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producer_consumer_problem;

/**
 *
 * @author Administrator
 */

class Q{
    
    int n;
    synchronized int get(){
        System.out.println("Got: "+n);
        return n;
    }
    synchronized void put(int n){
        this.n=n;
        System.out.println("Put: "+n);
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
            q.put(i++); // put(0)  i++ => i= 1
            
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
        t = new Thread(this, "Consumer");
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


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Q shared_q = new Q();
//        
        Producer p = new Producer(shared_q);
        Consumer c = new Consumer(shared_q);
        
        p.t.start();
        c.t.start();
        
        
        
    }
    
}
