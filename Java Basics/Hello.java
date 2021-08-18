class Hello{
    //global scope
    void hello()
    {
        System.out.println("Hello");

    }
    void world(){
        System.out.println("World");
        return;
    }
    int number(){

        return 8;
    }

    void scopes()
    {   // everything in class is accessible here
        // but not other way around

      
        int k,p,q;
        for(int i=0; i<10 i++)
        {
            // everything in class and scopes() is accessible here
            // but not other way around
            
            int j = 25;

            if(i%2==0){
                int i =24;
                // everything in class , scopes() and for loop is accessible here
                // but not other way around
                if(i+1%5==0){
                 // everything in class,scopes(), for loop, if(i%2) is accessible here
                 // but not other way around

                 int xyz=100;
                 i+=10;
                }
            }
        }

    }

    public static void main(String[] args){

        Hello obj = new Hello();
        obj.hello();
        obj.world();
        int i = obj.number();
        System.out.println(i);
     
    


    }
}