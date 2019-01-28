package JavaDemo2;

class Animal{
	
	public void sound(){
		System.out.println("animal sounds..");
	}
}


class Dog extends Animal{
	
	public void sound(){
		System.out.println("dog sounds..");
	}
}

class Cat extends Animal{
	
	public void sound(){
		
		System.out.println("cat sounds..");
	}
}

public class UpcastDowncastDemo {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.sound();
		
		Animal a2=new Dog();
		a2.sound();
		
		Animal a3=new Cat();
		a3.sound();
		
		

	}

}
