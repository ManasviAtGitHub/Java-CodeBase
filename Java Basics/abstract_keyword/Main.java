/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_keyword;

/**
 *
 * @author manasvi
 */
interface Key{
    
    void print();

}
abstract class Word implements Key{

   
    Word(){
        System.out.println("Calling Word Constructor");
    }
    
    abstract void call();
    
    void callMethod(){
   
       System.out.println("Calling method in abstract class");
   }
   
//    public void print(){
//        System.out.println("Abstact Print method overridden");
//    }
}

public class Main extends Word {
    
    public void print(){
//        super.print();
        System.out.println("Print method overridden");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Abstract");
        Main obj = new Main();
        obj.callMethod();
        obj.print();
        obj.call();
        
//        Word obj = new Word();
    }

    @Override
    void call() {
        
        System.out.println("Abstract call method");
    }
    
}
