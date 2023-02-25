import java.util.*;
class  Program307b
{
	static double areaRectangle(double length,double breadth)
	{
		return length*breadth;}
		public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			double length;
			System.out.println("Enter the length of the rectangle:");
			length=sc.nextDouble();
			double breadth;
			System.out.println("Enter the breadth of the rectangle:");
			breadth=sc.nextDouble();
			System.out.println("area of the Rectangle is "+areaRectangle(length,breadth));
	}
}