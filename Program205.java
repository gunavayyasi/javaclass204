import java.util.*;
class  Program205
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch+" is an Alphabet");
		}
		else
		{
			System.out.println(ch+" is not an alphabet");
		}
	}
}