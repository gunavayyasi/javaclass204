class Tri
{
double base;
double height;
public Tri()
{
base=height=0;
}
public Tri(double b,double h)
	{
	base=b;
height=h;
	}
	public void area()
	{
		double area=1/2f*base*height;
	System.out.println("Area is "+area);
}
}
class Triangle
{
	public static void main(String[] args) 
	{
		Tri t1=new Tri();
	Tri t2=new Tri(4,5);
	t1.area();
	t2.area();
	}
}
		