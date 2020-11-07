package Overload;

public class OverloadMain {
	
	public static void main(String[] args) {
		OverloadClass overloadClass = new OverloadClass();
		
		overloadClass.check();
		overloadClass.check(10);
		overloadClass.check(20, 30);
	}

}
