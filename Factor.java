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
		int i,count=0;
		System.out.println("\nFactors of "+num+" are :");
       for (i=1;i<=num;i++)
       {
		   if (num%i==0)
		   {
			   count=count+1;
			   System.out.println(i+" ");
		   }
       }
	   System.out.println("\nTotal Factors of "+num+" are "+count);
	}
}
