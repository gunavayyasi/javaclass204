import java.util.*;
class Sumn
{
	private int n;
public void set(int n)
	{this.n=n;
}//set
public int get()
	{
	return n;
    }//get
public int digit()
{
	int sum=0;
	while(n>0)
	{sum=sum+n%10;
   n=n/10;
		}//while
		return sum;
}//digit
}//sumn
class SumDigits
{
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	int n1;
	System.out.print("Enter the Digit: ");
	n1=sc.nextInt();
	Sumn s=new Sumn();
	s.set(n1);
	int res=s.digit();
	int x=s.get();
      System.out.println("The sum of Given Digits " is "+res);
		}//main
}//sum