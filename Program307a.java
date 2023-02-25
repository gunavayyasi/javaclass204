import java.util.*;
class  Program307a
{
	static double areaTriangle(double radius)
	{
		return 2*Math.PI*radius;}
		public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			double radius;
			System.out.println("Enter the radius of the circle:");
			radius=sc.nextDouble();
			System.out.println("Perimeter of the Circle is "+areaTriangle(radius));
	}
}