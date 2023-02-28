class Box
{
double w;
double h;
double d;
}  
class Boxdemo
{
	public static void main(String[] args) 
	{
		Box b=new Box();
		double vol;
		b.w=10;
		b.h=15;
		b.d=20;
		vol=b.w*b.h*b.d;
		System.out.print(vol);
	}
}
