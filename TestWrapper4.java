class  TestWrapper4
{
	public static void main(String[] args) 
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		//AutoBoxing
		Byte byteob=b;
		Short shortob=s;
		Integer intob=i;
		Long longob=l;
		Float floatob=f;
		Double doubleob=d;
		Character charob=c;
		Boolean boolob=b2;
		//printing Objects
		System.out.println("--Printing Objects Values--");
      System.out.println("Byte Objects: "+byteob);
	  System.out.println("Short Objects: "+shortob);
	  System.out.println("Integer Objects: "+intob);
	   System.out.println("Long Objects: "+longob);
	    System.out.println("Float Objects: "+floatob);
		 System.out.println("Double Objects: "+doubleob);
		  System.out.println("Character Objects: "+charob);
		   System.out.println("Boolean Objects: "+boolob);
		   //unboxing
		   byte bytevalue=byteob;
		   short shortvalue=shortob;
		   int intvalue=intob;
		   long longvalue=longob;
		   float floatvalue=floatob;
		   double doublevalue=doubleob;
		   char charvalue=charob;
		   boolean boolvalue=boolob;
		   //printing Primitives
		   System.out.println("--Printing Primitives--" );
		    System.out.println("byte value: "+bytevalue);
			System.out.println("short value: "+shortvalue);
			System.out.println("int value: "+intvalue);
			System.out.println("long value: "+longvalue);
			System.out.println("float value: "+floatvalue);
			System.out.println("double value: "+doublevalue);
			System.out.println("char value: "+charvalue);
			System.out.println("Boolean value: "+boolvalue);

	}
}
