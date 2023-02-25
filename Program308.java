import java.util.*;
class  Program308
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		if (a>b && a>c)
		{
			System.out.println("The larger number is "+a);
		}
	else if (b>a && b>c)
		{
			System.out.println("The larger number is "+b);
		}
		else if (c>b && c>a)
		{
			System.out.println("The larger number is "+c);
		}
		else
			System.out.println("Both are Equal");
	}
}