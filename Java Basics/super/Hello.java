class World
{
    World()  //1st
    {
        // first thing is still super(), since we don't call any constructor
	    System.out.println("Hello world from empty world constructor");
    }
    World(String name) //2nd
    {
        this();
        System.out.println(name+" world from parameterized world constructor");
    }
}
class Hello extends World
{
    Hello()//3rd
    {
        // super("Hello");

        // super();
        System.out.println("Hello from empty constructor");
    }
    
    public static void main(String []args)
    {
	    Hello obj = new Hello();
    }
}