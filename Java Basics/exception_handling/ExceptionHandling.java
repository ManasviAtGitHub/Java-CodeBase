/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package exception_handling;

/**
 *
 * @author manasvi
 */


class FunnyException extends Exception {

//    FunnyException(){
//    
//    }
    private String message;
    FunnyException(String m){
    
        message = m;
    }
   public String toString(){
    
       return message;
    
   }
}
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    
    
    // exceptions
    static void ex0() {

        int d = 0;
        int a = 42 / d;

    }

    
    // try catch
    static void ex1() {

        try {

            int d = 0;
            int a = 42 / d;

        } catch (ArithmeticException e) {
//            System.out.println(e);
            System.out.println("Dividing by 0");
        }

        System.out.println("and continue ...");

    }

    //multiple catch
    
    static void ex2() {

        try {

            int arr[] = {10};

//            int b = 25/0;
            arr[1] = 25;

        } catch (ArithmeticException e) {
            System.out.println("Dividing by 0 " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound " + e);
        } catch (Exception e) {
            System.out.println("Super Class for all exceptions");
        }

    }

    //nested try catch
    
    static void ex3(int i) {

        try {
            
            if (i==1){
                i = 100/(i-i);
            }
            
            try {

                int arr[] = new int[i];
                arr[1] = 25;
                
                i = 100/(i-i);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Dividing by 0 " + e);
        }

    }
    
    
    static void ex4(){
   
        try{
            String a=null;
            String b = a+" ";
            
            throw new NullPointerException();
//            throw new ArithmeticException();
        }
        catch(NullPointerException e){
        
            System.out.println(e);
        }
    
    }
    
    static void ex5(){
        
        try{
            ex5_1();
        }
        catch(ArithmeticException e){           
           System.out.println(e);       
        }
    
    }
    
    static void ex5_1(){
    
        try{
            throw new ArithmeticException();   
        }
        catch(ArithmeticException e){
        
            System.out.println(e);
            throw e;
        }
    
    }
    
    static void ex6(){
    
        try{
          ex_6();
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e);
        }
        
    }
    
    static void ex_6() throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException{

        throw new ArithmeticException();
    
    }
    
    
    static void ex7(int i){
    
        try{
            
            if(i==1){
            
                throw new Exception();
            }        
            System.out.println("All statements in 'Try' are executed ");
        
        }
        catch(Exception e){
            
            System.out.println("We are in 'Catch'");
            System.out.println(e);
    
        } 
        finally{
        
            System.out.println("'Finally' will execute regardless of anything ");
        }
        
        
        
        
    }
    
    static void ex8() {

        try {

//            throw new FunnyException();
                throw new FunnyException("When will java lecture get over");

        } catch (FunnyException e) {

            System.out.println(e);

        }

    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here

//        ex0();
//        ex1();
//        ex2();
//        ex3(2);
//        ex4();
//        ex5();
//        ex6();
//        ex7(10);
        ex8();
        



    }

}
