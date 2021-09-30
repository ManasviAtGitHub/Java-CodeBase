/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync_bank;

/**
 *
 * @author Administrator
 */
class Bank {

    
    int bal = 5000;

    synchronized void updateBalance(int amount, boolean state) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        
        if (state) {
            bal = bal + amount;
        } else {
            bal = bal - amount;
        }

        

    }

}

class Person implements Runnable {

//    int bal = 5000;
    int amount;
    boolean state;
    Thread tobj;
    Bank bobj;
    
  
    Person(Bank bobj, int amount, boolean state) {

        
        
        tobj = new Thread(this);
        this.bobj = bobj;
        this.amount = amount;
        this.state = state;
    }

    public void run() {

        bobj.updateBalance(amount, state);
    }

}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Bank sharedobj = new Bank();
        
        Person food = new Person(sharedobj ,2000,false);
        
        Person clothes = new Person(sharedobj ,500,false);
        
        Person bonus = new Person(sharedobj ,1000,true);
        
        //when these end then continue with main thread
        food.tobj.start();
        clothes.tobj.start();
        bonus.tobj.start();
        
        
        food.tobj.join();
        clothes.tobj.join();
        bonus.tobj.join();
        
        System.out.println("Curr Bal : "+sharedobj.bal);
        
        
    }

}
