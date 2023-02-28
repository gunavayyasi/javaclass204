import java.util.*;
class  Areatri1
{ 
	static double areaTri(double base,double height)
	{double t;
	 t=(1.0/2.0)*base*height;
	 return t;} 
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