import java.util.*;
class  Student
{
	int rollno;
	String name;
	static String college="ITS";
	Student(int r,String n)
	{
		name=n;
		rollno=r;}
		void display()
	{
     System.out.println("Rollno: "+rollno+"\nName: "+name+"\nCollege: "+college);
	}
}
class Student4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int r=sc.nextInt();
		Student s1=new Student(r,s);
	Student.college="MTCA";
	s1.display();
	
}
}
