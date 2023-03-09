class  Amstrong100
{

public static int arms(int num)
	{
int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
	public static void main(String[] args) 
	{
     int n=1000;
	 arms(n);
	}
	}
