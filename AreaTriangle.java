import java.util.*;
class  AreaTriangle
{ 

	static double areaTri(double base,double height)
	{  float c=1/2f;
		return (c)*base*height;} 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double base,height,area;
		System.out.println("Enter the Base of the Triangle:\n");
		base=sc.nextDouble();
		System.out.println("Enter the Height of the Triangle:\n");
           height=sc.nextDouble();
		   System.out.println("Area of the Triangle is "+areaTri(base,height));
	}
}