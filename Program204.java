import java.util.*;
class  Program204
{
	public static boolean isEven(int n)
		{
		if (n%2==0)
			{return true;}
			else
			{return false;
			}
		}

		public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter the Number");
			n=sc.nextInt();
			if (isEven(n))
			{
              System.out.println("Even\n");
			     System.out.println(n+" is an Even Number");
			}
			else
				   System.out.println("Odd\n");
			System.out.println(n+"is an Odd number");
	}
}