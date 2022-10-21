package polymorphism;

public class Poly {
       public void AnimalSound() {
    	   System.out.println("Dog Barks");
       }
}

class Bird extends Poly{
	public void AnimalSound() {
		System.out.println("Cow eats grass");
	}
}

class Id extends Poly{
	public void AnimalSound() {
		System.out.println("Lion roars");
	}
}

class Main{
	public static void main(String args[]) {
		Poly obj1=new Poly();
		Bird obj2 = new Bird();
		Id obj3 = new Id(); 
		
		obj1.AnimalSound();
		obj2.AnimalSound();
		obj3.AnimalSound();
		
	}
}
