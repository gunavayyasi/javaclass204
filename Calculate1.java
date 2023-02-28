import java.util.*;
class Calculate1
{
	static int cube(int x)
	{
		return x*x*x;}//cube method
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
		int n;
       n=sc.nextInt();
		int result=Calculate.cube(n);
		System.out.println(result);
	}//main method
}//class