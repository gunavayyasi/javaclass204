import java.util.*;
class  Program306b
{
	public static void displayDay(int day_no)
	{
		String s=new String();
		if (day_no==0) s="Sunday";
		else if (day_no==1) s="Monday";
	  	else if (day_no==2) s="Tuesday";
		else if (day_no==3) s="wednesday";  
		else if (day_no==4) s="Thursday";
		else if (day_no==5) s="Friday";
		else if (day_no==6) s="Saturday";
		else s="Invalid Daynumber";
		System.out.println("The Day is "+s);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int day_no=sc.nextInt();
		displayDay(day_no);
	}
}