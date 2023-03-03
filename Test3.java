class Mydate
{
	private int day;
	private int month;
	public int year;
public int getDay()
	{return day;
}//getday
public void setDay(int d)
	{day=d;
}//setday
public int getMonth()
	{return day;
}//getmonth
public void setMonth(int m)
	{month=m;
}//setmonth
}
class Test3
{
	public static void main(String[] args) 
	{
		Mydate d=new Mydate();
        d.setDay(05);
		d.setMonth(05);
		d.year=2002;
		System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.year);
	}//main
}//test