package overloading;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 Calculator 클래스에 calcRectArea()메서드를
		  선언하여, 길이를 하나만 전달하면 정사각형의 넓이를,
		  길이를 두개 (가로, 세로) 전달하면 직사각형의 넓이를,
		  길이를 세 개 전달하면 사다리꼴의 넓이를 리턴하는 메서드를
		  오버로딩을 사용하여 선언해 보세요.
		  
		 MainClass에서 메서드 매개값을 다르게 주고
		  실제로 호출해 보세요.
		 */
		
		Calculator c = new Calculator();
		
		int result1 = c.calcRectArea(6);
		int result2 = c.calcRectArea(10, 20);
		int result3 = c.calcRectArea(5, 15, 7);
		
		System.out.println("정사각형: " + result1);
		System.out.println("직사각형: " + result2);
		System.out.println("사다리꼴: " + result3);

	}

}














