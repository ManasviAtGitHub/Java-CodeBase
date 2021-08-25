class A
{
    String name = "A"; 
    void start()
    {   
        this.name = "Z";
        System.out.println("We are in class A and the name is "+this.name);
    }
}
class B extends A
{
    String name = "B";
    void start()
    {
        super.name = "B";
	    super.start();
	    System.out.println("We are in class B and the name is "+this.name);
    }

    public static void main(String []args)
    {
        A objA = new A();
	    B objB = new B();
	    objA.start();
	    objB.start();
    }
}