public class ValueReference {


    static void increment(int a, int b){

 
        a= a+100;   
        b = b+200; 

    }




    static void swap(int a, int b){

        //a = 7 , b= 10
        int temp = a;   // temp =7
        a = b;  // a =10
        b = temp; // b = 7
        //a = 10 , b= 7
    }




    int counter =0;


    void addToCounter(){

        counter++;
        System.out.println(counter);
    }



    
    static void doubleValuesOfArray(int array[], int length){

        int index = 0;
        while(index<length){

            array[index] = array[index] * 2;     
            System.out.println(index+" : "+array[index]);
            index= index+1; // index++ , index+=1;  
        }

    }


    static void simpleValuesOfArray(int array[], int length){


        array = new int[length]; // new address created
        int index = 0;
        while(index<length){

            array[index] = index;     
            System.out.println(index+" : "+array[index]);
            index= index+1; // index++ , index+=1;  
        }

    }




    public static void main(String args[]){

        int a = 7;
        int b = 10;
        // swap(a, b); // we are passing only values 7,10
        increment(a, b);
        System.out.println("a = "+a+" b = "+b);






        // int arr[] = new int[3]; //{1,2,3}
        
        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 7;

        // doubleValuesOfArray(arr, 3); // passing location

        // simpleValuesOfArray(arr,3);
        
        // for(int index=0; index<3; index++){

        //     System.out.println(index+" : "+arr[index]);
        // }
    
        // ValueReference obj1 = new ValueReference();
        
        // obj1.addToCounter();

        // ValueReference obj2 = obj1; //since we are not allocating new memory
        // obj2.addToCounter();
        

    }
}
