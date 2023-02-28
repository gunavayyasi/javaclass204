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
     System.out.println("Rollno "+rollno+" "+name+" "+college);
	}
}
class Student3
{
	public static void main(String[] args)
	{
		Student s1=new Student(111,"Siva");
	Student s2=new Student(222,"Syam");
	Student.college="MTCA";
	s1.display();
	s2.display();
}
}
