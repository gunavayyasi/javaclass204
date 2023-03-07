import java.util.*;
class TestString5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Name:");
		String s=sc.next();
		System.out.println("Enter the 2nd Name:");
		String a=sc.next();
	   s=s.concat(a);
		System.out.println(s);
	}
}
