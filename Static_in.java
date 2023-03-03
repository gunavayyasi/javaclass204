class Static_out
{
	static int x;
	static int y;
	public void add(int a,int b)
	{x=a+b;
	y=x+b;
	}//add
}
class Static_in
{
	public static void main(String[] args) 
	{
		Static_out s=new Static_out();
		Static_out s1=new Static_out();
		int a=2;
	    s.add(a,(a+1));
		s1.add(5,a);
		System.out.println(s.x+" "+s.y);
	}
}
