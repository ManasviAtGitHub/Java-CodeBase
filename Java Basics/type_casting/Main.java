/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type_casting;

/**
 *
 * @author manasvi
 */

class A{

}
class B extends A{

}

public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    void WideningTypecasting(){
//    byte<<short<<int<<long<<float<<double
//     8<<  16<<   32<<  64<<  32<<   64
        
        byte num1 =127;
        short num2 =num1;
        int num3 = num2;
        long num4 = num3;
        float num5 = num4;
        double num6 = num5;
        
//        float num7 = num6;

    }
    // also called upcasting
    void WideningTypecasting_Objects(){
        A obj1 = new A();
        B obj2 = new B();
        
        obj1 = obj2; // implicit typecasting
        
//        obj2 = (B) obj1; // explicit typecasting 
    
    }
    
    void NarrowingTypecasting(){
        byte num1 =127;
        short num2 =num1;
        int num3 = num2;
        long num4 = num3;
        float num5 = num4;
        double num6 = num5;
        
        
        float num7 = (float)num6;
        int num8 = (int)num7;
        
        float c1 = 66.0f;
        int c2 = (int)c1;
        
        char c3 = (char)c2;
        
    }
    
    // also called downcasting
    void NarrowingTypecasting_Objects(){
        A obj1 = new B();
        B obj2 = (B)obj1;         
//        obj2 = (B) obj1; // explicit typecasting 
    }
    
    //autoboxing and unboxing (Wrapper Types)
    void autoboxing(){
        
        boolean b1 = true;
        Boolean b2 = b1;
        
        char c1 = 'c';
        Character c2 = c1;
        
        float f1 = 45.21f;
        Float f2 =f1;
        
        double d1 = 45643.46564;
        Double d2 = d1;
        
        int i1 = 42;
        Integer i2 = i1;        
        
        long l1 = 46789;
        Long l2 = l1;
        
        long l3=l1; //unboxing
        
//        Integer i = (int)f1;
        
//        String s = "42";
//        Integer istr = Integer.parseInt(s);
        

        
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
