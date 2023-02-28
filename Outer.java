class  Outer
{
	static int a=30;
	static class Inner
	{
		static void msg()
		{
			System.out.println("The data is "+a);
		}//msg()
	}//Inner
public static void main(String[] args)
	{
	Outer.Inner.msg();
	//ob.msg();
}//main
}//Outer