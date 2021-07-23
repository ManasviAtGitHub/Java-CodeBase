
class NameClass{

    void printName(String str){
        System.out.println("Your Name is : "+str);
    }
}


public class Main{

    public static void main(String []arg){
        
        // int []arg
        //arg[4];

        // Name obj = new Name();
        // obj.printName("Rohan");

        NameClass obj1 = new NameClass();
        obj1.printName("Rohan");
    }
}