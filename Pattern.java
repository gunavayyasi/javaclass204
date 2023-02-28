import java.util.*;
class Pattern
{
	public static void printPattern1(char ch,int n)
	{
		for (int i=0;i<n;i++)
		{
			System.out.print(ch); }
		   	System.out.print("\n");
	}
	public static void printPattern(int n1,char ch)
	{
		for (int j=0;j<=n1;j++)
		{
			printPattern1(ch,j);
		}
	}
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n;
	char ch;
      System.out.println("Enter no.of colomumns:");
	  n=sc.nextInt();
	   System.out.println("Enter character:");
	  ch=sc.next().charAt(0);
     printPattern(n,ch);

	}
}