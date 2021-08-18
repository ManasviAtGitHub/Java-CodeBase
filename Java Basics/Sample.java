class Sample{
    int x = 10; // global
    int y = 20;
    void method1(){
        int i = 10; // local to method1
        int x = 100; //local
        y = x + i; //100+10 =110
        System.out.println("In method 1");
        System.out.println("i "+i); //10
        System.out.println("x "+x); //100
        System.out.println("y "+y); //110
        // 11 <=10 false
        for(int i=1;i<=10;i++){
        }
        System.out.println("i "+i);
    }
    void method2(){
        // System.out.println("i "+i);
        System.out.println("In method 2");
        System.out.println("x "+x); //10
        System.out.println("y "+y); // 110
    }

    public static void main(String []args){
        Sample obj = new Sample();
        obj.method2();
        obj.method1();
        // obj.method2();
    }
}