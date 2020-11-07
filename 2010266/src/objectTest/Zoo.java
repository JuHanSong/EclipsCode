package objectTest;

public class Zoo {
	
	public static void main(String[] args) {
		System.out.println("동물원에 오신것을 환영합니다.");
		
		Cat cat = new Cat();
		Pig pig = new Pig();
		Dog dog = new Dog();
		
		Ceo ceo = new Ceo();
		Seller seller = new Seller();
		Feeder feeder = new Feeder();
		James james = new James();
		
		
		Animal[] aarr = {cat, dog, pig};
		Employee[] earr = {ceo, feeder, seller};
		Object[] oarr = {cat, dog, pig, ceo, feeder, seller};
		ZooMember[] zarr = {cat, dog, pig, ceo, feeder, seller};
		
		
	}

}
