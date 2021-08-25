class HelloCon
{
    // HelloCon()
    // {
    //     this("Hello");
	//     System.out.println("HelloCon from empty constructor");
    // }
    HelloCon(String name)
    {
	    // first thing is still super(), since we don't call any constructor
	    System.out.println(name+" from parameterized constructor");
    }
    public static void main(String []args)
    {
        HelloCon obj = new HelloCon("Hello");
    }
}