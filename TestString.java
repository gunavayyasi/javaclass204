import java.util.*;
class TestString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Character:");
		String s=sc.next();
		System.out.println("Enter the 2nd Character:");
		String s2=sc.next();
		System.out.println("Enter the 3rd Character:");
		String s3=sc.next();
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		System.out.println(s3.compareTo(s));
	}
}
