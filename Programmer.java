class Employee
{
	Float salary=40000f;
}
class Programmer extends Employee
{
	Float bonus=10000f;
	public static void main(String []args)
	{
		Programmer p=new Programmer();
		System.out.println("The salary of Programmer is  "+p.salary);
System.out.println("The bonus of Programmer is  "+p.bonus);
}
}