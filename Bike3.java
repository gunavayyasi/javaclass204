class Bike3 //Runtime Error
{

	final void run(){
	
	System.out.println("Running");
	}
	class Honda extends Bike3
	{
		void run(){
	  System.out.println("Running Safely");}
	public static void main(String[] args) 
	{
		Honda b=new Honda();
		b.run();
	}
}
}
