import java.util.*;
class Leng
{
	private int n;
public void set(int n)
	{this.n=n;
}//set
public int get()
	{
	return n;
    }//get
public int length()
{
	if (n<0) n=-n;
	if (n==0)
		return 1;
	int len=0;
	while(n>0)
	{
		n=n/10;
		len++;
		}//while
		return len;
}//digit
}
class Length
{
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	int n1;
	System.out.print("Enter the Digit: ");
	n1=sc.nextInt();
	Leng l=new Leng();
	l.set(n1);
	int res=l.length();
	int x=l.get();
      System.out.println("The Length of Given Digits  is "+res);
		}//main
}//sum