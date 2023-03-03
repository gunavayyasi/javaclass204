import java.util.*;
class Point2
{
	double x;
	double y;
	Point2()
	{
		x=0;
        y=0;
	}//Point2
	Point2(double x1,double y1)
	{
	 x=x1;
	 y=y1;
	}//Point2agrs
	public double distance_origin()
	{
	  double dist;
	  dist=Math.sqrt(x*x+y*y);
	  return dist;
	}//distane_origin
	public double distance_Point2(Point2 Q)
	{
	  double diff_x=x-Q.x;
	  double diff_y=y-Q.y;
	  return Math.sqrt(diff_x*diff_x+diff_y*diff_y);
	}//distance_Point2
	public void translate(double x_trans,double y_trans)
	{
	 x=x+x_trans;
	 y=y+y_trans;
	}//translate
}//Point2
class Test_a
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2,res,x3,y3;
     
	System.out.println("Enter the coordinates of x1 and y1: ");
	x1=sc.nextDouble();
	y1=sc.nextDouble();
	 Point2 p=new Point2(x1,y1);
   res= p.distance_origin();
     //res=p.translate(x1,y1);
	System.out.println("Distance of Point2 from Origin is "+res+"\n");
	System.out.println("Enter the coordinates of x2 and y2: ");
   x2=sc.nextDouble();
   y2=sc.nextDouble();
   Point2 Q=new Point2(x2,y2);
   double dis=p.distance_Point2(Q);
    System.out.println("Distance between Point2 P and Q is "+dis);
	}//main
}//class
