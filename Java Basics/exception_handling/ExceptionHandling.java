/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author manasvi
 */
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

    public static void main(String[] args) {
        // TODO code application logic here

//        ex0();
//        ex1();
//        ex2();
        ex3(2);

    }

}
