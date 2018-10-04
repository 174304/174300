package abc.org;

public class Runpoly extends Cow{
	public static void main(String args[])
	{
		Runpoly x= new Runpoly();
		x.eat();
		Animal p = new Animal();
		p.eat();
	Animal b= new Cow();
	b.eat();
	System.out.println(b.getClass());
	 Animal a = new Human();
	 a.eat();
	
	}
	 
}

class Animal
{
	void eat(){
		
		System.out.println("plants,animals");
	}
}

class Human extends Animal
{
	void eat()
	{
		System.out.println("anything");
	}
}

class Cow extends Animal
{
	void eat()
	{
		System.out.println("only Grass");
	}
	}
