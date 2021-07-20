public class ArrayMultiples{
    int []arrOfMultiples(int num,int length){
        int arr[] = new int[length];
        for(int i=0;i<length;i++){
            arr[i]= num*(i+1);
        }
        return arr;        
    }
    public static void main(String args[]){
        ArrayMultiples obj = new ArrayMultiples();
        
        int array[] = obj.arrOfMultiples(7,5);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}

