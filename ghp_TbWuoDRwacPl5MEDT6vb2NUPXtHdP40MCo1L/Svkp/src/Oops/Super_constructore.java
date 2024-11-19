package Oops;

class Animal7
{
	Animal7()
	{
		System.out.println("Animal Constructore");
	}
}
class Dog7 extends Animal7
{
	Dog7()
	{
		super();
		System.out.println("Dog Constructore");
		
	}
}
public class Super_constructore {
	public static void main(String[] args) {
		Dog7 dog=new Dog7();
	}
}
