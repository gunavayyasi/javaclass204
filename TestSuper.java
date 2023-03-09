class Animal 
{
	void eat()
	{
		System.out.println("eating...");
	}//eat
}//animal
	class Dog extends Animal
	{
		void eat(){System.out.println("eating bread...");}
		void bark()
		{System.out.println("barking...");}//bark
		void work(){
		super.eat();
		bark();
		}
	}//dog
	class TestSuper
	{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.bark();
		d.work();
	}
}
