package lab_file;


 abstract class Animal{
   abstract void sound();
	
	void eat() {
		System.out.println("dog is eating");
	}
}

class Dog extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("DOG IS BARKING.");
	}
	 
	 
}
public class simpleabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		d.sound();
	}

}

