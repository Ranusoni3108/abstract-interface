package abstractClass;


abstract class Animal{
	 abstract void sound();
	 void bark() {} 
}


class Dog extends  Animal{
public void sound() {
	System.out.println("Dog is bark");
}
public void bark() {
	System.out.println("Dog is barking");
}
}


public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.bark();
	}

}
