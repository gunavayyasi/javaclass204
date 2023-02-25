import java.util.*;
public class Oddeven
{
	static boolean isEven(int n)
	{
		return((n/2)*2==n); 
	}
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the number:");
n=sc.nextInt();
if(isEven(n))
	{
	System.out.println("Even\n");
	System.out.println(n+" is an even number");
	}
	else
	{
		System.out.println("Odd\n");
		System.out.println(n+" is an Odd number");
	}
}
}
