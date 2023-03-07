import java.util.*;
class TestString1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s="Sachin";
		String s2="Sachin";
		String s3=new String("Sachin");
		System.out.println(s==s2);
		System.out.println(s==s3);
	}
}
