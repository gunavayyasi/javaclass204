import java.util.*;
class Point

{
    private	double x;
	private double y;
   public double getX()
	{return this.x;
   }//getX
    public double getY()
	{return this.y;
   }//getY
	Point()
	{
		x=0;
        y=0;
	}//Point
	Point(double x1,double y1)
	{
	 x=x1;
	 y=y1;
	}//Point_agrs
	public void translate(double x_trans,double y_trans)
	{
	 x=x+x_trans;
	 y=y+y_trans;
	}//translate
}//Point
class Test_a2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2;
     
	System.out.println("Enter the coordinates x1 and y1 of a point: ");
	x1=sc.nextDouble();
	y1=sc.nextDouble();
	 Point p=new Point(x1,y1);
	System.out.println("Enter the coordinates x1 and y1 of a point: ");
	System.out.println("For Translation of a point:");
   x2=sc.nextDouble();
   y2=sc.nextDouble();
   System.out.println("Co-ordinates Points are "+p.getX()+","+p.getY());
   System.out.println("After Translation:");
   p.translate(x2,y2);
    System.out.println("Co-ordinates Points are "+p.getX()+","+p.getY());
	}//main
}//class
