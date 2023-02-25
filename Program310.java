import java.util.*;
class  Program310
{
	public static void main(String[] args)
	{
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		max=(a>b &&a>c)?a:(b>a &&b>c)?b:(c>a &&c>b)?c:a;
		{
			System.out.println("The larger number is "+max);
		}
	}
}
	