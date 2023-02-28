class Static
{
	static void myStatic(){
		System.out.println("Static method without creating object");
}  
public void mypublic()
	{
	System.out.println("Public method can be called by using object");
	}
	public static void main(String[] args) 
	{
		myStatic();
		Static s=new Static();
		s.mypublic();
	}
}

		