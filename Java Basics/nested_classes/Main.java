/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_classes;

/**
 *
 * @author manasvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // this the only way to create static classes
    static class A{
    
        void print(){
            System.out.println("Hello from Static Inner class non static method");
        }
        
        static void println(){
            System.out.println("Hello from Static Inner class static method");
        }
        
    }
    
    void nest(){
    
        
        
        class Inner{
        
            //anything static won't be allowed
            void inner_print(){
                System.out.println("Hello from Local Inner class");
            }
            
        }
        Inner in = new Inner();
        in.inner_print();
        
    }
    
    
    
    class InnerClass{
 
        void inner_print(){
            System.out.println("Hello from Member Inner class");
        }
    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        A.println();
        A obj =new A();
        obj.print();
        
        Main mobj = new Main();
        mobj.nest();
        
        
        InnerClass in = mobj.new InnerClass();        
        in.inner_print();
        
        Thread t = new Thread(){
        
            public void run(){                
                System.out.println("Running thread using annonymous inner class");           
            }           
        };
        
        t.start();
        
        
    }
    
}
