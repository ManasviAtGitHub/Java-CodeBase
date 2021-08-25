class Hello
{
    String name, message;
    
    Hello(String name, String message)
    {
        this.name = name;
	    this.message = message;
    }
    void printAgain(String message)
    {
	    this.message = message;
	    System.out.println(this.message+" "+this.name);
    }
    void print()
    {
	    System.out.println(this.message);
	    this.printAgain("How are you ?");
    }
    public static void main(String []args)
    {
    	Hello obj1 = new Hello("Ram", "Hello");
    	Hello obj2 = new Hello("Roy", "Hi");
    	obj1.print();
    	obj2.print();  	
    }
}