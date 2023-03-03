class Mydate
{
	private int day;
	private int month;
	private int year;
public int getDay()
	{return day;
}//getday
public void setDay(int d)
	{day=d;
}//setday
public int getMonth()
	{return month;
}//getmonth
public void setMonth(int m)
	{month=m;
}//setmonth
public int getyear()
	{return year;
}//getyear
public void setyear(int y)
	{year=y;
}//setyear
}
class Test4
{
	public static void main(String[] args) 
	{
		Mydate d=new Mydate();
        d.setDay(05);
		d.setMonth(05);
		d.setyear(2002);
		System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.getyear());
	}//main
}//test