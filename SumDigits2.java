import java.util.*;
class Sumn
{
	private int n;
public void set(int n)
	{this.n=n;
}//set
public int get()
	{
	return this.n;
    }//get
	public int reverse()
	{int sum=0;
		int n=this.n;
	while(n>0)
		{
	sum=sum*10+n%10;
	n=n/10;}//while
	return sum;
	}//reverse
public int digit()
{
	int sum=0;
	n=this.n;
	while(n>0)
	{sum=sum+(n%10);
   n=n/10;
		}//while
		return sum;
}//digit
}//sumn
class SumDigits2
{
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	int n;
	System.out.print("Enter the Digit: ");
	n=sc.nextInt();
	Sumn s=new Sumn();
	    s.set(n);
		int x=s.get();
		int c=s.reverse();
	int res=s.digit();
      System.out.println("The sum of Given Digits "+x+" is "+res+" and Reverse of digits is "+c);
		}//main
}//sum