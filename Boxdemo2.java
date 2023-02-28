class Box
{
double width;
double height;
double depth;
public Box()
{
width=height=depth=0;
}
public Box(double w,double h,double d)
	{
	width=w;
height=h;
depth=d;
	}
	public void vol()
	{
		double vol=width*height*depth;
	System.out.println("Volume is "+vol);
}
}
class Boxdemo2
{
	public static void main(String[] args) 
	{
		Box b1=new Box();
	Box b2=new Box(10,15,20);
	b1.vol();
	b2.vol();
	}
}
		