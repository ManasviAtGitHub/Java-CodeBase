


class Player1{

    Player1(){

        System.out.println("Pranjal has the Parcel");
    }

}

class Player2 extends Player1{
    Player2(){

        System.out.println("Joe has the Parcel");
    }

    Player2(String str){

        System.out.println(str+" has the Parcel");
    }
    
    
}

class Player3 extends Player2{
    
    Player3(){

        super("Kuber");
        //super()
        System.out.println("Risha has the Parcel");
    }
    
}




public class ParcelGame{

    public static void main(String args[]){

        Player3 p3Obj= new Player3();

    }
}