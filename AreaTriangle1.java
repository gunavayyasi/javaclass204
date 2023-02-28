import java.util.*;
class  AreaTriangle1
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double base,height,area;
		System.out.println("Enter the Base of the Triangle:\n");
		base=sc.nextDouble();
		System.out.println("Enter the Height of the Triangle:\n");
           height=sc.nextDouble();
		   area=(1/2)*base*height;
		   System.out.println("Area of the Triangle is "+area);
	}
}