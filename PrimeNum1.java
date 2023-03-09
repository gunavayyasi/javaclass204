import java.util.*;
class Prime1
{
	private int num;
	public void set(int num)
	{
		this.num=num;
	}
	public int get()
	{
	return this.num;
	}
	public boolean checkPrime()
	{
	if (this.num==1 || this.num==2)
		return true;
		for (int i=2;i<this.num;i++)
		{
			if (this.num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	}
	class PrimeNum1
	{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a Number:");
		int size=sc.nextInt();
		int[] numList=new int[size];
		int[] numPrime=new int[size];
		System.out.println("Enter"+size+" of No's");
		for (int i=0;i<size;i++)
		{numList[i]=sc.nextInt();
		}
		Prime1 p=new Prime1();
		for (int i=0;i<size;i++)
		{
			p.set(numList[i]);
		if (p.checkPrime())
		{
			numPrime[i]=p.get();
			count++;
		}
		else
			{
		    numPrime[i]=0;
		}
		}
		for (int i=0;i<size;i++)
		{
			if (numPrime[i]!=0)
				System.out.print("\n"+numPrime[i]);
		} 
		System.out.print("\n Total Prime numbers input arrays is "+count);
		
	}
	}
