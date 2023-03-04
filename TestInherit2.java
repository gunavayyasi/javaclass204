class Animal 
{
	void eat()
	{
		System.out.println("eating...");
	}//eat
}//animal
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("barking...");
		}//bark
	}//dog
	class BabyDog extends Dog
	{
		void weep()
		{
			System.out.println("Weeping..");
		}//weep
	}//babydog
	class TestInherit2 extends BabyDog
	{
	public static void main(String[] args) 
	{
		BabyDog d=new BabyDog();
		d.bark();
		d.eat();
		d.weep();
	}//main
}//TestInherit
