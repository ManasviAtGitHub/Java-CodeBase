public class SimpleBill {

    int value;
    String particular;
    static int total = 0;


    static void printBillItems(SimpleBill bill){

        System.out.println(bill.particular+" : "+bill.value);

    }

    static void addToTotal(int amount){

        //total+=amount;
        total = total + amount;
    }
    



    public static void main(String args[]){

        SimpleBill p1 = new SimpleBill();
        p1.particular="Balloons";
        p1.value = 100;
        printBillItems(p1);
        addToTotal(p1.value);

        SimpleBill p2 = new SimpleBill();
        p2.particular="Cake";
        p2.value = 700;
        printBillItems(p2);
        addToTotal(p2.value);

        SimpleBill p3 = new SimpleBill();
        p3.particular="Candles";
        p3.value = 50;
        printBillItems(p3);
        addToTotal(p3.value);

        System.out.println("Total : "+total);

     
    }
}
