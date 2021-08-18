class Hello{
    int a = 100, b =500;
    String name;
    Hello(String n){
        name =n;

    }
    //empty constructor 
    Hello(){

    }


    int add(int a, int b){

        return a+b;
    }
    int subtract(int a, int b){

        return a-b;
    }

    public static void main(String []args){

        Hello holdObject = new Hello(); // 1st

        Hello obj = holdObject; // 2nd

        System.out.println(obj.a);
        System.out.println(holdObject.b);

        String random = new String();
        String str = "Rohan"; // taken care of built in class

        System.out.println(str+" "+str.length());

    }
}