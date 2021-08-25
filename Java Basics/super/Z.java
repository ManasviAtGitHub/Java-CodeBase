
class A{

    // A(){

    // }

    A(){
        this("A");
        System.out.println("A"); //2
    }
    A(String name){
      
        System.out.println("In Constructor A " + name); //1
    }

}

class Z extends A {
    Z(){
        this("Z");
        System.out.println("Z"); //4
    }
    Z(String name){
        //super
        System.out.println("In Constructor Z " + name); //3
    }
    public static void main(String []args){
        new Z();

    }
}
