class Book 
{
	String name;
	int price;
	Author auther;
	Book(String n,int p, Author auther)
	{
		this.name=n;
		this.price=p;
		this.auther=auther;
	}
	public static void main(String[] args) 
	{
		Author auther=new Author("John",42,"India");
		Book b=new Book("Java for Beginners",800,auther);
		System.out.println("Book Name: "+b.name);
		System.out.println("Book price: "+b.price);
       System.out.println("-----------Author Details----------");
	   System.out.println("Author name: "+b.auther.authorName);
	   System.out.println("Author age: "+b.auther.age);
	   System.out.println("Author place: "+b.auther.place);
	}}