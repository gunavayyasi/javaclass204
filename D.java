class C
{
	void dispC(){
			System.out.println("Method of Class C");
	}
}
class A extends C
{
	void dispA(){
			System.out.println("Method of Class A");
	}
}
class B extends C
{
	void dispB(){
			System.out.println("Method of Class B");
	}
}
class D extends A
{
	void dispD(){
			System.out.println("Method of Class D");
	}
public static void main(String[] args) 
	{
		D ob=new D();
		ob.dispD();
		ob.dispA();
		ob.dispC();
	}
}
