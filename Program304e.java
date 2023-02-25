import java.util.*;
class Program304e
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the 1st number a:");
		a=sc.nextInt();
			System.out.println("Enter the 2nd number b:");
			b=sc.nextInt();
		a=(a*b)/(b=a);
				System.out.println("Numbers After swapping a: "+a+" and b: "+b);
	}
}