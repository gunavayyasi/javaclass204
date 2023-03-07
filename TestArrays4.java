import java.util.*;
class  TestArrays4
{
	public static void main(String[] args) 
	{
		int x,n,flag=0,i=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the no.of elements you want in array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the Elements:");
		for (i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		x=sc.nextInt();
		for (i=0;i<n;i++)
		{
			if (a[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
			if (flag==1)
			{
				System.out.println("Element found at the position:"+(i+1));
			}
			else
        {
				System.out.println("Element not Found");
		}
	}
}