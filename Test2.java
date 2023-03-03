class Mydate
{
	private int day;
	public int month;
	public int year;
public int getDay()
	{return day;
}//getday
public void setDay(int d)
	{day=d;
}//getday
}
class Test2
{
	public static void main(String[] args) 
	{
		Mydate d=new Mydate();
        d.setDay(05);
		d.month=05;
		d.year=2002;
		System.out.println(d.getDay()+"-"+d.month+"-"+d.year);
	}//main
}//test