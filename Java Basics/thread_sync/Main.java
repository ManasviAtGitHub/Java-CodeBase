package thread_sync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manasvi
 */

class Callme{
    
    void call(String msg) throws InterruptedException{
        
        System.out.print(" ["+msg);
        Thread.sleep(1000);
    
        System.out.println("]");
    }

}
class Caller implements Runnable{
    String msg;
    
    
    Callme target; // calling previous class method or logic
    
    
    Thread tobj;
    public Caller(Callme target, String s){
        
        this.target = target;
        msg=s;
        
        
        tobj=new Thread(this);
    
    }
    public void run(){
        
        try {
            
            synchronized(target){
            target.call(msg); //#221B
            }
             
        } catch (InterruptedException ex) {
            
        }
    }
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        
//        address = #221B
        Callme target = new Callme(); // shared resource
        
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Synchronized");
        Caller ob3 = new Caller(target,"World");
        
        
        ob1.tobj.start();
        ob2.tobj.start();
        ob3.tobj.start();
        
//        ob1.tobj.join();
//        ob2.tobj.join();
//        ob3.tobj.join();
        
        
        
        
    }
    
}