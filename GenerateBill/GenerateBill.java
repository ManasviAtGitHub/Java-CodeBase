public class GenerateBill {

    static void print(String str){
        System.out.println(str);
    }
    static void billAmount(float amount){
        print("Your bill : "+amount);
    }
    static void tipRate(float rate){
        print("Tip rate is %: "+rate);
    }

    static void tipValue(float value){
        print("Tip is : "+value);
    }

    static void totalBillAmount(float amount, float rate){
        billAmount(amount);
        tipRate(rate);
        float tipVal = amount * (rate/100);
        tipValue(tipVal);
        float totalBill = amount + tipVal;
        print("Total amount is "+totalBill);
 

    }



    public static void main(String args[]){

        totalBillAmount(150, 10);

    }
}
