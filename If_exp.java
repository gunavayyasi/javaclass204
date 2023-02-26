import java.util.*;
class If_exp
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Numbers:");
		i=sc.nextInt();
		j=sc.nextInt();
		if (j==0)
			System.out.println("Division by Error");
		else
			System.out.println("The Division of "+i+" and "+j+" is "+(i/j));
	}
}
		