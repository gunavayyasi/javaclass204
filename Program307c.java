import java.util.*;
class  Program307c
{
	static double areaSquare(double side)
	{
		return side*side;}
		public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			double side;
			System.out.println("Enter the side of the Square:");
			side=sc.nextDouble();
			
			System.out.println("area of the Square is "+areaSquare(side));
	}
}