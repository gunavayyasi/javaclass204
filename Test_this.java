import java.util.*;
class Mydate
{
	private int day;
	private int month;
	private int year;
public int getDay()
	{return day;
}//getday
public void setDay(int day)
	{this.day=day;
}//setday
public int getMonth()
	{return month;
}//getmonth
public void setMonth(int month)
	{this.month=month;
}//setmonth
public int getyear()
	{return year;
}//getyear
public void setyear(int year)
	{this.year=year;
}//setyear
}
class Test_this
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
	int t,m,y;
    System.out.print("Enter the Day:\n");
	t=sc.nextInt();
	 System.out.print("Enter the Month:\n");
	m=sc.nextInt();
	 System.out.print("Enter the Year:\n");
	y=sc.nextInt();
		Mydate d=new Mydate();
        d.setDay(t);
		d.setMonth(m);
		d.setyear(y);
		System.out.println("\n"+d.getDay()+"-"+d.getMonth()+"-"+d.getyear());
	}//main
}//test