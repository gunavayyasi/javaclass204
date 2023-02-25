import java.util.*;
class  Program307
{
	static double areaTriangle(double radius)
	{
		return Math.PI*radius*radius;}
		public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			double radius;
			System.out.println("Enter the radius of the circle:");
			radius=sc.nextDouble();
			System.out.println("Area of the Circle is "+areaTriangle(radius));
	}
}