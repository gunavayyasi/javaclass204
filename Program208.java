import java.util.*;
class  Program208
{
	public static int diff(int a,int b)
	{return a-b;}
public static int product(int a,int b)
	{return a*b;}
	public static int smaller(int a,int b)
	{
		if (a<b)
		return a;
		if (b<a)
		return b;
		return 0;
		}
		public static int larger(int a,int b)
		{
			 if (a>b)
			return a;
			if (b>a)
		return b;
			return 0;
			}
			public static void main(String[] args)
		{
				int n1,n2,result;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the 1st number:");
				n1=sc.nextInt();
				System.out.println("Enter the 2nd number:");
				n2=sc.nextInt();
				result=diff(n1,n2);
				System.out.println("the Difference is "+result);
                 result=product(n1,n2);
				System.out.println("the product is "+result);
                result=smaller(n1,n2);
				System.out.println("the smaller number is "+result);
				result=larger(n1,n2);
				System.out.println("the larger number is "+result);
		}
	}





