package firstInterFace;

public class PolymorphismMain {
	
	public static void main(String[] args) {
		Mermaid m1 = new Mermaid();
		fish f1 = new fish();
		Tutle t1 = new Tutle();
		
		Aquatic[] aquaArr = {m1, f1, t1};
		
		for(Aquatic aqua: aquaArr) {
			aqua.swimming();
			aqua.breathUnderWater();
		}
		
	}

}
