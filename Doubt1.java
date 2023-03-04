import java.util.*;
class Doubt1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float p,r,t;
		p=sc.nextFloat();
		r=sc.nextFloat();
		t=sc.nextFloat();
		float si=(p*r*t)/100;
		System.out.println("Simple Interest= "+si);
		double ci=p*(Math.pow((1+r/100),t));
       System.out.println("Compound Interest= "+ci);
	}
}