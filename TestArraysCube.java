import java.util.*;
class  TestArraysCube
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of\n");
		int n=sc.nextInt();
		int cube[]=new int[n];
		int arr[]=new int[n];
		  System.out.println("Cube of Numbers:");
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();}
		for (int j=0;j<arr.length;j++)
		{
			cube[j]=arr[j]*arr[j]*arr[j];
		System.out.println(cube[j]);
		}
       
}}

