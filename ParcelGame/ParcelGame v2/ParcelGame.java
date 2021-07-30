


class Player1{
    Player1(){

        //super Object
        System.out.println("Pranjal has the Parcel");
    }

}

class Player2 extends Player1{
    Player2(){
        //super() Player1()
        System.out.println("Joe has the Parcel");
    }

    Player2(String str){
        this();
        System.out.println(str+" has the Parcel");
    }
    
}

class Player3 extends Player2{
    Player3(){
        // super();
        // super("Kuber");
        this("Rakesh"); // Player3(String str)
        System.out.println("Risha has the Parcel");
    }
    Player3(String str){
        //super() Player2()
        super("Anisha");
        System.out.println(str+" has the Parcel");
    }

}




public class ParcelGame{

    public static void main(String args[]){

        Player3 p3Obj= new Player3();

    }
}