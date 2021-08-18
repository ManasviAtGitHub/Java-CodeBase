class Demo{
    static int i = 100;
    static int j = 200;
    int k = 500;
    void printValues(){
        i = i+100;  
        j = j+i;
        k = k + 500;   
        System.out.println("i " +i);
        System.out.println("j " +j);
        System.out.println("k " +k);
    }


    public static void main(String []args){
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.printValues();
        obj2.printValues();
        
    }
}