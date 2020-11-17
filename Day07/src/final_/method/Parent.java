package final_.method;

/*
 - final 클래스는 자식을 가질 수 없고, 오직 외부에서
  객체 생성을 통해서만 사용할 수 있습니다.
  
 - 상속을 받아 메서드를 재 정의하는 등 클래스의 확장을 막기 위해
  클래스에 final을 붙입니다.
 */

public class Parent {
	
	void method1() {}
	void method2() {}
	final void method3() {}

}
