class Animal 
{
	Animal(){
	System.out.println("Animal is created");
	}
}//animal
	class Dog extends Animal
	{
		Dog(){
		System.out.println("Dog is created");
		}
		}
	class TestSuper2
	{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
	}
}
