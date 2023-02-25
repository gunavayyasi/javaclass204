import java.util.*;
class  Program305
{
	static void displayDay(int day_no)
	{
		String s=new String();
		switch (day_no)
		{
		case 0: s="Sunday";break;
		case 1: s="Monday";break;
		case 2: s="Tuesday";break;
		case 3: s="Wednesday";break;
		case 4: s="Thursday";break;
		case 5: s="Friday";break;
		case 6: s="Saturday";break;
		default: s="Invalid Number";break;
		}
		System.out.println("The day is "+s);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
int display_no=sc.nextInt();
displayDay(display_no);
	}
	}