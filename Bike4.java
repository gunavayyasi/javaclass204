class Bike4 //Runtime Error
{
	final int speedLimit=90;
	void run(){
	speedLimit=200;
	System.out.println(speedLimit);
	}
	public static void main(String[] args) 
	{
		Bike2 b=new Bike2();
		b.run();
	}
}
