/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wait_notify;

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
    }
}

class Producer implements Runnable {

    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}

class Consumer implements Runnable {

    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
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
        Q q = new Q();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

    }

}



