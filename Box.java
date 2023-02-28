class Box
{
double width;
double height;
double depth;
}  
class Boxdemo
{
	public static void main(String[] args) 
	{
		Box b=new Box();
		double w,h,d,vol;
		w=10;
		h=15;
		d=20;
		vol=b.w*b.h*b.d;
		System.out.println(vol);

