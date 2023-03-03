import java.util.*;
class  Product
{static int n;
public static void set(int n1)
	{	n=n1;
}//set
public static int get()
	{return n;
}//get
public static  int prod()
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
		System.out.println("Enter the Digit:\n");
		n=sc.nextInt();
		set(n);
		int x=get();
		res=prod();
		System.out.println("The product of "+x+" is "+res);
	}//main
	}//product
