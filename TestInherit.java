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
	class TestInherit
	{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.bark();
		d.eat();
	}
}
