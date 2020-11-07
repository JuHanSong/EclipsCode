package Overload;

public class OverloadClass {
	public void check() {
		System.out.println("입력받은 파라미터 없음");
		
	}
	
	public void check(int a) {
		System.out.println("정수 1개 입력받음");
		System.out.println(a+ "를 입력받음");
	}
	
	public void check(int a, int b) {
		System.out.println("정수 2개를 입력받음");
		System.out.println(a+","+b+"를 입력받음");
	}
}
