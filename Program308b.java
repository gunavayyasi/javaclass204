import java.util.*;
class  Program308b
{
	static int smaller(int a,int b,int c)
	{
		if (a<b && a<c)
		return a;
	else if (b<a && b<c)
		return b;
		else if (c<b && c<a)
		return c;
		else
			return 0;
			}
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
		System.out.println("The Smaller number is "+smaller(a,b,c));
	}
}

		