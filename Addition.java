import java.util.*;
class  Addition
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		b=sc.nextInt();
		int difference=(a-b);
		int product=(a*b);
		int sum=(a+b);
	    System.out.println("The sum of "+a+" and "+b+" is "+sum);
		System.out.println("The Difference of "+a+" and "+b+" is "+difference);
		if (a>b)
		{
			System.out.println(a+" is Larger number");
		}
		else if (a<b)
		{
			System.out.println(a+" is Smaller number");
		}
		else if (b>a)
		{
           System.out.println(b+" is larger number");
		}
       if (b<a)
		{
			System.out.println(b+" is Smaller number");
		}
		else
		{
			System.out.println("Both Numbers are Equal");
		}
	}
}
