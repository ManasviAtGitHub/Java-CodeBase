


public class Main{

    void print(String str){//1
        System.out.println("Printing String "+str);
    }
    void print(int str){//2
        System.out.println("Printing Integer "+str);
    }
    void print(double str){//3
        System.out.println("Printing Decimal "+str);
    }
    void print(char str){//4
        System.out.println("Printing Character "+str);
    }

    void print(String name, int roll){//4
        System.out.println("Name "+name+" Roll Number "+roll);
    }
    





    public static void main(String [] args){
        Main obj = new Main();
        obj.print(78);
        obj.print('P');
        obj.print("Hello");
        obj.print(78.999999);
        obj.print("Anand",71);


    }
}