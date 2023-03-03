import java.util.*;
class Sumnum
{
public static int digit(int n)
{
	int sum=0;
	while(n>0)
	{sum=sum+(n%10);
   n=n/10;
		}//while
		return sum;
}//digit
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	int n;
	System.out.print("Enter the Digit: ");
	n=sc.nextInt();
	int res=digit(n);

      System.out.println("The sum of Given Digits "+n+" is "+res);
		}//main
}//sumn