import java.util.*;
class Factorial 
{
	static int n;
	public static void set(int n1)
	{
		n=n1;}
		public static int get()
	{return n;}
		public static  int multi()
	{int res=1;
		while(n>=0)
		{
			if (n==0)
			{return res;}
		else
			{res=n*res;}
			n--;
		}//while
		return n;
		}//multi
		public static  int prod(int n)
	  {int p=1;
while (n>0)
{p=p*(n%10);
n=n/10;
}//while
return p;
}//prod
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
	 int n,res;
	 System.out.print("Enter the Number:\n");
	 n=sc.nextInt();
	 set(n);
	int x=get();
	 res=multi();
	 int c=prod(n);
	 if (n<0)
		{System.out.print("Invalid Number");}
	 else
		 {System.out.println("The Factorial of "+x+" is "+res);}
	 System.out.println("The Product of "+x+" is "+c);
	}
}
