import java.util.*;
class  TestArrays5
{
	public static void main(String[] args) 
	{
	int sumOdd=0;
		int n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:\n");
		n=sc.nextInt();
		int arr[]=new int[n];
         System.out.println("Enter the Digits");
		for (int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for (int j=0;j<arr.length;j++)
		{
			if (arr[j]%2!=0){
				sumOdd=sumOdd+arr[j];
		}
	}
				System.out.println("Sumof Odd numbers:"+sumOdd);
	}
}