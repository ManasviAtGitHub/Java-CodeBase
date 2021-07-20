public class Prime{
    boolean findPrime(int n){
        int flag=0;
        for(int i=1;i<n/2;i++){

            if(n%i==0){
                flag++;
            }
        }

        if(flag>1){
            return false;
        }

        return true;

    }

    public static void main(String []args){

        Prime obj= new Prime();
        int num=71;
        boolean p = obj.findPrime(num);
        if(p==true){
           boolean q = obj.findPrime(num+2);
           if(q==true){
               System.out.println("num : "+num+" is prime and +"+(num+2)+" is also prime");
           }
        }


    }
}