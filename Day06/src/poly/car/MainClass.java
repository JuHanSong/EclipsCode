package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Morning m1 = new Morning();
		Morning m2 = new Morning();
		Morning m3 = new Morning();
		Morning m4 = new Morning();
		
		Spark k1 = new Spark();
		Spark k2 = new Spark();
		Spark k3 = new Spark();
		
//		s1.run();s2.run();s3.run();m1.run();m2.run();m3.run();m4.run();
//		k1.run();k2.run();k3.run();
		
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		Car[] cars = {s1,s2,s3,m1,m2,m3,m4,k1,k2,k3};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("--------------------------");
		
		Driver kim = new Driver();
		kim.drive(m1);
		kim.drive(k2);
		kim.drive(s3);
		
		s1.frontLeft = new Ntire();
		
		
		

	}

}

















