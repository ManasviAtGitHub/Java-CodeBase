public class Bulb {
    boolean state;
    //Scope of state is limited to Bulb class

    void getStatus(Bulb p1, Bulb p2){

        //Scope of p1 and p2 is limited to getStatus

        if (p1.state == true || p2.state == true){
            System.out.println("Bulb 3 is ON");
        }else{
            System.out.println("Bulb 3 is OFF");
        }   

    }



    public static void main(String args[]){

        Bulb B1 = new Bulb();
        B1.state = false;
        Bulb B2 = new Bulb();
        B2.state = true;

        Bulb B3 = new Bulb();
        B3.getStatus(B1, B2);

    }

}
