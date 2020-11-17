package poly.param;

public class Driver {
	
//	public Sonata buySonata() {
//		System.out.println("소나타를 구입합니다.");
//		return new Morning();
//	}
	
	
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();
		} else if(name.equals("모닝")) {
			System.out.println("모닝을 구입합니다.");
			return new Morning();
		} else if(name.equals("스파크")) {
			System.out.println("스파크를 구입합니다.");
			return new Spark();
		} else {
			return null;
		}
	}

}















