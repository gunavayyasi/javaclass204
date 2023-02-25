import java.util.*;
class Program302
{
	public static int isEven(int a)
	{return (a & 1);}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if (isEven(n)==0)
         	System.out.println("Even\n");
		else
				System.out.println("Odd\n");
	}
}

		