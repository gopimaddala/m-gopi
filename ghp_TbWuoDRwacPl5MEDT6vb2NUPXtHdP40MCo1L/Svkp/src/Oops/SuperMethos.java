package Oops;

class Animal5
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}
class Dog5 extends Animal5
{
	void makeSound()
	{
		super.makeSound();
		System.out.println("Dog Barks");
	}
}
public class SuperMethos {
	public static void main(String[] args) {
	  Dog5 dog=new Dog5();
	  dog.makeSound();
	 
			  
	}
}
