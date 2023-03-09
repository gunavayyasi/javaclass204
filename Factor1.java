import java.util.*;
class Factor1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("\nEnter the Number:");
		num=sc.nextInt();
		int size=(int)num/2;
		int[] fa=new int[size];
		int i,count=0;
       for (i=1;i<=num;i++)
       {
		   if (num%i==0)
		   {
			   fa[count]=i;
			   count=count+1;
			  
		   }
       }
	   System.out.println("\nTotal Factors of "+num+" are "+count);
	   for (int j=0;j<count;j++)
	   {
		   System.out.print(fa[j]+" ");
	   }
	}
}
