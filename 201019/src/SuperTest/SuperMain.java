package SuperTest;

public class SuperMain {
	
	public static void main(String[] args) {
		SupersonicAir a1 = 
				new SupersonicAir("초음속 비행기", 1500);
		
		SupersonicAir a2 = 
				new SupersonicAir("초음속 비행기2", 900);
		
		a1.fly();
		System.out.println();
		a2.fly();
		
	}

}
