class Mydate
{
	public int day;
	public int month;
	public int year;
}
class Test1
{
	public static void main(String[] args) 
	{
		Mydate d=new Mydate();
		d.day=05;
		d.month=05;
		d.year=2002;
		System.out.println(d.day+"-"+d.month+"-"+d.year);
	}
}