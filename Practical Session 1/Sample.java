public class Sample{

    int square(int n){

        int s = n*n;
        return s;
    }

    void squareArray(int s[]){

        for(int i=0; i<7;i++){
            s[i] = s[i] *s[i];
        }

    }


    public static void main(String []args){
        Sample obj = new Sample();
        // int arr[] = new int[7];
        // arr[0] = 5;
        // arr[1] = 10;

        int arr[] = {5,10,5,64,98,5,39};
        for(int i=0; i<7;i++){
           System.out.println(arr[i]);
        }

        obj.squareArray(arr);
        System.out.println("After Squaring .......");
        for(int i=0; i<7;i++){
           System.out.println(arr[i]);
        }
        


        // for(int i=0; i<arr.length;i++){

            
        // }





        
        // int i = 5;
        // int value_i = obj.square(i);
        // int value_j = obj.square(6);
        // int value_k = obj.square(7);

        // System.out.println("Square of "+i+" is : "+value_i);
        // System.out.println(value_j);
        // System.out.println(value_k);
    }
}