package modi.protec.pac2;

import modi.protec.pac1.A;

public class C extends A {
	
//	A a1 = new A(30); (x)
//	A a2 = new A(3.14); (x)
	
	public C() {
		
//		A a1 = new A(30); (x)
		
		/*
		 - protected제한자는 패키지가 다른 경우
		  두 클래스 사이에 상속 관계가 있다면 super키워드를
		  통해 참조를 허용합니다.
		 */
		super(30);
		super.x = 1;
		super.method1();
		
//		super.y = 2; (x)
//		super.method2(); p.f (x)
		
		
		
		
		
	}

}










