import java.util.*;
class  Student
{
	int rollno;
	String name;
	float fee;
	static String college="ITS";
	Student(int rollno,String name,float fee)
	{
		this.name=name;
		this.rollno=rollno;
		this.fee=fee;}
		void display()
	{
     System.out.println("Rollno: "+rollno+"\nName: "+name+"\nFee: "+fee+"\nCollege: "+college);
	}
}
class Student4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name of the Student: ");
		String s=sc.next();
		 System.out.print("Enter the Rollno: ");
		int r=sc.nextInt();
        System.out.print("Enter the Fee: ");
        float f=sc.nextFloat();
		Student s1=new Student(r,s,f);
	Student.college="MTCA";
	s1.display();
	
}
}
