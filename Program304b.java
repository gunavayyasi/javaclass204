import java.util.*;
class Program304b
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter the 1st number a:");
		a=sc.nextInt();
			System.out.println("Enter the 2nd number b:");
			b=sc.nextInt();
			temp=a;
			a=b;
			b=temp;
				System.out.println("Numbers After swapping a: "+a+" and b: "+b);
	}
}