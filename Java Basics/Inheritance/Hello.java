
class Universe
{
	int y = 100;
	void addFourNumbers(int p, int q, int r, int s)
	{
		int z = p+q+r+s;
		System.out.println(z);
	}
}
class World extends Universe
{
	int a = 20;
	int b = 30;
	
	void addThreeNumbers(int a, int b, int c){
		int d = a+b+c;
		System.out.println(d);
	}    	
}
class Hello extends World
{
    // since we are inheriting from World, we will have access to
    // "some" of its variables and methods
	public static void main(String []args)
	{
	    Hello obj = new Hello();
	    int c = obj.a + obj.b;
	    //print c
	    obj.addThreeNumbers(obj.a, obj.b, c);
        int d = obj.a + obj.b + obj.y;
    	// print d
    	obj.addFourNumbers(obj.a, obj.b, c, d);
	}
}