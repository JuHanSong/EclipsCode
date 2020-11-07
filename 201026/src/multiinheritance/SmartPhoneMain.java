package multiinheritance;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone();
		Computer c1 = new Smartphone();
		TeleVision t1 = new Smartphone();
		
		s1.watchTV();
		s1.InterNet();
		
		c1.InterNet();
//		c1.watchTV(); (X)
		
		t1.watchTV();
//		t1.InterNe(); (X)
 		
		
		
	}

}
