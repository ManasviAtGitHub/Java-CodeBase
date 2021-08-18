class HelloStatic{
    static int var = 10;		
    int xyz = 10;	    
    
    void add10()
    {
        
	var = var + 10;
	xyz = xyz + 10;
    System.out.println("var "+var);
    System.out.println("xyz "+xyz);
	//print var
	//print xyz	
    }
    static void increment()
    {
        static int temp = 100;
	    var = var + 10;
        System.out.println("In increment method");
        System.out.println("var "+var);
    
	// print var
    }


    public static void main(String []args){
        HelloStatic obj1 = new HelloStatic();
        increment(); // same idea
        HelloStatic.increment();// same idea
        obj1.add10();

        
        
        // xyz = xyz+10;
        // add10();

    }
}