
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


    void call() {
        
        System.out.println("Abstract call method");
    }
    
}
