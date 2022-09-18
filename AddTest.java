package methodOverloading;


class Add{
	int a;
	int b;
	
	
	public int add(int a ,int b)
	{
		int c=a+b;
		System.out.println("the sum of two numbers is" );
		return c;
	}
	public int add(int a ,int b,int c)
	{
		int d=a+b+c;
		System.out.println("the sum of three numbers is I" );
		return d;
	}
	public void add(int a ,int b ,float c)
	{
		float d=a+b+c;
		System.out.println("the sum of two numbers is F"+d );

	}
	public float add(float a ,int b)
	{
		float c=a+b;
		System.out.println("the sum of two numbers is IF" );
		return c;
	}
	public static void main(String[]args)
	{
		System.out.println("string args");
	}
	public static void main(int[]args)
	{
		System.out.println("int args");
	}
	public static void main(int[]args ,int[]arg)
	{
		
	}
	
}


















public class AddTest {

	public static void
	main(String[] args) {
		
		Add a = new Add();
		int []ar = new int[5];
		System.out.println(a.add(2, 3));
		System.out.println(a.add(3.0f, 2));
		a.add(3, 4, 5);
		System.out.println(a.add(5, 3, 100));
		a.main(ar);
		a.main(args);
		

	}

}
