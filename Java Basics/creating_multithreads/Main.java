/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creating_multithreads;

/**
 *
 * @author Administrator
 */
class Child1 implements Runnable {
//    10 20 30

    public void run() {
        System.out.println("Hello Child1 Thread");

        for (int i = 10; i < 40; i = i + 10) {

            try {
                Thread.sleep(500);
                System.out.println("Child 1 : " + i);

            } catch (InterruptedException ex) {

            }
        }
        System.out.println("Goodbye Child1 Thread");
    }

}

class Child2 implements Runnable {
//    100 200 300

    public void run() {
        System.out.println("Hello Child2 Thread");

        for (int i = 100; i < 400; i = i + 100) {

            try {
                Thread.sleep(500);
                System.out.println("Child 2 : " + i);

            } catch (InterruptedException ex) {

            }
        }
        System.out.println("Goodbye Child2 Thread");
    }

}

class Child3 implements Runnable {

//    1000 2000 3000
    public void run() {
        System.out.println("Hello Child3 Thread");

        for (int i = 1000; i < 4000; i = i + 1000) {

            try {
                Thread.sleep(500);
                System.out.println("Child 3 : " + i);

            } catch (InterruptedException ex) {

            }
        }
        System.out.println("Goodbye Child3 Thread");
    }

}

class Child4 implements Runnable {

//    10000 20000 30000  
    
        public void run() {
        System.out.println("Hello Child4 Thread");

        for (int i = 10000; i < 40000; i = i + 10000) {

            try {
                Thread.sleep(500);
                System.out.println("Child 4 : " + i);

            } catch (InterruptedException ex) {

            }
        }
        System.out.println("Goodbye Child4 Thread");
    }

    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Child3 c3 = new Child3();
        Child4 c4 = new Child4();
        
        
        
        
        
        Thread t1 = new Thread(new Child1());
        Thread t2 = new Thread(new Child2());
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        
    }

}
