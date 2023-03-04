import java.util.*;
class Testing
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
      double x1,y1,x2,y2,x3,y3;
		System.out.println("Enter the Coordinates of Point P: ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
	System.out.println("Enter the Coordinates of Point Q: ");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		System.out.println("Enter the Coordinates of Point R: ");
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		Point2 p=new Point2(x1,y1);
		Point2 q=new Point2(x2,y2);
		Point2 r=new Point2(x3,y3);
		double a=p.distance_Point2(q);
		double b=q.distance_Point2(r);
		double c=p.distance_Point2(r);
		double peri=a+b+c;
		double s=peri/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println(area);
	}

}
