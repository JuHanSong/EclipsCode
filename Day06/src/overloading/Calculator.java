package overloading;

public class Calculator {

	/*
	 # 오버로딩: 하나의 클래스 내부에서 같은 이름을 가진 메서드나
	  생성자를 여러 개 선언할 수 있게 해주는 문법.
	  
	 - 오버로딩 적용 조건
	 1. 매개변수의 데이터 타입이 다를 것 or
	 2. 매개변수의 전달 순서가 다를 것 or
	 3. 매개변수의 갯수가 다를 것.
	 */
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (x) - 정수 매개값을 1개 받는 메서드가 이미 선언됨.
	
//	int inputData(int number) {
//		return 0;
//	} return타입은 중복 선언에 영향을 미치지 않습니다.
	
	int calcRectArea(int len) {
		return len * len;
	}
	
	int calcRectArea(int width, int height) {
		return width * height;
	}
	
	int calcRectArea(int ceil, int floor, int height) {
		return (ceil + floor) * height / 2;
	}
	
	
	
	
	
	
	
	
	
	
}


















