class SuperClass{
    int i=480;
    void xyz(){
        int i = 94500;
        System.out.println(i);
    }

}

class Overriding extends SuperClass{
    int i = 100;

    void xyz(){
        
        int i = 400;
        System.out.println(i);

    }
    public static void main(String []anand){

        Overriding obj = new Overriding();
        System.out.println(obj.i);
        obj.xyz();
           
    }

}