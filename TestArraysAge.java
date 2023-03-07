import java.util.*;
class  TestArraysAge
{
	public static void main(String[] args) 
	{
		int below18=0,in18and60=0,above60=0;
		int n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter required array elements:\n");
		n=sc.nextInt();
		int arr[]=new int[n];
		 System.out.println("Enter age \n");
		for (int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for (int j=0;j<arr.length;j++)
		{
			if (arr[j]<18){
				below18=below18+1;}
				else if (arr[j]>=18 && arr[j]<=59)
				{
					in18and60=in18and60+1;
				}
				else
			{
				above60=above60+1;
				}
		}
		System.out.println("Below 18 Numbers:"+below18);
        System.out.println("Between 18and59 Numbers:"+in18and60);
		System.out.println("Above 60 Numbers:"+above60);
	}
}

