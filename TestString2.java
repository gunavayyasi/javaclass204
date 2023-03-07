import java.util.*;
class TestString2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Name:");
		String s=sc.next();
		System.out.println("Enter the 2nd Name:");
		String s2=sc.next();
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
	}
}
