class Animal{}
class Mammal extends Animal{}
class Reptile extends Animal{}

public class InstanceOfConcept extends Mammal{

	public static void main(String[] args) {
		Animal a = new Animal();
		Mammal m =new Mammal();
		InstanceOfConcept ioc = new InstanceOfConcept();
		
		System.out.println(m instanceof Animal);
		System.out.println(ioc instanceof Mammal);
		System.out.println(ioc instanceof Animal);

	}

}
